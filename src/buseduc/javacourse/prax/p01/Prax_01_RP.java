package buseduc.javacourse.prax.p01;

public class Prax_01_RP {
    public static void main(String[] args) {
        /**
         * Задание 1

          a=1
          b=1
          t=1
         */


        /**
         *Задание 2
         */
        int y; //varialbe y already defined

        /**
         * Задание 3
         */
         int x=22;
         System.out.println(x);


        /**
         * Задание 4
         */
         boolean a, b;
         a = true;
         b = false;  //or b = true


        /**
         * Задание 5
         *
         //5.1
        in original it will print out "W W"
         */
         //5.2)
         char ch1, ch2;
         ch1 = 119;
         ch2 = 'w';
         System.out.println(ch1 + " + " + ch2);  // @VS: ch1 + "+" + ch2

         // 5.3)
         //char ch1, ch2; -- уже объявлено (VS)
         ch1 = 119;
         ch2 = 'w';
         System.out.println(ch1 + ch2);

        /**
         * Задание 6
         */
         //6.1)
        // @VS:  x, y, z, k = 119 - Строки, которые не компилируются следует комментировать

         // 6.2)
         int  z, k;
         x = 119 + 1;
         y = 0167 + 1;
         z = 0x77 + 1;
         k = 0B01110111 + 1;
         System.out.println(x + " " + y + " " + z + " " + k);

        /**
         * Задание 7
         */
        //7.1)
        final int MY_CONST = 10; //это переменная, значение которой не может измениться после ее назначения.
                                // @VS:  это не переменная. это КОНСТАНТА
        //7.2
        // int MY_CONST = 10;
        // MY_CONST = MY_CONST + 10;     @VS: Ошибка не исправлена
        System.out.println(MY_CONST);
        /**
         * Задание 8

        //8.1
        byte y1 = 1, y2 = 2;
        int y3 = y1 + y2;

        //8.2
        short z1 = 1, z2 = 2;
        z3 = z1 + z2;

         */

        /**
         * Задание 9
         */
        //9.1
        byte y1 = 1, y2 = 2;
        int y3 = y1 + y2;

        //9.2
        short z1 = 1, z2 = 2;
        int z3 = z1 + z2;


        /**
         * Задание 10
         */
        //10.1
        // int целочисленная переменная

        //10,2
        x = 10; y = 3; // @VS:  Исправлено
        System.out.println( x / y );
    }
}
