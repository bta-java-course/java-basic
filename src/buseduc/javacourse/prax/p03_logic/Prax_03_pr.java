package buseduc.javacourse.prax.p03_logic;

public class Prax_03_pr {
    public static void main(String[] args) {

        /**
        * Практикум. 3  Logic operations
        */

        /**
         * Задание 1
         */
        System.out.println("Task1 ");

        boolean iAmStudent1 = false;     // я студент
        boolean iLoveMath1 = true ;      // я люблю математику
        boolean result1;         // ответ

        result1= ! iAmStudent1 ;
        System.out.println(result1);

        result1= iLoveMath1 ;
        System.out.println(result1);

        result1= (!iAmStudent1) && iLoveMath1;
        System.out.println(result1);

        /**
         * Задание 2
         */

        System.out.println("Task2 ");

        boolean iAmStudent2 = false;     // я студент
        boolean iLoveMath2 = true ;      // я люблю математику
        boolean result2;         // ответ

        result2=!iAmStudent2 || !iLoveMath2;
        System.out.println(result2);

        result2= iAmStudent2 && !iLoveMath2  ||  !iAmStudent2;
        System.out.println(result2);

        result2= iLoveMath2 && !iAmStudent2 || iAmStudent2;
        System.out.println(result2);

        /**
         * Задание 3
         */
        System.out.println("Task3 ");

        int x3 = 5;
        int y3 = 7;
        boolean z3 = x3 < y3;
        System.out.println(z3);

        /**
         * Задание 4
         */
        System.out.println("Task4 ");

        int a4 = 0b100;
        int b4 = 4;
        boolean c4 = (a4 >= b4);
        System.out.println(c4);

        /**
         * Задание 5
         */
        System.out.println("Task5 ");

        boolean a5 = true;
        boolean b5 = false;
        a5 &= b5;
        a5 |= !b5;

        System.out.println(a5);
        System.out.println(b5);

        /**
         * Задание 6
         *
         * Есть три национальности: минойцы, трояне и ахейцы. Напишите формулы,
         * которые позволят вычислить людей, предки которых подходят под данные
         * условия:
         * 1. Были только минойцы, не было троян и ахейцев.
         * 2. Были минойцы или ахейцы, но не было троян.
         * 3. Обязательно были трояне и минойцы, точно не было ахейцев.
         * 4. Предки могли быть из любого из трех народов.
         * 5. Предки точно были из всех трех народов.
         * 6. Среди предков точно были трояне, а другие если были не минойцы, то
         * ахейцы.
         *
         */
        System.out.println("Task6 ");
        System.out.println("Task6 p.1 ");

        boolean m6=true;
        boolean t6=false;
        boolean a6=false;
        boolean r61=m6 & !t6 & !a6;
        System.out.println(r61);

        System.out.println("Task6 p.2 ");

         m6=true;
         t6=false;
         a6=true;
        boolean r62=(m6 | a6) & !t6;
        System.out.println(r62);

        System.out.println("Task6 p.3 ");

        m6=true;
        t6=true;
        a6=false;
        boolean r63=(m6 & t6) & !a6;
        System.out.println(r63);

        System.out.println("Task6 p.4 ");

        m6=true;
        t6=false;
        a6=false;
        boolean r64=m6 || a6 || t6;
        System.out.println(r64);

        System.out.println("Task6 p.5 ");

        m6=true;
        t6=false;
        a6=true;
        boolean r65=m6 && a6 && t6;
        System.out.println(r65);

        System.out.println("Task6 p.6 ");

        m6=false;
        t6=true;
        a6=true;
        r65=t6 && ((a6 && !m6) || m6);
        System.out.println(r65);

        /**
         * Задание 7
         */
        System.out.println("Task7 ");

        int rand = (int) (Math.random() * 2);
        boolean a = rand == 0;
        boolean result = !a && 2 / rand > 1;
        System.out.println(result);
        /**
         * Задание 8
         */
        System.out.println("Task8 ");

        boolean isTrustedDriver = true;
        boolean isTooYoung = true;
        boolean hasChildren = true;
        boolean canDrive = isTrustedDriver && hasChildren || isTrustedDriver && !hasChildren || isTrustedDriver && !isTooYoung;
        System.out.println(canDrive);

        canDrive = isTrustedDriver && !isTooYoung; //  "isTrustedDriver && hasChildren || isTrustedDriver && !hasChildren" has always the same value equal to "true"".
        System.out.println(canDrive);

        /**
         * Задание 9
         */
        System.out.println("Task9 ");

        int a9 = 1;
        int b9 = 2;
        boolean complicated = ( !(a9 < b9) && ! (a9 > b9));  // "complicated" has always (for any a and b) the same value equal to "false"".
        System.out.println(complicated);

        /**
         * Задание 10
         */
        System.out.println("Task10 ");

        int a10=5;
        int b20=5;
        System.out.println(a10 & b20);

        a10=19;
        b20=25;

        System.out.println(a10 & b20);

        a10=57;
        b20=31;

        System.out.println(a10 & b20);

        /**
         * Задание 11
         */
        System.out.println("Task11 ");

        int a11=1;
        int b21=5;
        System.out.println(a11 | b21);

        a11=16;
        b21=1;

        System.out.println(a11 | b21);

        a11=16;
        b21=9;

        System.out.println(a11 | b21);

        /**
         * Задание 12
         */
        System.out.println("Task12 ");

        int a12=96;
        int b22=101;
        System.out.println(a12 ^ b22);

        a12=16;
        b22=1;

        System.out.println(a12 ^ b22);

        a12=16;
        b22=9;

        System.out.println(a12 ^ b22);

        /**
         * Задание 13
         */
        System.out.println("Task13 ");

        int a13=17;
        System.out.println(a13);
        a13 = a13>>1;
        System.out.println(a13);

        a13=17;
        System.out.println(a13);
        a13 = a13<<4;
        System.out.println(a13);

        a13=23;
        System.out.println(a13);
        a13 = a13>>2;
        System.out.println(a13);




    }

}
