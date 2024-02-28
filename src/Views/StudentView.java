package Views;

// Представление студентов, реализующее отображение на консоль
import Models.Student;
import Models.UserView;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.getStudentID());
        }
    }
}