package buseduc.javacourse.prax.p03_logic;

public class Prax_03_vz {
    public static void main(String[] args) {

        /**
        * Практикум. Арифметические операции
        */

        /**
         * Задание 1
         */

        System.out.println("Task 1:");
        boolean iAmStudent = true;
        boolean iLoveMath = false;
        boolean result;

        result = !iAmStudent;
        result = iLoveMath;
        result = iAmStudent && !iLoveMath;
        result = !iAmStudent && iLoveMath;

        /**
         * Задание 2
         */

        boolean iAmStudent2 = true;
        boolean iLoveMath2 = true;
        boolean result2;

        result2 = !iLoveMath2 || !iAmStudent2;
        result2 = iAmStudent2 && !iLoveMath2 || !iAmStudent2;
        result2 = iLoveMath2 && !iAmStudent2 || iAmStudent;

        /**
         * Задание 3
         */

        System.out.println("Task 3:");
        int x3 = 5;
        int y3 = 7;
        boolean z3 = x3 < y3;

        /**
         * Задание 4
         */

        System.out.println("Task 4:");
        int a4 = 0b100;
        int b4 = 3;
        boolean c4 = a4 > b4;

        /**
         * Задание 5
         *
         * a = true & b = false даст false, a = false | b = false даст
         */

        System.out.println("Task 5:");
        boolean a5 = true;
        boolean b5 = false;
        a5 &= b5;
        a5 |= !b5;
        System.out.println(a5); // @VS: Какое значение будет у переменной a после выполнения кода? Почему?

        /**
         * Задание 6
         */

        System.out.println("Task 6:");
        boolean minoans = true;
        boolean trojans = true;
        boolean achaeans = true;

        boolean f1 = minoans & !trojans & !achaeans;
        boolean f2 = (minoans | achaeans) & !trojans;
        boolean f3 = (trojans & minoans) & !achaeans; // @VS: скобки не обязательны
        boolean f4 = minoans || trojans || achaeans;
        boolean f5 = minoans && trojans && achaeans;
        boolean f6 = trojans && minoans ^ achaeans;

        /**
         * Задание 7
         */

        System.out.println("Task 7:");
        int rand = (int) (Math.random() * 2);
        boolean a7 = rand == 0;
        boolean result7 = !a7 && 2 / rand > 1;
        System.out.println(result7); // @VS: хотелось объяснения

        /**
         * Задание 8
         */

        System.out.println("Task 8");
        boolean isTrustedDriver = true;
        boolean isTooYoung = false;
        boolean hasChildren = true;

        boolean canDrive = isTrustedDriver && !isTooYoung;

        /**
         * Задание 9
         */

        System.out.println("Task 9:");
        int a9 = 1;
        int b9 = 2;
        boolean complicated = (a9 < b9) && (a9 > b9); // @VS: неверно
        System.out.println(complicated);

        /**
         * Задание 10
         */

        /**
         * Задание 11
         */

        /**
         * Задание 12
         */

        /**
         * Задание 13
         */

    }

}
