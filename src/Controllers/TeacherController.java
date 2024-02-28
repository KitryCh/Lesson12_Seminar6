package Controllers;

// Контроллер учителей, реализующий UserController для управления учителями
// 1. Соответствует принципу единственной ответственности (Single Responsibility Principle), т.к. классы имеют только
// одну причину для изменения - управление учителями.
// 2. Классы не зависят от конкретных реализаций учителей, а оперируют абстракциями, что соответствует
// принципу инверсии зависимостей (Dependency Inversion Principle).
import Models.Teacher;
import Models.UserController;
import Services.TeacherGroupService;
import Views.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();

    // Удаление учителя по ФИО
    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        teacherGroupService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    // Получение и отображение отсортированного списка учителей
    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherGroupService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    // Создание учителя
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherGroupService.createTeacher(firstName, lastName, middleName);
    }
}