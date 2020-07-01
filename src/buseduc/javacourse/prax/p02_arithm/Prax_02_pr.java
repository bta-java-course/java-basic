package buseduc.javacourse.prax.p02_arithm;

public class Prax_02_pr {
    public static void main(String[] args) {

    /**
    * Практикум 2. Арифметические операции
    */
        /**
         * Задание 1
         */

        System.out.println("Task1 ");
        System.out.println(2 + 4 * 10);
        // @VS: Ответ?

        /**
         * Задание 2
         */
        System.out.println("Task2 ");
        double kk =  10 / 4.0;
        System.out.println( kk);

        /**
         * Задание 3
         */
        System.out.println("Task3 ");
        int x = 10 / 5 * 2;
        System.out.println(x);
        // @VS: Ответ?

        /**
         * Задание 4
         */
        System.out.println("Task4 ");
        double dd =  (2.0 - 1.1);
        System.out.println( (float)  dd);
        /**
         * Задание 5
         */
        System.out.println("Task5 ");
        int raha=35;
        int pakk=6;
        System.out.println(raha%pakk);
        /**
         * Задание 6
         */
        System.out.println("Task6 ");
        int x4 = 3;
        int y4 = x4 * 2 + x4; // @VS: предполагалось изменить эту строчку
        System.out.println(y4);
        y4--;
        y4--;
        y4--;

        System.out.println(    (--y4) + " ," + ++y4 + ", " + ++y4 + ", " + ++y4 +  " ," + ++y4 + ", " + ++y4 + ", " + ++y4 + ", " + ++y4 + ", " + ++y4);





        /**
         * Задание 7
         */
        System.out.println("Task7 ");
        int x7;
        int y7;
        int z7;
        x7 = 10;
        x7 = 12 * 10 + 45 / 5;
        x7=12 + 45;
        x7 = y7 = z7 = 2;
        // @VS: объяснение ошибки?


        System.out.println(x7);
        /**
         * Задание 8
         */
        System.out.println("Task8 ");
        int x8 = 10;
        x8=x8+10;

        System.out.println(x8);


        x8 = 10;
        x8=x8-10;

        System.out.println(x8);


        x8 = 10;
        x8=x8-3*2;

        System.out.println(x8);


        x8 = 10;
        x8=x8+10+5;

        System.out.println(x8);
        // @VS: Не максимально кратко


        /**
         * Задание 9
         */
        System.out.println("Task9 ");
        int s=0;

        int ar = (int) (Math.random() * 10);
        int br = (int) (Math.random() * 10);
        int cr = (int) (Math.random() * 10);
        int dr = (int) (Math.random() * 10);

        if(ar % 3 == 0)
        {
            s++;
        }

        if(br % 3 == 0)
        {
            s++;
        }

        if(cr % 3 == 0)
        {
            s++;
        }

        if(dr % 3 == 0)
        {
            s++;
        }

        System.out.println( s );
        System.out.println( ar + " "+ br + " "+ cr + " " + dr);
        /**
         * Задание 10
         */
        System.out.println("Task10 ");
        int a10 = (int) (Math.random() * 10);
        int b10 = (int) (Math.random() * 10);

        System.out.println( " a=" +   (a10) + " b=" + b10);

        System.out.println( " p=" +   2*(a10+b10) + " S=" + b10*a10);


        System.out.println(  );         // @VS: Ответ?


    }

}
