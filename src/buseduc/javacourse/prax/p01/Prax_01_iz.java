package buseduc.javacourse.prax.p01;

public class Prax_01_iz {
    public static void main(String[] args) {
        /*
          Задание 1
          Answer: A=1, B=1, T=1
         */

       /*
         * Задание 2
         * Answer: int y is mentioned twice
         */

        /*
         * Задание 3
         * Answer: X should have any value, like int x=10;
         * int x = 10;
         * System.out.println(x);
         * */

        /*
         * Задание 4
         * Answer:
        boolean a, b;
         a = true;
         b = false;
*/

        /*
         * Задание 5
         * Answer:
        char ch1, ch2;
        ch1 = 119;
        ch2 = 'w';
        System.out.println(ch1 + "+" + ch2);
        System.out.println(ch1 + ch2);
         */

        /*
         * Задание 6
         * Answer:
        int x, y, z, k;
        x = 119;
        y = 0167;
        z = 0x77;
        k = 0B01110111;
        System.out.println((x + 1)+ " " + (y + 1)+ " " + (z + 1) + " " +(k + 1));
     */

        /*
         * Задание 7
         * Answer: MY_CONST константа и поэтому уже не может быть изменена
         * убрать final
         */
        // @VS: это не переменная, а константа, нужно создать новую переменную для нового значения.

        int MY_CONST = 10;
        MY_CONST = MY_CONST + 10;
        System.out.println(MY_CONST);

        /*
         * Задание 8
         * Answer:
         */
        // @VS: А как сделать, чтобы тип переменной сохранился?
        byte y1=1;
        byte y2=2;
        int y3=y1 +y2;
        System.out.println(y3);

        short z1=1;
        short z2=2;
        int z3= z1 + z2;
        System.out.println(z3);

        /*
         * Задание 9
         * Answer:
        byte y1=1;
        byte y2=2;
        int y3=y1 +y2;
        System.out.println(y3);

        short z1=1;
        short z2=2;
        int z3= z1 + z2;
        System.out.println(z3);
         */

        /*
         * Задание 10
         * Answer:
         */
        float x = 10, y = 3;
        System.out.println( x / y );
    }
}
