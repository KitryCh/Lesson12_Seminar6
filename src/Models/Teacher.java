package Models;

// Модель учителя, расширяющая базовый класс User и реализующая сравнение
public class Teacher extends User implements Comparable<Teacher> {
    private Long teacherID;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public int compareTo(Teacher o) {
        // Реализация метода сравнения для сортировки учителей
        // Например, можно сравнивать по ФИО
        int lastNameComparison = this.getLastName().compareTo(o.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        int firstNameComparison = this.getFirstName().compareTo(o.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        return this.getMiddleName().compareTo(o.getMiddleName());
    }
}