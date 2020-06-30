package buseduc.javacourse.prax.p02_logic;

public class Prax_02_RP {
    public static void main(String[] args) {



        /**
        * Практикум 2. Арифметические операции
        */
        /**
         * Задание 1
         */
        //System.out.println(2 + 4 * 10); выдает 42

        /**
         * Задание 2
         * 10 и 4 являются целочисленными.
         * можно использовать явное приведение типов
         */
        double k = (double) 10 / 4;
        System.out.println(k);
        /**
         * Задание 3
         * результат 4, т.к. порядок выполнения операция слева направо
         */


        /**
         * Задание 4
         * результат d = 0.8999999999999999
         */
        double d = 2.0 - 1.1;
        System.out.println((float)d);


        /**
         * Задание 5
         */
        int money = 35;
        int balance = money % 6;
        String euro = "\u20ac";

        System.out.println("Сдача: " + balance + euro);

        /**
         * Задание 6
         * код выводит значене 9
         */
        int x = 3;
        int y = x * 2 + x;

        --y;
        --y;
        --y;
        --y;
        System.out.println(y + ", " + ++y + ", " + ++y + ", " + ++y + ", " + ++y + ", " + ++y + ", " + ++y + ", " + ++y + ", " + ++y);
        /**
         * Задание 7
         * переменные y7 и z не объявлены
         */
        int x7;
        int y7, z;
        x7 = 10;
        x7 = 12 * 10 + 45 / 5;
        x7 = 12 + 45;
        x7 = y7 = z = 2;
        /**
         * Задание 8
         */
        int x8 = 10;
        x8 += 10;
        x8 -= 10;
        int balance8 = x8 % 3;
        System.out.println("После покупки осталось: " + balance8 + euro);

        balance8 += 10;
        balance8 += 5;
        System.out.println("После того как дали еще десятку и пятерку, денег стало: " + balance8 + euro);

        /**
         * Задание 9
         */
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d9 = (int) (Math.random() * 10);

        int counter = 0;
        if (a % 3 == 0) {
            counter++;
        }
        if (b % 3 == 0) {
            counter++;
        }
        if (c % 3 == 0) {
            counter++;
        }
        if (d9 % 3 == 0) {
            counter++;
        }

        System.out.println(a + ", " + b + ", " + c + ", " + d9);
        System.out.println("Kоличество чисел, которые делятся на 3: " + counter);

        /**
         * Задание 10
         */
        int a10 = (int) (Math.random() * 10);
        int b10 = (int) (Math.random() * 10);
        float c10 = (float) Math.sqrt((Math.pow(a10, 2)) + (Math.pow(b10, 2))); //c2 = a2 + b2
        //float c10 = (float) Math.sqrt((a10 * a10) + (b10 * b10));
        System.out.println("Стороны треугольника: A=" + a10 + ", B=" + b10 + ", C=" + c10);
        float S10 = (float)(a10 * b10) / 2; //площадь треугольника
        float P10 = (float) (a10 + b10 + c10); //периметр треугольника

        System.out.printf("Площадь треугольника S = %2.2f" + "\n", S10);
        System.out.printf("Периметр треугольника P = %.2f", P10);

    }

}
