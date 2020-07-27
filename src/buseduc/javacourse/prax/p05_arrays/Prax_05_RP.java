package buseduc.javacourse.prax.p05_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Prax_05_RP {
    public static void main(String[] args) {

        /**
        * Практикум. Массивы
        */

        /**
         * Задание 1
         */
        int[] arr = {2, 4, 6, 8 };
        //правильный набор индексов a. 0, 1, 2, 3

        /**
         * Задание 2
         */

        int[] arr02 = {2, 4, 6, 8 };
        System.out.println( arr02[0] + " " + arr02[3] );

        /**
         * Задание 3
         */

        int[] y = new int[5];
        y[0] = 34;
        y[1] = 88;
        System.out.println( y[0] + " " + y[1] + " " + y[4] );

        /**
         * Задание 4
         */
        int[] y04 = {2, 4, 7};
        int l = y04.length;
        int last = --l;
        System.out.println(y04[last]);

        /**
         * Задание 5
         */
        double[] john = new double[ 3 ]; // age, weight, number of children
        john[0] = 33;
        john[1] = 100;
        double[] sam = john.clone();
        sam[1] = 125;
        sam[2] = 2;
        System.out.println(Arrays.toString(john));
        System.out.println(Arrays.toString(sam));

        /**
         * Задание 6
         */

       double[] currencyRates;

        /**
         * Задание 7
         */
        //Записать в него курсы валют CAD, CZK, TRY, RON
        double[] currencyRates07 = new double[22];
        currencyRates07[3] = 1.5336; //CAD
        currencyRates07[6] = 26.691; //CZK
        currencyRates07[15] = 4.8428; //RON
        currencyRates07[19] = 7.7417; //TRY
        System.out.println(Arrays.toString(currencyRates07));

        /**
         * Задание 8
         */

        double[] currencyRates2 = Arrays.copyOf(currencyRates07, 23);
        currencyRates2[21] = 19.0889; // VND
        System.out.println(Arrays.toString(currencyRates2));

        /**
         * Задание 9
         */

        String[] currencyNames = {"AED", "AUD", "BGN", "CAD", "CHF", "CNY", "CZK", "DKK", "GBP", "HKD",
                "HRK", "HUF", "JPY", "NOK", "PLN", "RON", "RUB", "SEK", "SGD", "TRY", "USD", "ZAR",
                "PHP", "DOP", "EGP"};
        Arrays.sort(currencyNames);
        System.out.println("Валюты в алфавитном порядке: " + "\n" + Arrays.toString(currencyNames));

        Arrays.sort(currencyNames, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return -1;
                if (o1.length() < o2.length()) return 1;
                return -1;
            }
        });
        //Arrays.sort(currencyNames, Collections.reverseOrder());
        System.out.println("Валюты в обратном алфавитном порядке: " + "\n" + Arrays.toString(currencyNames));

        /**
         * Задание 10
         */



        /**
         * Задание 11
         */

    }

}
