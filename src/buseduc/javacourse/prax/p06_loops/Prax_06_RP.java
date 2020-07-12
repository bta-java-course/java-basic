package buseduc.javacourse.prax.p06_loops;

import java.util.Arrays;
import java.util.Comparator;

public class Prax_06_RP {
    public static void main(String[] args) {

        /**
        * Практикум. Циклы
        */

        /**
         * Задание 1
         */

        for(int i = 1; i <= 10; i++)
            System.out.println(i);

        /**
         * Задание 2
         */
        int n = 3;
        for(int i = 1; i <= n; i++)
            System.out.println(i);
        /**
         * Задание 3
         */
        int n = 3;
        for(int i = 0; i < n; i++)
            System.out.println(n - i);
        /**
         * Задание 4
         */

        double rand1;
        double sum = 0;
        int numCount = 20;
        for(int i =0; i < numCount; i++){
            rand1 = Math.random() * 10;
            System.out.println(rand1);
            sum += rand1;
        }
        System.out.println("AVERAGE " + sum / numCount);

        /**
         * Задание 5
         */

        int sec = 1;
        while (true) {
            if (sec > 60) {
                sec = 1;
            }
            System.out.println(sec++);
            try{ //PAUSE FOR 1000 millisec
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }

        /**
         * Задание 6
         */
        System.out.println("zadanie 6");
        int n = 5;
        for(int i = 0; i <= 5; i++){

            System.out.println(n + " x " + i + " = " + n * i);
        }

        /**
         * Задание 7
         */
        System.out.println("zadanie 7");
        int n = 2;
        for(int i =0; i <= n; i++) {
            for (int y = 0; y <= n; y++) {

                System.out.println(i + " x " + y + " = " + i * y);
            }
            System.out.println("_________________________");
        }



        /**
         * Задание 8
         */

        System.out.println("zadanie 8");
        int n = 10;
        for(int i =0; i <= n; i++) {
            for (int y = 0; y <= i; y++) {
                System.out.print(y);
            }
            System.out.println(" ");
        }

        /**
         * Задание 9
         */
        //Задание 9.1
        int n = 8;
        for(int i = 1; i <= n; i++) {
            for(int a = n - i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= i; y++) {
                System.out.print("@");
            }
            System.out.print("\n");
        }

        //Задание 9.2
        int n = 8;
        for(int i = 1; i <= n; i++) {
            for (int a = n - i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * i - 1; y++) {
                System.out.print("@");
            }
            System.out.print("\n");
        }

        /**
         * Задание 10
         */

        String[] words = {"семеро", "с", "ложкой", "один", "с", "сошкой"};
        int n = words.length;
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) return -1; //>
                if (o1.length() > o2.length()) return 1; //<
                return 0;
            }
        });
        System.out.println(Arrays.toString(words));

        for(int i = 0; i < n; i++) {
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
