package buseduc.javacourse.prax.p06_loops;

import java.util.Arrays;

public class Prax_06_pr {
    public static void main(String[] args) {

        /**
        * Практикум. Циклы
        */

        /**
         * Задание 1
         */
        System.out.println("  task1 ");

              for (int i1 = 1; i1 < 11; i1++)  {
            System.out.println(i1 );

            }
        /**
         * Задание 2
         */

        System.out.println("  task2 ");

        int n1=3;

        for (int i2 = 1; i2 < n1+1; i2++)  {
            System.out.println(i2 );

        }
        /**
         * Задание 3
         */
        System.out.println("  task3 ");



        int n3=3;

        for (int i3 = n3; i3 > 0; i3--)  {
            System.out.println(i3 );
        }

        /**
         * Задание 4
         */
        System.out.println("  task4 ");

        int n44=3;
        double sum=0.0;

        for (int n4 = 1; n4 < n44+1; n4++)  {
            sum = sum+  (double) (Math.random() * 100.0);
        }

        System.out.println(" Average value = "+ sum/n44);


        /**
         * Задание 5
         *
         * Task 5 is situated after Task12.
         *
         */
        System.out.println("  Task 5 follows after Task12 ");

        /**
         * Задание 6
         */

        System.out.println("  task6 ");

        int n6=5;

        for (int i6 = 0; i6 < n6+1 ; i6++)

        {System.out.println(n6 + " X "+ i6  + "= " + n6*i6); }




        /**
         * Задание 7
         */
        //////////////////////////////////////////////

        System.out.println( " Task 7 " );


        int n7=2;

        for (int i7a = 0; i7a < n7+1 ; i7a++)
        {


            for (int i7 = 0; i7 < n7+1 ; i7++)

            {System.out.println(i7a + " X "+ i7  + "= " + i7a*i7);
                //System.out.println( "......................... " );


            }
            System.out.println( "........ " );
        }

        //  int n5=0;
        // while (true) {  n5++;
        // System.out.println(n5);

        //  if (n5 == 60) {n5=0;}

        // try {
        //    {
        //    int e = 1;
        //    }
        //Thread.sleep(1000);
        //} catch (InterruptedException e) {
        //}
        //  }




        ////////////////////////////////////////


        /**
         * Задание 8
         */
        //////////////////////////////////////////////
        System.out.println( " Task 8 " );

        int n8=10;

        for (int i8a = 1; i8a < n8+1 ; i8a++)
        {
            for (int i8 = 1; i8 < n8+1 ; i8++)
            {

                System.out.print(i8);

                if (i8 > i8a -1)  {break;}

            }
            System.out.print("\n");
        }

        //////////////////////////////////////////7
        /**
         * Задание 9
         */
        System.out.println( " Task 9 " );

        ////

        //////////////////////////////////////////////




        int n9=8;

        for (int i9a = 0; i9a < n9 ; i9a++)
        {


            for (int i9 = 0; i9 < n9 ; i9++)

            {
                //System.out.println(i7a + " X "+ i7  + "= " + i7a*i7);
                //System.out.println( "......................... " );
                //	System.out.print("");

                if (i9 < n9- i9a -1)  {System.out.print(" ");}
                else  {System.out.print("@");}

            }
            System.out.print("\n");
            //System.out.println( "........ " );
        }

        //  int n5=0;
        // while (true) {  n5++;
        // System.out.println(n5);

        //  if (n5 == 60) {n5=0;}

        // try {
        //    {
        //    int e = 1;
        //    }
        //Thread.sleep(1000);
        //} catch (InterruptedException e) {
        //}
        //  }


        //////////////////////////////////////////////




        int nn9=10;
        int ndop=9;

        for (int ni9a = 0; ni9a < nn9 ; ni9a++)
        {


            for (int ni9 = 0; ni9 < nn9 + ndop ; ni9++)

            {


                if (ni9 < nn9- ni9a -1)  {System.out.print(" ");}
                else if (ni9 > nn9 + ni9a-1)  {System.out.print(" ");}
                else  {System.out.print("@");}

            }
            System.out.print("\n");
            //System.out.println( "........ " );
        }





        //////////////////////////////////////////7



        //////////////////////////////////////////7


        ////




        /**
         * Задание 10
         */
        System.out.println("  task10 ");

       int[] y10 = new int[6];
        String[] words = {"семеро", "с", "ложкой", "один", "с", "сошкой"};
        int lmax=0;

        for (int i10 = 0; i10 < 6 ; i10++)
        {
           String slovo = words[i10];
            int len2 = slovo.length();
            y10[i10]=len2;

            if (len2 > lmax) {
                lmax=len2;
            }


        }

        System.out.println("Maximum length of a word in the array = " + lmax);
        //  System.out.println(Arrays.toString(y10));
    //        int[] y10cl = y10.clone();
        //System.out.println(Arrays.toString(y10cl));

        for (int lk=1; lk < lmax+1; lk++) {
            for (int i10 = 0; i10 < 6; i10++) {
                float z = 0;
                if (y10[i10] == lk) {
                    System.out.println(words[i10]);
                                   }
            }
        }



        /**
         * Задание 11
         */
        //////////////////////////////////////////7

        //////////////////////////////////////////////
        System.out.println( " Task 11 " );

        int n11=15;
        int i11=1;
        long fmr=1;
        int i11a=1;

        for ( i11a = 0; i11a < n11+1 ; i11a++)
        {
            for ( i11 = 0; i11 < n11+1 ; i11++)
            {

                if (i11 == 0)  {System.out.print(1 + " ");}
                else if (i11 == i11a)  {System.out.print(1 + " ");}

                else { long fm=1;
                    long fnm=1;
                    for (int m = 1; m < i11+1 ; m++)
                    {fm=fm*m;}
                    for (int m1 = i11a-i11+1; m1 < i11a+1 ; m1++)
                    {fnm=fnm*m1;}
                    fmr=fnm/fm;


                    System.out.print(fmr+" ");}
                

                if (i11 > i11a -1)  {break;}

            }
            System.out.print("\n");
        }



        //////////////////////////////////////////7
        /**
         * Задание 12
         */

        System.out.println("  task 12 ");

      //  int n12=3;
        int noftours=10;
        int num1=0;
        int num2=0;
        int p1full=0;
        int p2full=0;
        int su=0;


        System.out.println("  START ");



        for (int i12 = 1; i12 < noftours+1; i12++) {
          //  System.out.println(i12);


            //nachalo tura
            num1 = (int) (Math.random() * 3 + 1);
            num2 = (int) (Math.random() * 3 + 1);
            su = num1 * num1 - num2 * num2;

            //System.out.println(su);
            //System.out.println(num1);
            //System.out.println(num2);

            if (su == 0) {
                System.out.println("  STANDOFF  ");
            }

            if (su == 3) {
                System.out.println("  1 scissors, 2 stone => 2 winner");
                p2full++;
            }

            if (su == -3) {
                System.out.println("  1 stone, 2 scissors => 1 winner ");
                p1full++;
            }

            if (su == -8) {
                System.out.println(" 1 stone, 2 paper => 2 winners ");
                p2full++;
            }

            if (su == 8) {
                System.out.println("  1 paper, 2 stone, => 1 winner");
                p1full++;
            }

            if (su == -5) {
                System.out.println(" 1 scissors, 2 paper => 1 winner");
                p1full++;
            }

            if (su == 5) {
                System.out.println(" 1 paper, 2 scissors => 2 winner ");
                p2full++;
            }

            System.out.println("Result after " + i12 + "  tour   " + p1full + "," + p2full);
            // konec  tura
        }



        if (p1full > p2full) {System.out.println("1 is winner!");}
        else if (p1full < p2full) {System.out.println("2 is winner!");}
        else  {System.out.println(" Overall Standoff");}



        System.out.println("task 5");

        int n5=0;
        while (true) {  n5++;
            System.out.println(n5);

            if (n5 == 60) {n5=0;}

            try {
                {
                    int e = 1;
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }


}