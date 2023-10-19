import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
//zadacha 1
public class chisla1 {
    public static void chisla1(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Добавяне на число");
            System.out.println("2. Извеждане на всички числа");
            System.out.println("3. Най-голямо число");
            System.out.println("4. Най-малко число");
            System.out.println("5. Изход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Въведете число: ");
                    int num = scanner.nextInt();
                    numbers.add(num);
                    System.out.println("Числото " + num + " беше добавено към списъка.");
                    break;
                case 2:
                    if (numbers.isEmpty()) {
                        System.out.println("Списъкът е празен.");
                    } else {
                        System.out.println("Списъкът с числа: " + numbers);
                    }
                    break;
                case 3:
                    if (numbers.isEmpty()) {
                        System.out.println("Списъкът е празен.");
                    } else {
                        int max = Collections.max(numbers);
                        System.out.println("Най-голямото число в списъка е: " + max);
                    }
                    break;
                case 4:
                    if (numbers.isEmpty()) {
                        System.out.println("Списъкът е празен.");
                    } else {
                        int min = Collections.min(numbers);
                        System.out.println("Най-малкото число в списъка е: " + min);
                    }
                    break;
                case 5:
                    System.out.println("Благодарим, че използвахте програмата.");
                    System.exit(0);
                default:
                    System.out.println("Невалиден избор. Моля, опитайте отново.");
            }
        }
    }
}
