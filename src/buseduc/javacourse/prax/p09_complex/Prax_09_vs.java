package buseduc.javacourse.prax.p09_complex;

import java.util.Arrays;
import java.util.Scanner;

public class Prax_09_vs {
    public static void main(String[] args) {

        /**
        * Практикум. Итог
        */

        /**
         * Задание 1
         */

        /**
         * Задание 2
         */

        /**
         * Задание 3
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int arrLen = sc.nextInt();
        int[] array = new int[arrLen];
        long sum = 0;
        for(int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            sum += array[i];
        }
        double avg = (double) sum / arrLen;
        System.out.println(Arrays.toString(array));
        System.out.println("AVG: " + avg);
        for (int nx: array) {
            if(nx < avg) {
                System.out.print(nx);
                System.out.print(", ");
            }

        }



        /**
         * Задание 4
         */

        /**
         * Задание 5
         */

        /**
         * Задание 6
         */

        /**
         * Задание 7
         */

        /**
         * Задание 8
         */


    }

}
