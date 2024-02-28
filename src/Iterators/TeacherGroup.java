package Iterators;

// Группа учителей
// Соответствует принципу единственной ответственности, так как отвечает только за хранение и предоставление доступа к
// элементам группы учителей.

import Models.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teacherList);
    }
}
