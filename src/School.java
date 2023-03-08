import java.util.List;

/**
 * Implement teachers and students using an ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpend = 0;
    }


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneySpend(int moneySpend) {
        totalMoneyEarned -= moneySpend;
    }
}
