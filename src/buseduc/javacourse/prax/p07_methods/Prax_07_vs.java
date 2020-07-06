package buseduc.javacourse.prax.p07_methods;

public class Prax_07_vs {
    public static void main(String[] args) {

        /**
        * Практикум. Методы
        */

        /**
         * Задание 1
         */

        /**
         * Задание 2
         */

        /**
         * Задание 3
         */

        /**
         * Задание 4
         */

        /**
         * Задание 5
         */

        /**
         * Задание 6
         */
        int randomInt = (int) Math.random() * 1000;

        System.out.println(calculateResult(randomInt));


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

    static int calculateResult(int inputNumber) {
        boolean hasRoot = hasIntegerRoot(inputNumber);
        boolean isEven = isEven(inputNumber);
        int result;
        if(hasRoot) {
            if(isEven) {
                result = sumOfPreviousSqrt(inputNumber);
            } else {
                result = sumOfNextSqrt(inputNumber);
            }
        } else {
            if(isEven) {
                result = biggerNumWithRoots(inputNumber);
            } else {
                result = smallerNumWithRoots(inputNumber);

            }
        }
        return result;
    }

    static boolean hasIntegerRoot(int inputNumber) {
        return true;
    }

    static int sumOfPreviousSqrt(int inputNumber) {
        return 0;
    }
    static int sumOfNextSqrt(int inputNumber) {
        return 0;
    }
    static int biggerNumWithRoots(int inputNumber) {
        return 0;
    }
    static int smallerNumWithRoots(int inputNumber) {
        return 0;
    }
    static boolean isEven(int inputNumber) {
        return inputNumber % 2 == 0;
    }



}
