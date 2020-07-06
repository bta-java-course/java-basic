package buseduc.javacourse.prax.p06_loops;

import java.util.Arrays;

public class Prax_06_vz {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Практикум. Циклы
         */

        /**
         * Задание 1
         */

        System.out.println("Task 1:");
        for ( int i = 1; i <= 10; i++ ) {
            System.out.println(i);
        }

        /**
         * Задание 2
         */

        System.out.println("Task 2:");
        int n2 = 3;
        for ( int i = 1; i <= n2; i++ ) {
            System.out.println(i);
        }

        /**
         * Задание 3
         */

        System.out.println("Task 3:");
        int n3 = 3;
        for ( int i = n3; i > 0; i-- ) {
            System.out.println(i);
        }

        /**
         * Задание 4
         */

        System.out.println("Task 4:");
        double rand1;
        int numCount = 20;
        double sum = 0;
        for ( int i = 0; i < numCount; i++ ) {
            rand1 = Math.random() * 10;
            System.out.println(rand1);
            sum += rand1;
        }
        System.out.println("Average: " + sum / numCount);

        /**
         * Задание 5
         */

        System.out.println("Task 5:");
//        int sec = 1;
//        while (true) {
//            if (sec > 60) {
//                sec = 1;
//            }
//            System.out.println(sec++);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//        }


        /**
         * Задание 6
         */

        System.out.println("Task 6:");
            int n6 = 5;
            for (int i = 0; i <= n6; i++){
                System.out.println(n6 + " x " + i + " = " + n6 * i);
            }

            /**
             * Задание 7
             */
        System.out.println("Task 7:");
        int n7 = 2;
        for (int i = 0; i <= n7; i++){
            for(int y = 0; y <= n7; y++)
            System.out.println(i + " x " + y + " = " + i * y);
        }

        /**
         * Задание 8
         */
        System.out.println("Task: 8");
        int n8=10;
        for (int i = 1; i < n8+1 ; i++)
        {
            for (int j = 1; j < n8+1 ; j++)
            {
                System.out.print(j);
                if (j > i -1)
                break;
            }
            System.out.print("\n");
        }

        /**
         * Задание 9
         */
        System.out.println("Task: 9");
        int n9 = 10;
        for ( int i = 1; i <= n9; i++ ) {
            for ( int j = 1; j <= n9 - i; j++ )
                System.out.print(" ");
            for ( int k = 1; k <= 2 * i - 1; k++ )
                System.out.print("@");
            System.out.print("\n");
        }

        /**
         * Задание 10
         */
        System.out.println("Task 10: ");
        String[] words = {"семеро", "с", "ложкой", "один", "с", "сошкой"};
        for ( int i = words.length - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++ ) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
        for ( int i = 0; i < words.length; i++ ) {
            System.out.println(words[i]);
        }

            /**
             * Задание 11
             */

            /**
             * Задание 12
             */

        }
    }
