package buseduc.javacourse.prax.p08_io;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prax_08_vz {
    public static void main(String[] args) {

        /**
         * Практикум. Ввод вывод
         */

        /**
         * Задание 1
         */

        System.out.println("Task 1:");
        Scanner scanner1 = new Scanner(System.in);
        String userInput1 = scanner1.nextLine();
        System.out.println("Hello " + userInput1 + "!");

        /**
         * Задание 2
         */

        System.out.println("Task 2:");
        Scanner scanner2 = new Scanner(System.in);
        String userInput2 = scanner2.nextLine();
        char[] symbols = userInput2.toCharArray();
        for ( char symbol : symbols ) {
            if (!Character.isAlphabetic(symbol)) {
                System.out.println("Incorrect name!");
                return;
            }
        }
        System.out.println("Hello " + userInput2 + "!");

        /**
         * Задание 3
         */

        System.out.println("Task 3:");
        Scanner scanner3 = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input number");
                int userInput3 = scanner3.nextInt();
                System.out.println("==>" + userInput3);
            } catch (Exception e) {
                System.out.println("Good bye!");
                break;
            }
        }
    }
}
