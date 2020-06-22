package buseduc.javacourse.prax.p01;

public class Prax_01_LP {
    public static void main(String[] args) {
        /**
         * Задание 1
         *
         * ответ a = 1, b = 1, t = 1 /
         *
        /**
         * Задание 2
         *второй раз обьявить int y нельзя
         */

        /**
         * Задание 3
         */
         int x;
         x = 8; //нужно присвоить значение переменной
         System.out.println(x);

        /**
         * Задание 4
         * в не может быть числом. Нужно задать true или false 
         */

        /**
         * Задание 5
         *
         */
        char ch1, ch2;
        ch1 = 119;
        ch2 = 'w';
        System.out.println(ch1 + " " + ch2); //w w
        System.out.println(ch1 + "+" + ch2); //w+w
        System.out.println(ch1 + ch2); //238


        /**
         * Задание 6
         */
        int x, y, z, k;
        x = 119;
        y = 0167;
        z = 0x77;
        k = 0B01110111;
        System.out.println(x + " " + y + " " + z + " " + k); //119 119 119 119
        System.out.println(++x + " " + ++y + " " + ++z + " " + ++k); //120 120 120 120



        /**
         * Задание 7
         */
        //..выдаст ошибку, так как менять констанку нельзя. Можно создать еще одну переменную, где используем значение константы.
        final int MY_CONST = 10;
        int с = MY_CONST + 10;
        System.out.println(с);//20
        /**
         * Задание 8
         */

        byte y1 = 1, y2 = 2;
        y1 = (byte) (y1 + y2);

        short z1 = 1, z2 = 2;
        z1 = (short) (z1 + z2);

        /**
         * Задание 9
         * дублирование 8 задания
         */

        /**
         * Задание 10
         *
         */
        float x = 10, y = 3;
        System.out.println( x / y ); //3.3333333 int работает только с целыми числами. Нужно было заменить на float

    }
}
