package buseduc.javacourse.prax.p02_arithm;

public class Prax_02_IL {
    public static void main(String[] args) {

    /**
    * Практикум 2. Арифметические операции
    */
        /**
         * Задание 1
         *
         */
        System.out.println("Задание 1");
        System.out.println(2 + 4 * 10);
        // @VS: Ответ?




        /**
         * Задание 2
         * Нужно использоваь тип данных float
         */
        System.out.println("Задание 2");
        float k = 10 / 4f;         // @VS: можно и double.
        System.out.println(k);





        /**
         * Задание 3
         * int x = 10 / 5 * 2; результат будет 4, так как задачи выполняются с лева на право.
         */
        System.out.println("Задание 3");
        int x3 = 10 / 5 * 2;
        System.out.println(x3);


        /**
         * Задание 4
         */
        System.out.println("Задание 4");
        float d = 2 - 1.1f;
        System.out.println(d);


        /**
         * Задание 5
         *int b = 35%6;
         *         System.out.println(b);
         */
        System.out.println("Задача 5");
        int x5 = 35%6;
        System.out.println(x5);


        /**
         * Задание 6
         * int x = 3;
         * int y = x * 2 + x;
         * System.out.println(y);
         */
        System.out.println("Задание 6");
        int x6 = 3;
        int y6 = x6 * 2 + x6;  // @VS: предполагалось изменить эту строчку

        y6--;
        y6--;
        y6--;
        System.out.println( (--y6) + ", " + (++y6) + ", " + (++y6) + ", " + (++y6) + ", " + (++y6) + ", " + (++y6) + ", " + (++y6) + ", " + (++y6) + ", " + (++y6));



        /**
         * Задание 7
         */
        System.out.println("Задание 7");
        int x7;
        int y7;
        int z7;
        x7 = 10;
        x7 = 12 * 10 + 45 / 5;
        x7 = 12 + 45 ;
        x7 = y7 = z7 = 2;
        System.out.println("x7");
        // @VS: объяснение ошибки?


        /**
         * Задание 8
         */
        System.out.println("Задание 8");
        int x8 = 10;

        x8 += 10;
        System.out.println (x8 + ", кол-во денег увеличилось на 10");

        x8-=10;
        System.out.println(x8 + ", кол-во денег уменьшилось на 10");

        x8%=3;
        System.out.println(x8 + ", столько денег осталось после закупки кофе");

        x8+=10+5;
        System.out.println(x8 + ", столько денег получилось, после того как дали 10 и 5");

        /**
         * Задание 9
         */
        System.out.println("Задание 9");
        int g = 0;

        int a9 = (int) (Math.random() * 10);
        int b9 = (int) (Math.random() * 10);
        int c9 = (int) (Math.random() * 10);
        int d9 = (int) (Math.random() * 10);

        if (a9%3 == 0){
            g++;
        }
        if (b9%3 == 0){
            g++;
        }
        if (c9%3 == 0){
            g++;
        }
        if (d9%3 == 0){
            g++;
        }
        System.out.println( g );
        System.out.println( a9 + " "+ b9 + " "+ c9 + " " + d9);




        /**
         * Задание 10
         */
        System.out.println("Задание 10 ");
        int a10 = (int) (Math.random() * 10);
        int b10 = (int) (Math.random() * 10);

        System.out.println( " a=" +   (a10) + " b=" + b10);

        System.out.println( " p=" +   2*(a10+b10) + " S=" + b10*a10);





    }

}
