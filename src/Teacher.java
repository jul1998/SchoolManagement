/**
 * This class is responsible for keeping
 * track of theacher's name, id, and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new teacher object
     * @param id for the teacher
     * @param name of the  teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to salary
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        this.salaryEarned += salary;
        School.updateTotalMoneySpend(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name + ". Total Salary is:"
                + salary;
    }
}
