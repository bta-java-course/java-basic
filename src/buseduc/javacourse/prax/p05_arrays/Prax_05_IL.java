package buseduc.javacourse.prax.p05_arrays;

import java.util.Arrays;
import java.util.Date;

public class Prax_05_IL {
    public static void main(String[] args) {



        /**
        * Практикум. Массивы


        */

        /**
         * Задание 1
         */

        System.out.println("Task 1: ");
        System.out.println("ответ а");

        /**
         * Задание 2
         */
        System.out.println("task 2: ");
        int[] arr = {2, 4, 6, 8 };
        System.out.println( arr[0] + " " + arr[3] );




        /**
        * Задание 3
         * */

       int[] y = new int[5];
       y[0] = 34;
       y[1] = 88;
       System.out.println( y[0] + " " + y[1] + " " + y[4] );



        /**
         * Задание 4
         */

        int[] p = {2, 4, 7};
        int l = p.length;
        int last = --l;
        System.out.println(p[last]);


        /**
         * Задание 5
         */
        System.out.println("task 5: ");



        double[] john = new double[ 3 ]; // age, weight, number of children
        john[0] = 33;
        double[] sam = john.clone();
        john[1] = 100;
        sam[2] = 2;



        /**
         * Задание 6

        System.out.println("Task 6: ");
        double[] currencyRates;
        */








        /**
         * Задание 7

        System.out.println("Task 7: ");
        double[] currencyRates = new double[21];
        currencyRates[18] = 8.00000;
        currencyRates[19] = 1.56300;
        currencyRates[20] = 27.10865;
        currencyRates[21] = 4.96450;
         */


        /**
         * Задание 8
         */
        System.out.println("Task 8: ");
        double[] currencyRates = new double[23];
        currencyRates[18] = 8.00000;
        currencyRates[19] = 1.56300;
        currencyRates[20] = 27.10865;
        currencyRates[21] = 4.96450;
        currencyRates[22] = 31544.0000;
        System.out.println("VND - " + currencyRates[22]);


        /**
         * Задание 9
         */
        System.out.println("Task 9: ");
        String[] currencyNames = {"AED ", "AUD","BGN"  , "CAD" , "CHF", "CNY", "CZK"
                , "DKK",  "GBP", "HKD", "HRK", "HUF", "JPY", "NOK", "PLN"
                , "RON", "RUB", "SEK", "SGD", "TRY", "USD", "ZAR" , "BRL"
                , "EEK", "DOP"};
        Arrays.sort(currencyNames);
        System.out.println(Arrays.toString(currencyNames));






        /**
         * Задание 10
         */



        /**
         * Задание 11
         */

    }

}
