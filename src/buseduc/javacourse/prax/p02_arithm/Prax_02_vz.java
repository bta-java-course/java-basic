package buseduc.javacourse.prax.p02_arithm;

public class Prax_02_vz {
    public static void main(String[] args) {

    /**
    * Практикум 2. Арифметические операции
    */
        /**
         * Задание 1
         *
         * Ответ: 42
         */

        /**
         * Задание 2
         *
         * Ответ: 10 и 4 являются int, нужно привести к double
         */

        double k = (double) 10 / 4;
        System.out.print("Task 2: ");
        System.out.println(k);

        /**
         * Задание 3
         *
         * Ответ: y = 4, 10 делим на 5 получаем 2, затем 2 умножаем на 2 получаем 4
         */

        /**
         * Задание 4
         *
         *
         */

        double d4 = 2.0 - 1.1;
        System.out.print("Task 4: ");
        System.out.println((float) d4);

        /**
         * Задание 5
         *
         * Ответ: останется 5 евро
         */

        int money = 35;
        int coffee = 6;
        System.out.print("Task 5: ");
        System.out.println("Balance: " + money / coffee + " eur");

        /**
         * Задание 6
         *
         * Данный код вывыдет 9.
         */

        int x6 = 3;
        int y6 = x6 * 2 + x6;
        --y6;
        --y6;
        --y6;
        System.out.print("Task 6: ");
        System.out.println((--y6) + ", " + ++y6 + ", " + ++y6 + ", " + ++y6 +  " ," + ++y6 + ", " + ++y6 + ", "
                + ++y6 + ", " + ++y6 + ", " + ++y6);

        /**
        * Задание 7
         *
        * Переменные z и y не были инициализированы
         */

        int x7;
        int y7;
        int z7;
        x7 = 10;
        x7 = 12 * 10 + 45 / 5;
        x7 = 12 + 45;
        z7 = y7 = x7 = 2;

        /**
         * Задание 8
         *
         * Ответ: 1. 10 + 10 = 20
         * 2. 20 - 10 = 10
         * 3. 10 - 3 пачки * 3 евро = 1
         * 4. 1 + 5 + 10 = 16
         */

        int x8 = 10;
        System.out.print("Task 8: ");
        System.out.println(((x8 + x8 - x8) - (3 * 3)) + 10 + 5);
   
        /**
         * Задание 9
         */

        System.out.println("Task 9: ");
        int a9 = (int) (Math.random() * 10);
        int b9 = (int) (Math.random() * 10);
        int c9 = (int) (Math.random() * 10);
        int d9 = (int) (Math.random() * 10);

        if(a9 % 3 == 0)
        {
            System.out.println(a9);
        }

        if(b9 % 3 == 0)
        {
            System.out.println(b9);
        }

        if(c9 % 3 == 0)
        {
            System.out.println(c9);
        }


        if(d9 % 3 == 0)
        {
            System.out.println(d9);
        }


         /**
         * Задание 10
         */
        int a10 = (int) (Math.random() * 10);
        int b10 = (int) (Math.random() * 10);
        int c10 = (int) (Math.random() * 10);

        System.out.println("Task 10:");
        System.out.println("Square: " + (a10*b10)/2);
        System.out.println("Perimeter: " + (a10 + b10 +c10));

    }

}
