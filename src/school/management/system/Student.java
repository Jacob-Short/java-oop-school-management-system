package school.management.system;


/**
 * Created by Jacob on 12/24/2021.
 * This class is a responsible for keeping
 * track of students:
 * id, name, grade, fees / fees-paid
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // as soon a new keyword is used
    // constructor is called


    /**
     * To create a new student object by initializing values
     * Fees for every student is 30,000
     * Fees paid initially is 0
     *
     * @param id    id for the student: unique
     * @param grade grade for student
     * @param name  name for student
     */
    public Student(int id, int grade, String name) {
        feesPaid = 0;
        feesTotal = 30_000;
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    /**
     * Used to update the students grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid field
     * Add the fees to the fees paid
     * The school is going to receive the funds
     * @param fees fees the fees that the student pays
     */
    public void setFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    /**
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the total fees outstanding by the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
