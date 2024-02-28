package Iterators;

// Итератор для группы студентов
// 1. Cоответствует принципу единственной ответственности, так как отвечают только за итерацию по элементам коллекции.
// 2. Классы не зависят от конкретных реализаций студентов, что соответствует принципу инверсии зависимостей.
import Models.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int currentIndex = 0;
    private final List<Student> studentList;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentList.get(currentIndex++);
    }

    @Override
    public void remove() {
        studentList.remove(currentIndex);
    }
}