import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Добави дума");
            System.out.println("2. Извеждане на всички думи");
            System.out.println("3. Проверка на дума");
            System.out.println("4. Изход");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Празни ред след въвеждането на опцията

            switch (choice) {
                case 1:
                    System.out.print("Въведете дума: ");
                    String word = scanner.nextLine();
                    wordList.add(word);
                    System.out.println("Думата е добавена към списъка.");
                    break;
                case 2:
                    System.out.println("Списък с думи:");
                    for (String w : wordList) {
                        System.out.println(w);
                    }
                    break;
                case 3:
                    System.out.print("Въведете дума за проверка: ");
                    String searchWord = scanner.nextLine();
                    if (wordList.contains(searchWord)) {
                        System.out.println("Думата се среща в списъка.");
                    } else {
                        System.out.println("Думата не се среща в списъка.");
                    }
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
