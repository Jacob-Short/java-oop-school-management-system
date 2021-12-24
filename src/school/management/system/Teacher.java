package school.management.system;

/**
 * Created by Jacob on 12/24/2021.
 * This class is a responsible for keeping
 * track of teachers:
 * id, name, salary
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;


    /**
     * To create a new teacher object by initializing values
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @return the id of the current teacher
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name of the current teacher
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary of the current teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the salary of the current teacher
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
