package buseduc.javacourse.prax.p03_logic;

import org.w3c.dom.ls.LSOutput;

public class Prax_03_IL {
    public static void main(String[] args) {

        /**
        * Практикум. Арифметические операции
        */




        /**
         * Задание 1
         * **/

        System.out.println("Задание 1");
        boolean iAmStudent = true;     // я студент
        boolean iLoveMath = false;      // я люблю математику
        boolean result1;
        boolean result2;
        boolean result3;
        boolean result4;

        result1 = !iAmStudent;
        result2 = iLoveMath;
        result3 = iAmStudent & !iLoveMath;
        result4 = !iAmStudent & iLoveMath;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);





        /**
         * Задание 2
         */
        System.out.println("Задание 2");
        boolean iAmStudent1 = true;     // я студент
        boolean iLoveMath2 = true;      // я люблю математику
        boolean resultA;
        boolean resultB;
        boolean resultC;   // ответ

        resultA = !iLoveMath2 | !iAmStudent1;
        resultB = iAmStudent1 & !iLoveMath2 | !iAmStudent1;
        resultC = iLoveMath2 & !iAmStudent1 | iAmStudent1;
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);



        /**
         * Задание 3
         */
        System.out.println("Задание 3");
        int x = 5;
        int y = 7;
        boolean z = x < y;
        System.out.println(z);


        /**
         * Задание 4
         */
        System.out.println("Задание 4");
        int a = 0b100;
        int b = 4;
        boolean c = a >= b;
        System.out.println(c);




        /**
         * Задание 5
         */
        System.out.println("Задание 5");
        boolean a5 = true;
        boolean b5 = false;
        a5 &= b5;
        a5 |= !b5;
        System.out.println(a5); // @VS: Какое значение будет у переменной a после выполнения кода? Почему?


        /**
         * Задание 6
         *Есть три национальности: минойцы, трояне и ахейцы. Напишите формулы,
         * которые позволят вычислить людей, предки которых подходят под данные условия:
         * Были только минойцы, не было троян и ахейцев.
         * Были минойцы или ахейцы, но не было троян.
         * Обязательно были трояне и минойцы, точно не было ахейцев.
         * Предки могли быть из любого из трех народов.
         * Предки точно были из всех трех народов.
         * Среди предков точно были трояне, а другие если были не минойцы, то ахейцы.
         */
        System.out.println("Задание 6");
        System.out.println("Задание 6.1");

        boolean minyon = true;
        boolean troyan = false;
        boolean axeyc = false;

        boolean d3 = minyon & !troyan &!axeyc; // @VS: или так: minyon & !(troyan | axeyc)
        System.out.println(d3);
        System.out.println("Задание 6.2");
        boolean d4 = minyon | axeyc & !troyan; // @VS: неправильно
        System.out.println(d4);
        System.out.println("Задание 6.3");
        boolean d5 = troyan & minyon & !axeyc;
        System.out.println(d5);
        System.out.println("Задание 6.4");
        boolean d6 = minyon | troyan | axeyc;
        System.out.println(d6);
        System.out.println("Задание 6.5");
        boolean d7 = minyon & troyan & axeyc;
        System.out.println(d7);
        System.out.println("Задание 6.5"); // @VS: 6.6 ?






        /**
         * Задание 7
         * добавить условный оператор &&
         */
        System.out.println("Задание 7");
        int rand = (int) (Math.random() * 2);
        boolean a7 = rand == 0;
        boolean result7 = !a7 && 2 / rand > 1;
        System.out.println(result7);

        /**
         * Задание 8
         */
        System.out.println("Задание 8");
        boolean isTrustedDriver = true;
        boolean isTooYoung = false;
        boolean hasChildren = true;

        boolean canDrive = 	isTrustedDriver && hasChildren ||
                isTrustedDriver && !hasChildren ||
                isTrustedDriver && !isTooYoung;


        /**
         * Задание 9
         */

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
