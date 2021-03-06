package buseduc.javacourse.prax.p01;

public class Prax_01_vz {
    public static void main(String[] args) {

        /**
         * Задание 1
         *
         * Ответ: a = 1, b = 1, t = 1;
         *
         */

        /**
         * Задание 2
         *
         * Ответ: int y объявлено дважды
         */

        /**
         * Задание 3
         */

        int x = 1;
        System.out.println(x);

        /**
         * Задание 4
         *
         * Ответ: b не может быть присвоено значение int, т.к оно является переменной типа Boolean
         */


        /**
         * Задание 5
         */

        char ch1, ch2;
        ch1 = 119;
        ch2 = 'w';
        System.out.println(ch1 + "+" + ch2);
        System.out.println(ch1 + ch2);

        /**
         * Задание 6
         *
         * Ответ: На экран выводятся одинаковые значения переменных x, y , z, k = 119
         */

        int y, z, k;
        x = 119 + 1;
        y = 0167 + 1;
        z = 0x77 + 1;
        k = 0B01110111 + 1;
        System.out.println(x + " " + y + " " + z + " " + k);

        /**
         * Задание 7
         *
         * Ответ: переменная MY_CONST константа и поэтому уже не может быть изменена
         * Надо убрать ключевое слово final
         */
        // @VS: это не переменная, а константа, нужно создать новую переменную для нового значения.
        // @VZ: Исправил.
        final int MY_CONST = 10;
        int tmp;
        tmp = MY_CONST + 10;
        System.out.println(tmp);

        /**
         * Задание 8 и 9
         */
        // @VS: А как сделать, чтобы тип переменной сохранился?
        // @VZ: Исправил.
        byte y1 = 1, y2 = 2;
        y1 = (byte) (y1 + y2);
        System.out.println(y1);

        short z1 = 1, z2 = 2;
        z1 = (short) (z1 + z2);
        System.out.println(z1);

        /**
         * Задание 10
         * Ответ: нужно заменить int на double
         */

        x = 10;
        y = 3;
        System.out.println( x / y );

    }
}
