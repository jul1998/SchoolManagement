import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1,"Lizzy", 500);
        Teacher Melizza = new Teacher(2,"Melizza", 700);
        Teacher Juan = new Teacher(3,"Juan", 1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melizza);
        teacherList.add(Juan);

        Student Ama = new Student(1, "Ama", 8);
        Student Jul = new Student(2, "Jul", 7);
        Student Pablo = new Student(3, "Pablo", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Ama);
        studentList.add(Jul);
        studentList.add(Pablo);

        School ghs = new School(teacherList,studentList);
        System.out.println(ghs.getTotalMoneyEarned());

        Ama.updateFeesPaid(5000);
        Jul.updateFeesPaid(8000);
        System.out.println("Ghs school has made " + ghs.getTotalMoneyEarned());

        System.out.println("----------Teacher Salary------------");

        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("GHS has spent for salary to" + Lizzy.getName() +
                " and now has " + ghs.getTotalMoneyEarned());

        Melizza.receiveSalary(Melizza.getSalary());
        System.out.println("GHS has spent for salary to" + Melizza.getName() +
                " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(Jul);
        System.out.println(Lizzy);

    }
}
