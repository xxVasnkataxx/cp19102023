import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class student {
    private String name;
    private double grade;

    public student(String name, double grade) {
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

class StudentManager {
    private List<student> students = new ArrayList<>();

    public void addStudent(student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Ученици и техните оценки:");
        for (student student : students) {
            System.out.println(student.getName() + " - " + student.getGrade());
        }
    }

    public double calculateAverageGrade() {
        double total = 0;
        for (student student : students) {
            total += student.getGrade();
        }
        return total / students.size();
    }
}

public class four {
    public static void four(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Добави ученик");
            System.out.println("2. Покажи ученици и оценки");
            System.out.println("3. Изчисли среден успех");
            System.out.println("4. Изход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Въведете име на ученика: ");
                    String name = scanner.nextLine();
                    System.out.print("Въведете оценка на ученика: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();

                    student student = new student(name, grade);
                    manager.addStudent(student);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    double averageGrade = manager.calculateAverageGrade();
                    System.out.println("Среден успех на учениците: " + averageGrade);
                    break;
                case 4:
                    System.out.println("Излизане от програмата.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Грешен избор. Моля, изберете отново.");
            }
        }
    }
}
