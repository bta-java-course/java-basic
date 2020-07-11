package buseduc.javacourse.prax.p08_io;

import java.util.Scanner;

public class Prax_08_IL {
    public static void main(String[] args) {

        /**
        * Практикум. Ввод вывод
        */

        /**
         * Задание 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name here: ");
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput);
        */


        /**
         * Задание 2

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char[] symbols = name.toCharArray();
        for (char sym: symbols) {
            if(!Character.isAlphabetic(symbols[sym])){
                System.out.println("Incorrect name!");
                return;
            }

        }

        System.out.println("Input your name here: ");
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput);

         */



        /**
         * Задание 3
         */
        while(true){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Input num: ");
                int next = scanner.nextInt();
                System.out.println("next");
            }catch (Exception e) {
                System.out.println("goodbye");
                return;
            }

        }




    }

}
