package buseduc.javacourse.prax.p06_loops;

public class Prax_06_IL {
    public static void main(String[] args) {

        /**
        * Практикум. Циклы
        */

        /**
         * Задание 1
         */
        System.out.println("Task 1: ");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        /**
         * Задание 2
         */
        System.out.println("Task 2: ");
        int n = 3;
        for (int p = 1; p <= n  ; p++) {
            System.out.println(p);
        }

        /**
         * Задание 3
         */
        System.out.println("Task 3: ");
        int o = 3;
        for (int u = o; u > 0; u--) {
            System.out.println(u);
        }


        /**
         * Задание 4
         */
        System.out.println("Task 4: ");

        double rand1;
        int numCount = 20;
        double sum = 0;
        for ( int i = 0; i <= numCount; i++ ) {
            rand1 = Math.random() * 10;
            System.out.println(rand1);
            sum += rand1;
        }
        System.out.println("Average: " + sum / numCount);



        /**
         * Задание 5

        System.out.println("Task 5: ");
        int sec = 1;
        while(true){
            if (sec > 60){
                sec = 1;

            }
            System.out.println(sec++);

            try {
                Thread.sleep(1000);
           } catch (InterruptedException e) {
           }


        }
         */

        /**
         * Задание 6
         */
        System.out.println("Task 6: ");
        int number = 5;
        for (int y = 0; y <= number; y++) {
            System.out.println("5 * "+ y + " = " + y * number); // @VS: на дисплей будет всегда выводиться 5
        }


        /**
         * Задание 7
         */
        System.out.println("Task 7: ");
        int num = 2;
        for (int q = 0; q <= num ; q++) {
            for (int w = 0; w <= num ; w++) {
                System.out.println(q + " X " + w + " = " + q * w);
            }

        }


        /**
         * Задание 8
         */
        System.out.println("Task 8: ");
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
        System.out.println("Task 10: ");
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
        System.out.println("Task 10");
        String[] words = {"семеро", "с", "ложкой", "один", "с", "сошкой"};
        for (int b = words.length - 1; b > 0; b--) {
            for (int i = 0; i < b; i++) {
                if (words[i].length()>words[i + 1].length()) {
                    String tmp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = tmp;
                }

            }

        }
        for (int e = 0; e < words.length ; e++) {
            System.out.println(words[e]);
        }

        /**
         * Задание 11
         */


        /**
         * Задание 12
         */

    }

}
