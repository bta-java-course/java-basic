package buseduc.javacourse.prax.p04_if;

public class Prax_04_vs {
    public static void main(String[] args) {

        /**
        * Практикум. Условные переходы
        */

        /**
         * Задание 1
         */

        int a = 4;
        int b = 6;
        if (a < b) {
            System.out.println("x");
        }
        if (b > 5) {
            System.out.println("y");
        } else {
            System.out.println("z");
        }


        /**
         * Задание 2
         */

        int rnd = (int) (Math.random() * 10) - (int) (Math.random() * 10);
        System.out.println(rnd);
        if (rnd < 0) {
            System.out.println("отрицательное число");
        } else {
            System.out.println("положительное число");
        }

        /**
         * Задание 3
         */

        int a03 = (int) (Math.random() * 15);
        int b03 = (int) (Math.random() * 15);
        int c03 = (int) (Math.random() * 15);
        System.out.println(a03 + ", " + b03 + ", " + c03);
        System.out.println(Math.max(Math.max(a03, b03), c03));

        int largestNumber;
        String varName = "";
        if (a03 >= b03) {
            if (a03 >= c03) {
                largestNumber = a03;
                varName = "a";
            } else {
                largestNumber = c03;
                varName = "c";
            }
        } else {
            if (b03 >= c03) {
                largestNumber = b03;
                varName = "b";
            } else {
                largestNumber = c03;
                varName = "c";
            }
        }
        System.out.println("Largest number is variable " + varName + " = " + largestNumber);


        /**
         * Задание 4
         */

        /**
         * Задание 5
         */
        int a05 = (int) (Math.random() * 5);
        int b05 = (int) (Math.random() * 5);
        int c05 = (int) (Math.random() * 5);

        int d = b05 * b05 - 4 * a05 * c05;
        if (d > 0) {
            System.out.println(2);
        } else if (d < 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        /**
         * Задание 6
         */

        /**
         * Задание 7
         */

        /**
         * Задание 8
         */

        /**
         * Задание 9
         */

        /**
         * Задание 10
         */

        /**
         * Задание 11
         */

    }

}
