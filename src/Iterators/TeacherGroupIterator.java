package Iterators;

// Итератор для группы учителей
// 1. Cоответствует принципу единственной ответственности, так как отвечают только за итерацию по элементам коллекции.
// 2. Классы не зависят от конкретных реализаций учителей, что соответствует принципу инверсии зависимостей.

import Models.Teacher;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int currentIndex = 0;
    private final List<Teacher> teacherList;

    public TeacherGroupIterator(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        return teacherList.get(currentIndex++);
    }

    @Override
    public void remove() {
        teacherList.remove(currentIndex);
    }
}
