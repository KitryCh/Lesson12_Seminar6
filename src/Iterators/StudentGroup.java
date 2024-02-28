package Iterators;

// Группа студентов
// Соответствует принципу единственной ответственности, так как отвечает только за хранение и предоставление доступа к
// элементам группы студентов.
import Models.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList = new ArrayList<>();

    // Добавление студента в группу
    public void createStudent(String firstName, String lastName, String middleName) {
        studentList.add(new Student(firstName, lastName, middleName));
    }

    // Получение списка студентов
    public List<Student> getStudentList() {
        return studentList;
    }

    // Итератор для группы студентов
    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
}
