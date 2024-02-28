package Models;

// Модель студента, расширяющая базовый класс User и реализующая сравнение
public class Student extends User implements Comparable<Student> {
    private Long studentID;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }
}