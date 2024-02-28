package Controllers;

// Контроллер студентов, реализующий UserController для управления студентами.
// 1. Соответствует принципу единственной ответственности (Single Responsibility Principle), т.к. классы имеют только
// одну причину для изменения - управление студентами.
// 2. Классы не зависят от конкретных реализаций студентов, а оперируют абстракциями, что соответствует
// принципу инверсии зависимостей (Dependency Inversion Principle).

import Models.Student;
import Models.UserController;
import Services.StudentGroupService;
import Views.StudentView;

import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    // Удаление студента по ФИО
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    // Получение и отображение отсортированного списка студентов
    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    // Создание студента
    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}