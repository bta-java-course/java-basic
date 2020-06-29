package buseduc.javacourse.prax.p03_logic;

import java.util.Arrays;
import java.util.Collections;



public class Prax_03_ {
    public static void main(String[] args) {


        /**
         * ?????????. 3  Logical operations
         */

        /**
         * ??????? 1
         */
        System.out.println("Task1 ");

        boolean iAmStudent1 = false;     // ? ???????
        boolean iLoveMath1 = true ;      // ? ????? ??????????
        boolean result1;         // ?????

        result1= ! iAmStudent1 ;
        System.out.println(result1);

        result1= iLoveMath1 ;
        System.out.println(result1);

        result1= (!iAmStudent1) && iLoveMath1;
        System.out.println(result1);

        /**
         * ??????? 2
         */

        System.out.println("Task2 ");

        boolean iAmStudent2 = false;     // ? ???????
        boolean iLoveMath2 = true ;      // ? ????? ??????????
        boolean result2;         // ?????

        result2=!iAmStudent2 || !iLoveMath2;
        System.out.println(result2);

        result2= iAmStudent2 && !iLoveMath2  ||  !iAmStudent2;
        System.out.println(result2);

        result2= iLoveMath2 && !iAmStudent2 || iAmStudent2;
        System.out.println(result2);

        /**
         * ??????? 3
         */
        System.out.println("Task3 ");

        int x3 = 5;
        int y3 = 7;
        boolean z3 = x3 < y3;
        System.out.println(z3);

        /**
         * ??????? 4
         */
        System.out.println("Task4 ");

        int a4 = 0b100;
        int b4 = 4;
        boolean c4 = (a4 >= b4);
        System.out.println(c4);

        /**
         * ??????? 5
         */
        System.out.println("Task5 ");

        boolean a5 = true;
        boolean b5 = false;
        a5 &= b5;
        a5 |= !b5;

        System.out.println(a5);
        System.out.println(b5);

       
        System.out.println("Task6 ");
        System.out.println("Task6 p.1 ");

        boolean m6=true;
        boolean t6=false;
        boolean a6=false;
        boolean r61=m6 & !t6 & !a6;
        System.out.println(r61);

        System.out.println("Task6 p.2 ");

        m6=true;
        t6=false;
        a6=true;
        boolean r62=(m6 | a6) & !t6;
        System.out.println(r62);

        System.out.println("Task6 p.3 ");

        m6=true;
        t6=true;
        a6=false;
        boolean r63=(m6 & t6) & !a6;
        System.out.println(r63);

        System.out.println("Task6 p.4 ");

        m6=true;
        t6=false;
        a6=false;
        boolean r64=m6 || a6 || t6;
        System.out.println(r64);

        System.out.println("Task6 p.5 ");

        m6=true;
        t6=false;
        a6=true;
        boolean r65=m6 && a6 && t6;
        System.out.println(r65);

        System.out.println("Task6 p.6 ");

        m6=false;
        t6=true;
        a6=true;
        r65=t6 && ((a6 && !m6) || m6);
        System.out.println(r65);

        /**
         * ??????? 7
         */
        System.out.println("Task7 ");

        int rand = (int) (Math.random() * 2);
        boolean a = rand == 0;
        boolean result = !a && 2 / rand > 1;
        System.out.println(result);
        /**
         * ??????? 8
         */
        System.out.println("Task8 ");

        boolean isTrustedDriver = true;
        boolean isTooYoung = true;
        boolean hasChildren = true;
        boolean canDrive = isTrustedDriver && hasChildren || isTrustedDriver && !hasChildren || isTrustedDriver && !isTooYoung;
        System.out.println(canDrive);

        canDrive = isTrustedDriver && !isTooYoung; //  "isTrustedDriver && hasChildren || isTrustedDriver && !hasChildren" has always the same value equal to "true"".
        System.out.println(canDrive);

        /**
         * ??????? 9
         */
        System.out.println("Task9 ");

        int a9 = 1;
        int b9 = 2;
        boolean complicated = ( !(a9 < b9) && ! (a9 > b9));  // "complicated" has always (for any a and b) the same value equal to "false"".
        System.out.println(complicated);

        /**
         * ??????? 10
         */
        System.out.println("Task10 ");

        int a10=5;
        int b20=5;
        System.out.println(a10 & b20);

        a10=19;
        b20=25;

        System.out.println(a10 & b20);

        a10=57;
        b20=31;

        System.out.println(a10 & b20);

        /**
         * ??????? 11
         */
        System.out.println("Task11 ");

        int a11=1;
        int b21=5;
        System.out.println(a11 | b21);

        a11=16;
        b21=1;

        System.out.println(a11 | b21);

        a11=16;
        b21=9;

        System.out.println(a11 | b21);

        /**
         * ??????? 12
         */
        System.out.println("Task12 ");

        int a12=96;
        int b22=101;
        System.out.println(a12 ^ b22);

        a12=16;
        b22=1;

        System.out.println(a12 ^ b22);

        a12=16;
        b22=9;

        System.out.println(a12 ^ b22);

        /**
         * ??????? 13
         */
        System.out.println("Task13 ");

        int a13=17;
        System.out.println(a13);
        a13 = a13>>1;
        System.out.println(a13);

        a13=17;
        System.out.println(a13);
        a13 = a13<<4;
        System.out.println(a13);

        a13=23;
        System.out.println(a13);
        a13 = a13>>2;
        System.out.println(a13);


        System.out.println("Pr4");
        System.out.println(" Task 9");


        String[] CN = { "AED ", "AUD","BGN"  , "CAD" , "CHF", "CNY", "CZK"
                , "DKK",  "GBP", "HKD", "HRK", "HUF", "JPY", "NOK", "PLN"
                , "RON", "RUB", "SEK", "SGD", "TRY", "USD", "ZAR" , "Brl"
                , "Eek", "Dop"
        };



        for (int i9 = 0; i9 < 25; i9++) {
            System.out.println( " i=" +   i9 + " " +  CN[i9]);
        }

        Arrays.sort(CN);

        System.out.println(Arrays.toString(CN));

        for (int i9 = 24; i9 >-1; i9--) {
            System.out.println( " i=" +   i9 + " " +  CN[i9]);
        }


        Arrays.sort(CN, Collections.reverseOrder());

        System.out.println(Arrays.toString(CN));


        System.out.println("Pr4 Task 10 ");

        double[] CN10 = { 3.0, 11.09 , 12.08, 13.06, 14.07, 15.06, 89.8 };

        String[] CN11 = {"aed", "aud","bgn","cad","cao",  "  cod " ,  " chf"
        };


        double[] arr10 = Arrays.copyOf(CN10, 7);




        for (int i10 = 0; i10 < 7; i10++) {
            System.out.println( " i=" +   i10 + " " +  CN11[i10]   + "  , " + CN10[i10]  );
        }

        Arrays.sort(CN11);

        System.out.println(Arrays.toString(CN11));


        for (int i10 = 0; i10 < 6; i10++) {
            System.out.println( " i=" +   i10 + " " +  CN10[i10]);
        }



        int t=Arrays.binarySearch(CN10, 9);
        System.out.println(t);
        System.out.println(Arrays.binarySearch(CN10, 9));

        double[] arrrr = {3.0, 11.09 , 12.08, 13.06, 14.07, 15.06, 89.8};
        System.out.println(Arrays.binarySearch(arrrr, 14.07));

        Arrays.sort(arrrr);

        System.out.println(Arrays.binarySearch(arrrr, 14.07));








    }

}
