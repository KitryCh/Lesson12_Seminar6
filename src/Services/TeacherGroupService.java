package Services;

// Сервис для управления группой учителей
// 1. Отвечает только за выполнение операций, связанных с управлением группами, что соответствует принципу единственной
// ответственности.
// 2. Классы оперируют абстракциями групп учителей, что соответствует принципу инверсии зависимостей.

import Iterators.TeacherGroup;
import Models.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    // Удаление учителя по ФИО
    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    // Получение отсортированного списка учителей
    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(null); // Сортировка использует compareTo из Teacher
        return teacherList;
    }

    // Создание учителя
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createTeacher(firstName, lastName, middleName);
    }
}
