package buseduc.javacourse.prax.p05_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prax_08_RP {
    public static void main(String[] args) {

        /**
        * Практикум. Ввод вывод
        */

        /**
         * Задание 1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String userInput = scanner.nextLine();
        System.out.println("=> " + userInput + "\n" + "Hello " + userInput);

        /**
         * Задание 2
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = sc.nextLine();
        char[] symbols = name.toCharArray();
        for (char sym: symbols) {
            if (!Character.isAlphabetic(sym)) {
                System.out.println("Incorrect name!");
                return;
            }
        }

        /**
         * Задание 3
         */
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Input number");
                int next = scanner.nextInt();
                System.out.println(next);
        } catch (Exception e) {
                System.out.println("Good bye!");
                break;
            }
    }

}
}