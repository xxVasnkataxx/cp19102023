import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class GradeManager {
    private ArrayList<student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        student student = new student(name, grade);
        students.add(student);
    }

    public void showStudents() {
        for (student student : students) {
            System.out.println("Име: " + student.getName() + ", Оценка: " + student.getGrade());
        }
    }

    public double calculateAverageGrade() {
        double totalGrade = 0;
        for (student student : students) {
            totalGrade += student.getGrade();
        }
        return totalGrade / students.size();
    }
}

public class two {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Искате ли да добавите ученик? (да/не): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("да")) {
                break;
            }

            System.out.print("Въведете името на ученика: ");
            String name = scanner.next();
            System.out.print("Въведете оценката на ученика: ");
            double grade = scanner.nextDouble();

            gradeManager.addStudent(name, grade);
        }

        System.out.println("\nСписък на учениците и техните оценки:");
        gradeManager.showStudents();

        double averageGrade = gradeManager.calculateAverageGrade();
        System.out.println("\nСреден успех на всички ученици: " + averageGrade);
    }
}
