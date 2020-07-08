package buseduc.javacourse.prax.p04_if;

public class Prax_04_IL {
    public static void main(String[] args) {

        /**
        * Практикум. Условные переходы
        */


        /**
         * Задание 1
         */
        System.out.println("Task 1: ");

        int a = 4;
        int b = 6;
        if (a < b) {
            System.out.println("x");
        }
        if (b > 5) {
            System.out.println("y");
        } else {
            System.out.print("z");
        }




        /**
         * Задание 2
         */
        System.out.println("Task 2: ");
        int randomNum = (int) (Math.random() * 10) - (int) (Math.random() * 10);
        if(randomNum > 0){
            System.out.println(randomNum +" - это число положительное");
        }else if(randomNum < 0){
            System.out.println(randomNum +" - это число отрицательное");
        }



        /**
         * Задание 3
         */
        System.out.println("Task 3: ");
        int a3 = (int) (Math.random() * 15);
        int b3 = (int) (Math.random() * 15);
        int c3 = (int) (Math.random() * 15);

        System.out.print(a3 + ", ");
        System.out.print(b3 + ", ");
        System.out.println(c3 );

        if(a3>b3){
            System.out.println("a - "+ a3 + " самое большое число");
        }else if(a3>c3){
            System.out.println("a - "+ a3 + " самое большое число");
        }else if(b3 > a3){
            System.out.println("b - "+ b3 + " самое большое число");
        }else if(b3>c3){
            System.out.println("b - "+ b3 + " самое большое число");
        }else if(c3>a3){
            System.out.println("c - "+ c3 + " самое большое число");
        }else if(c3>b3){
            System.out.println("c - "+ c3 + " самое большое число");
        }




        /**
         * Задание 4
         */
        System.out.println("Task 4: ");
        int year = (int) (Math.random() * 2020) ;
        if(year % 4 == 0){
            System.out.println(year + " - високосный год ");
        }else if(year % 4 != 0){
            System.out.println(year + " - не високосный год");
        }


        /**
         * Задание 5
         */
        System.out.println("Task 5:");

        int a5 = (int) (Math.random() * 5);
        int b5 = (int) (Math.random() * 5);
        int c5 = (int) (Math.random() * 5);

        int d = b5 * b5 - 4 * a5 * c5;
        System.out.println(d);
        if (d>0){
            System.out.println("Выражение имеет два корня");
        }else if(d == 0 ){
            System.out.println("Выражение имеет один корень");
        }else if(d<0){
            System.out.println("выражение не имеет корней");
        }




        /**
         * Задание 6
         */


        System.out.println("Task6");


        a = (int) (Math.random() * 7) + 1;
        String loop;
        System.out.println(a);

        switch(a){
            case 7:
                System.out.println("Sunday");
            break;
            case 6:
                System.out.println("Saturday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 3:
                System.out.println("Wendsday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 1:
                System.out.println("Monday");
                break;

        }



        /**
         * Задание 7
         */
        System.out.println("Task 7: ");
        int x = (int) (Math.random() * 5);
        switch (x) {
            case 1:
                x += 2;
                break;
            case 2:
                x++;
            case 3:
                x += 4;
            default:
                x += 2;
        }
        System.out.print(x);

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
