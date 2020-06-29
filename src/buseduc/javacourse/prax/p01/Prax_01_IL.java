package buseduc.javacourse.prax.p01;

public class Prax_01_IL {
    public static void main(String[] args) {
        /**
         * Задание 1
         *
         * Ответ a = 1, b = 1, t = 1
         */

        /**
         * Задание 2
         *
         * Ошибка в том, что переменная int y объявлена 2 раза
         */

        /**
         * Задание 3
         *
         * int x = 10;
         *         System.out.println(x);
         */
       /* int x = 10;
        System.out.println(x);*/
        /**
         * Задание 4
         */
        boolean a,b;
        a = true;
        b = false;

        /**
         * Задание 5
         */

        /*char ch1, ch2;
        ch1 = 119;
        ch2 = 'w';
        System.out.println(ch1 + "+" + ch2);*/

        char ch1, ch2;
        ch1 = 119;
        ch2 = 'w';
        System.out.println(ch1 + ch2);




        /**
         * Задание 6

        int x, y, z, k;
        x = 119;
        y = 0167;
        z = 0x77;
        k = 0B01110111;
        System.out.println(x + 1+ " " + y+1  + " " + z+1  + " " + k+1);
         */
        /**
         * Задание 7
         * final int MY_CONST = 10;
         * MY_CONST = MY_CONST + 10;
         * System.out.println(MY_CONST);
         * Ошибка в том, что если перед int поставить final, то она больше не может
         * поддвергаться изменениям
         */
        int MY_CONST = 10;
        MY_CONST = MY_CONST + 10;
        System.out.println(MY_CONST);


        /**
         * Задание 8
         * short z1 = 1, z2 = 2;
         * z1 = z1 + z2;
         * short и double - это переменные с плавающей запятой, а в примере пердставлены целочисленные
         */
        int y1 = 1, y2 = 2;
        y1 = y1 + y2;
        int z1 = 1, z2 = 2;
        z1 = z1 + z2;


        /**
         * Задание 9
         * Ответ на восьмое и девятое в восьмом.
         */



        /**
         * Задание 10
         * Ответ: в условии переменная - целочисленное, соответственно ответ так же может быть
         * только целочисленный. Чтобы получить точно число тип данных должен быть с плавающей запятой.
         */
        float x = 10, y = 3;
        System.out.println( x / y );



    }
}
