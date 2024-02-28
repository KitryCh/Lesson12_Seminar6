package Services;

// Сервис для управления группой студентов
// 1. Отвечает только за выполнение операций, связанных с управлением группами, что соответствует принципу единственной
// ответственности.
// 2. Классы оперируют абстракциями групп студентов, что соответствует принципу инверсии зависимостей.
import Iterators.StudentGroup;
import Models.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    // Удаление студента по ФИО
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    // Получение отсортированного списка студентов
    public List<Student> getSortedStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(null); // Сортировка использует compareTo из Student
        return studentList;
    }

    // Создание студента
    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}