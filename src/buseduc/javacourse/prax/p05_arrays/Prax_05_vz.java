package buseduc.javacourse.prax.p05_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Prax_05_vz {
    public static void main(String[] args) {

        /**
        * Практикум. Массивы
        */

        /**
         * Задание 1
         *
         * Ответ: а
         */

        /**
         * Задание 2
         */

        System.out.println("Task 2:");
        int[] arr = {2, 4, 6, 8 };
        System.out.println( arr[0] + " " + arr[3] );

        /**
         * Задание 3
         */

        System.out.println("Task 3:");
        int[] y3 = new int[5];
        y3[0] = 34;
        y3[1] = 88;
        System.out.println(y3[0] + " " + y3[1] + " " + y3[4]);


        /**
         * Задание 4
         */

        System.out.println("Task 5:");
        int[] y4 = {2, 4, 7};
        int l = y4.length;
        int last = --l;
        System.out.println(y4[last]);

        /**
         * Задание 5
         */

        double[] john = new double[3]; // age, weight, number of children
        john[0] = 33;
        john[1] = 100;
        double[] sam = john.clone();
        sam[1] = 50;
        sam[2] = 2;

        System.out.println(Arrays.toString(john));
        System.out.println(Arrays.toString(sam));

        /**
         * Задание 6
         */

        System.out.println("Task 6:");
//        double[] currencyRates;

        /**
         * Задание 7
         */

        System.out.println("Task 7:");
//        double[] currencyRates = new double [21];
//        currencyRates[3] = 1.53180;
//        currencyRates[6]=  26.80800;
//        currencyRates[19]= 7.68650;
//        currencyRates[15]= 4.84260;

        /**
         * Задание 8
         */

        System.out.println("Task: 8");
        double[] currencyRates = new double [22];
        currencyRates[3] = 1.53240;
        currencyRates[6]=  26.74000;
        currencyRates[19]= 7.67610;
        currencyRates[15]= 4.83970;
        currencyRates[21]= 24549.0000;

        /**
         * Задание 9
         */

        System.out.println("Task 9:");
        String[] currencyNames = {"AED", "AUD" ,"BGN", "CAD", "CHF", "CNY", "CZK" , "DKK", "GBP", "HKD", "HRK", "HUF",
                "JPY", "NOK", "PLN", "RON", "RUB", "SEK", "SGD", "TRY", "USD", "ZAR" , "VND", "EEK", "BYN"};

        Arrays.sort(currencyNames);
        System.out.println(Arrays.toString(currencyNames));

        Arrays.sort(currencyNames, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return -1;
                if (o1.length() < o2.length()) return 1;
                return -1;
            } });
        System.out.println(Arrays.toString(currencyNames));

        /**
         * Задание 10
         */

        /**
         * Задание 11
         */

    }
}
