package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implement teachers and students using
 * ArrayList
 * Created by Jacob on 12/24
 */
public class School {

    private List<Student> students;
    private List<Teacher> teachers;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object created
     *
     * @param students list of students in school
     * @param teachers list of teachers in school
     */
    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return a list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to the school
     *
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return a list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     *
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which is the
     * salary given by the school to its teachers
     *
     * @param moneySpent moneySpent the money spent by the school
     */
    public void setTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}
