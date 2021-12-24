package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacob on 12/24/2021
 */
public class Main {

    public static void main(String[] args) {
        Teacher stephen = new Teacher(1, "Stephen", 500);
        Teacher samantha = new Teacher(2, "Samantha", 600);
        Teacher brian = new Teacher(3, "Brian", 500);
        Teacher jessica = new Teacher(4, "Jessica", 600);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(stephen);
        teacherList.add(samantha);
        teacherList.add(jessica);
        teacherList.add(brian);


        Student katie = new Student(1, 16, "Katie");
        Student jacob = new Student(2, 14, "Jacob");

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(katie);
        studentsList.add(jacob);


        School loveSchool = new School(studentsList, teacherList);


        System.out.println(loveSchool.getTotalMoneyEarned());
        System.out.println(loveSchool.getTotalMoneySpent());
        List<Teacher> teachers = loveSchool.getTeachers();

        for (Teacher teacher: teachers) {
            System.out.println(teacher.getName());
        }


    }
}
