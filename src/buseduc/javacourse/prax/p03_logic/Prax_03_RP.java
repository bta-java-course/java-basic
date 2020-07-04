package buseduc.javacourse.prax.p03_logic;

public class Prax_03_RP {
    public static void main(String[] args) {

        /**
        * Практикум. Арифметические операции
        */

        /**
         * Задание 1
         * Напишите выражения которые проверят, что следующие утверждения истинны:
         * Я не студент
         * Я люблю математику
         * я студент и не люблю математику
         * я не студент и люблю математику
         */
        boolean iAmStudent = true;
        boolean iLoveMath = true;
        boolean result1, result2, result3, result4;

        result1 = !iAmStudent; //Я не студент
        result2 = iLoveMath; //Я люблю математику
        result3 = iAmStudent & !iLoveMath; //я студент и не люблю математику
        result4 = !iAmStudent & iLoveMath; //я не студент и люблю математику
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4 + "\n");



        /**
         * Задание 2
         * Я не люблю математику или я не студент
         * Я студент и не люблю математику или я не студент
         * Я люблю математику и я не студент или я студент
         */
        result1 = !iLoveMath | !iAmStudent; //Я не люблю математику или я не студент
        result2 = iAmStudent & !iLoveMath | !iAmStudent; //Я студент и не люблю математику или я не студент
        result3 = iLoveMath & !iAmStudent | iAmStudent; //Я люблю математику и я не студент или я студент
        System.out.println(result1 + "\n" + result2 + "\n" + result3);

        /**
         * Задание 3
         */

        int x = 5;
        int y = 7;
        boolean z = x < y;

        /**
         * Задание 4
         */

        int a = 0b100;
        int b = 4;
        boolean c = a >= b;
        System.out.println("Exercise 4: ");
        System.out.println(a);
        System.out.println(c);

        /**
         * Задание 5
         */

        //Задание 5.1
        boolean a5 = true;
        boolean b5 = false;
        a5 &= b5; //a5 = a5 & b5,   true & false = false
        a5 |= b5; //a5 = a5 | b5,   false | false = false
        System.out.println("Exercise 5.1: ");
        System.out.println(a5); // a5 = false

        //Задание 5.2
        boolean a52 = true;
        boolean b52 = false;
        a52 &= b52;
        a52 |= !b52;
        System.out.println("Exercise 5.2: ");
        System.out.println(a52);

        /**
         * Задание 6
         * Есть три национальности: минойцы, трояне и ахейцы. Напишите формулы, которые позволят вычислить людей, предки которых подходят под данные условия:
         * 61. Были только минойцы, не было троян и ахейцев.
         * 62. Были минойцы или ахейцы, но не было троян.
         * 63 Обязательно были трояне и минойцы, точно не было ахейцев.
         * 64 Предки могли быть из любого из трех народов.
         * 65 Предки точно были из всех трех народов.
         * 66 Среди предков точно были трояне, а другие если были не минойцы, то ахейцы.
         */

        //Задание 6.1
        boolean minoici = true;
        boolean trojane = true;
        boolean aheici = true;

        //Задание 6.1
        boolean genesis1 = minoici & !aheici & !trojane;
        //Задание 6.2
        boolean genesis2 = (minoici | aheici) & !trojane;
        //Задание 6.3
        boolean genesis3 = (trojane & minoici) & !aheici;
        //Задание 6.4
        boolean genesis4 = minoici | aheici | trojane;
        //Задание 6.5
        boolean genesis5 = minoici & aheici & trojane;
        //Задание 6.6
        boolean genesis6 = trojane & (!minoici & aheici);


        /**
         * Задание 7
         *
         */
        int rand = (int) (Math.random() * 2);
        boolean a = rand == 0;
        System.out.println("rand = " + rand);
        System.out.println("a = " + a);
        //Делить на 0 нельзя. Если rand = 0, выдаст ошибку.
        // если rand = 0, то нужно исключить выполнение 2 / rand
        boolean result = !a && 2 / rand > 1;
        System.out.println("Exercise 7: ");
        System.out.println(result);


        /**
         * Задание 8
         */
        boolean isTrustedDriver = true;
        boolean isTooYoung = false;
        boolean hasChildren = true;

        //boolean canDrive = 	isTrustedDriver && hasChildren || isTrustedDriver && !hasChildren || isTrustedDriver && !isTooYoung;
        boolean canDrive = isTrustedDriver & !isTooYoung;

        /**
         * Задание 9
         */
        int a = 1;
        int b = 2;
        //boolean complicated = ! (a < b) && ! (a > b);
        boolean complicated = (a < b) & (a > b);

        /**
         * Задание 10
         */
        int a = 5 & 7; //5
        int b = 31 & 17 ; //17
        int c = 29 & 27; //25
        System.out.println("a,  b, c = " + a + ", " + b + ", " + c);

        /**
         * Задание 11
         */
        int a = 4 | 1; //5
        int b = 17 | 17 ; //17
        int c = 24 | 9; //25
        System.out.println("a,  b, c = " + a + ", " + b + ", " + c);
        /**
         * Задание 12
         */
        int a = 4 ^ 1; //5
        int b = 14 ^ 31 ; //17
        int c = 13 ^ 20; //25
        System.out.println("a,  b, c = " + a + ", " + b + ", " + c);
        /**
         * Задание 13
         */
        //Из числа 17 число 8
        //Из числа 17 число 272
        //Из числа 23 число 5.
        int a = 17;
        int f = 23;
        int res1 = a >> 1;
        int res2 = a << 4;
        int res3 = f >> 2;
        System.out.println("a, s, f = "  + res1 + ", " + res2 + ", " + res3 );


    }

}
