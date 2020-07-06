package buseduc.javacourse.prax.p08_io;

import java.util.Scanner;

public class Prax_08_pr {
    public static void main(String[] args) {

        /**
        * Практикум. Ввод вывод
        */



        /**
         * Задание 1
         */
        System.out.println( " Task1 " );

        System.out.println( " Input your name " );
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        /**
         * Задание 2
         */

        System.out.println( " input y " );
        Scanner scanner2 = new Scanner(System.in);
        String userInput2 = scanner2.nextLine();
        int len2=userInput2.length();
        System.out.println("You have entered: " + userInput2);
        for ( int i2 = 0; i2 < len2 ; i2++)
        {char c = userInput2.charAt(i2);

            if (Character.isAlphabetic(c))    ;
            else  System.out.println(" Incorrect name! ");



        }

        /**
         * Задание 3
         */
        Scanner scanner3 = new Scanner(System.in);

        System.out.println(" Task3  ");
         while(true){
             try {
                System.out.println("Input number");

                int next=scanner3.nextInt();

                System.out.println(next);

             } catch (Exception e) {System.out.println( " g b" ); break;
             }


         }
    }

}
