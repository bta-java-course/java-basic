package buseduc.javacourse.prax.p05_arrays;


import java.util.Arrays;
import java.util.Collections;

public class Prax_05_pr {
    public static void main(String[] args) {

        /**
        * Практикум. Массивы
        */

        /**
         * Задание 1
         */
        System.out.println(" Task 1");
        System.out.println(" Correct order of the indices is");
        System.out.println(" a. 0, 1, 2, 3 ");
        int[] arr1 = {2, 4, 6, 8 };
        for (int i1 = 0; i1 < 4; i1++) {
            System.out.println( " i1=" +   i1 + " " +  arr1[i1]);
        }

        /**
         * Задание 2
         */
        System.out.println(" Task 2");



        int[] arr2 = {2, 4, 6, 8 };
        System.out.println( arr2[0] + " " + arr2[3] );
        /**
         * Задание 3
         */

        System.out.println(" Task 3");




        int[] y = new int[5];
        y[0] = 34;
        y[1] = 88;
        System.out.println( y[0] + " " + y[1] + " " + y[4] );
        /**
         * Задание 4
         */
        System.out.println(" Task 4");
        int[] y44 = {2, 4, 7};

        int l=y44.length;
        l--;


        System.out.println(  y44[l] );
        /**
         * Задание 5
         */
        System.out.println(" Task 5");


        double[] john = new double[ 3 ]; // age, weight, number of children
        john[0] = 33;
        john[1] = 100;
        double[] sam = new double[ 3 ];
        sam [0]=john[0];
        sam[2] = 2;

        System.out.println(" John's age is "+ (byte) john[0] +" and  age of Sam is also " +  (byte) sam[0] +   ".");

        /**
         * Задание 6
         */
        System.out.println(" Task 6");

        float[] CR6;
        /**
         * Задание 7
         */

        System.out.println(" Task 7");


        double[] CR7 =  new double[ 21 ];
        CR7[3]=  1.53180;

        System.out.format(" CAD "  + " %-10.5f%n ", CR7[3]) ;

        CR7[6]=  26.80800;

        System.out.format(" CZK "  + " %-10.5f%n ", CR7[6]) ;

        CR7[19]= 7.68650;
        System.out.format( " TRY "  + " %-10.5f%n ", CR7[19]) ;

        CR7[15]= 4.84260;
        System.out.format( " RON "  + " %-10.5f%n ", CR7[15]) ;
        /**
         * Задание 8
         */
        System.out.println(" Task 8");

        double[] CR8 =  new double[ 22 ];



        CR8[3]=  1.53180;
        //   System.out.println(" CAD " +   CR8[3] );
        System.out.format(" CAD "  + " %-10.5f%n ", CR8[3]) ;

        CR8[6]=  26.80800;
        //   System.out.println(" CZK " +  CR7[6] );
        System.out.format(" CZK "  + " %-10.5f%n ", CR8[6]) ;

        CR8[19]= 7.68650;
        System.out.format( " TRY "  + " %-10.5f%n ", CR8[19]) ;

        CR8[15]= 4.84260;
        System.out.format( " RON "  + " %-10.5f%n ", CR8[15]) ;


        CR8[21]= 24580.0000;
        System.out.format( " VND "  + " %-10.5f%n ", CR8[21]) ;

        /**
         * Задание 9
         */

        System.out.println(" Task 9");

        String[] CN9 = {"AED ", "AUD","BGN"  , "CAD" , "CHF", "CNY", "CZK"
                , "DKK",  "GBP", "HKD", "HRK", "HUF", "JPY", "NOK", "PLN"
                , "RON", "RUB", "SEK", "SGD", "TRY", "USD", "ZAR" , "Brl"
                , "Eek", "Dop"};

        Arrays.sort(CN9);

        for (int i9 = 0; i9 < 25; i9++) {
            System.out.println( " i=" +   i9 + " " +  CN9[i9]);
        }

        System.out.println(Arrays.toString(CN9));

             //   System.out.println(" Task ");

        Arrays.sort(CN9, Collections.reverseOrder());

        System.out.println(Arrays.toString(CN9));
        /**
         * Задание 10
         */
        System.out.println(" Task 10*");
        System.out.println(" Currency rates in alphabet order");
        double[] arrrr1 = {4.11800, 1.64060 , 1.95580, 1.54090, 1.06690, 7.98410, 26.84800,
                7.45310, 0.91540 , 8.74560, 7.56900, 356.30000, 121.07000, 10.90130,
                4.46640, 4.84400 , 78.91690, 10.47800, 1.57080, 7.73510, 1.12840, 19.42620, 8.2677
                , 16.1218
                , 60.0454
        };

        double[] arrrr = arrrr1.clone();

        String[] CN11={"AED ", "AUD","BGN"  , "CAD" , "CHF", "CNY", "CZK"
                , "DKK",  "GBP", "HKD", "HRK", "HUF", "JPY", "NOK", "PLN"
                , "RON", "RUB", "SEK", "SGD", "TRY", "USD", "ZAR" , "Brl"
                , "Eek", "Dop"};

        String[] CN11c = CN11.clone();

        Arrays.sort(CN11);

        for (int i10 = 0; i10 < 25; i10++)           {

            for (int icl = 0; icl < 25; icl++)  {
                if (CN11c[icl].equals(CN11[i10])) {System.out.format( CN11c[icl]  + "   " + "%-10.5f%n ", arrrr1[icl]);
                    break;
                }
            }
        }

        System.out.println(" Currency rates in ascending order");


        Arrays.sort(arrrr1);

        for (int i100 = 0; i100 < 25; i100++)           {

            for (int icl1 = 0; icl1 < 25; icl1++)  {
                if (arrrr[icl1] == (arrrr1[i100])) {System.out.println(CN11c[icl1] +" "+  arrrr[icl1]);
                    break;
                }
            } 	 }

    }

}
