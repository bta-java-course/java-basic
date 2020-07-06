package buseduc.javacourse.prax.p04_if;

public class Prax_04_pr {
    public static void main(String[] args) {

        /**
         * Практикум. Условные переходы
         */

        /**
         * Задание 1
         */
        System.out.println("Task1 ");
        int a = 4;
        int b = 6;
        if (a < b) {
            System.out.print("x");
        }
        if (b > 5) {
            System.out.print("y");
        } else {
            System.out.print("z");
        }
        /**
         * Задание 2
         */
        System.out.println("");

        System.out.println("Task2 ");

        int a2 = (int) (Math.random() * 10) - (int) (Math.random() * 10);
        System.out.println(a2);


        if (a2 < 0) {
            System.out.print("Negative number");
        } else if (a2 > 0) {
            System.out.print("Positive number");
        } else {
            // System.out.print(" ");
        }


        /**
         * Задание 3
         */
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Task3 ");


        a = (int) (Math.random() * 15);
        b = (int) (Math.random() * 15);
        int c = (int) (Math.random() * 15);

        System.out.println(a + " " + b + " " + c);


        int largestNumber;
        if (a >= b) {
            if (a >= c) {
                largestNumber = a;
            } else {
                largestNumber = c;
            }
        } else {
            if (b >= c) {
                largestNumber = b;
            } else {
                largestNumber = c;
            }
        }
        System.out.println("Largest number is " + largestNumber);

        if (largestNumber == a) {
            System.out.println("a");
        }
        ; // @VS: лишняя точка с запятой - ухудшает читаемость

        if (largestNumber == b) {
            System.out.println("b");
        }
        ;

        if (largestNumber == c) {
            System.out.println("c");
        }
        ;


        /**
         * Задание 4
         */
        System.out.print("\n");

        System.out.println("Task4");

        a = (int) (Math.random() * 2020);
        //System.out.println(a);


        if (a % 4 == 0) {
            if ((a % 100 != 0) | (a % 400 == 0)) {

                System.out.println(a + " is leap year.");
            }
        } else

            System.out.println(a + "" + " is not leap year.");


        /**
         * Задание 5
         */

        System.out.print("\n");
        System.out.println("Task5");

        a = (int) (Math.random() * 5);
        b = (int) (Math.random() * 5);
        c = (int) (Math.random() * 5);
        System.out.println(" a= " + a + " b= " + b + " c= " + c);
        if (a == 0) {
            System.out.println(" This equation is not quadratic.");
        } else {
            int d = b * b - 4 * a * c;
            if (d == 0) System.out.println(" This equation has one real root.");
            if (d < 0) System.out.println(" This equation has no real roots.");
            if (d > 0) System.out.println(" This equation has two real roots."); // @VS: лестница лучше читается

        }
        /**
         * Задание 6
         */
        System.out.print("\n");
        System.out.println("Task6");


        a = (int) (Math.random() * 7) + 1;
        String ring;

        System.out.println(a);

        if (a == 1) {
            System.out.println(" Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("a is not equal to 1 or 2 or 3 or 4 or 5 or 6 or 7");
        }


        //  switch (a) {
        //    case 7: ring = "Sunday";
        //      break;
        // case 6: ring = "Saturday";
        //    break;
        // case 2: ring = "Tuesday";
        //      break;
        //  case 1: ring = "Monday";
        //      break;
        //   case 4: ring = "Thursday";
        //       break;
        //   case 5: ring = "Friday";
        //     break;
        //  case 3: ring = "Wednesday";
        //       break;
        //   default: ring = "a is not  not 1 or 2 or 3 or 4 or 5 or 6 or 7";


        //     break;
        //  }


        /**
         * Задание 7
         */

        System.out.print("\n");
        System.out.println("Task7");

        int x = (int) (Math.random() * 5);

        System.out.println(x);

        switch (x) {
            case 1:
                x += 2;
                //   break;
            case 2:
                x++;
            case 3:
                x += 4;
            default:
                x += 2;
        }
        System.out.print(x);


        System.out.print("\n");
        System.out.println(" One has to remove `break`.");

        /**
         * Задание 8
         */
        System.out.print("\n");
        System.out.println("Task8");

        a = (int) (Math.random() * 7) + 1;
        //String ring;

        switch (a) {
            case 7:
                ring = "Sunday";
                break;
            case 6:
                ring = "Saturday";
                break;
            case 2:
                ring = "Tuesday";
                break;
            case 1:
                ring = "Monday";
                break;
            case 4:
                ring = "Thursday";
                break;
            case 5:
                ring = "Friday";
                break;
            case 3:
                ring = "Wednesday";
                break;
            default:
                ring = "a is not  not 1 or 2 or 3 or 4 or 5 or 6 or 7";


                break; // @VS: последний break не нужен
        }

        System.out.println(ring + "   " + a);
        /**
         * Задание 9
         */
        System.out.print("\n");
        System.out.println("Task9");

        int num = (int) (Math.random() * 10) - (int) (Math.random() * 10);

        System.out.println((num));

        //  if (num >= 0) {
        //     System.out.println(num);
        //       return;
        //  }
        //  System.out.println(-num);


        //num = ( num >=0) ? num*1 : num*(-1);

        System.out.println(Math.abs(num));

        System.out.print("\n");
        System.out.println("Task10");

        String word = "ohn";
        //String word1 = "ohn";
        char r= word.charAt(0);
        //char r1= word1.charAt(0);

        //System.out.println(r + " " + " "+ r1);
        //System.out.println(Character.isUpperCase(r1));


        boolean cl = Character.isUpperCase(r);

        if(cl){
            System.out.print(word + " is name");
        }
        else{
            System.out.print(word+" is word"); // @VS: Желательно использовать тернарные операторы!
        }


        int num1=0;
        int num2=0;

        num1 = (int) (Math.random() * 3+ 1);
        num2 = (int) (Math.random() * 3+ 1);
        int su=num1*num1-num2*num2;
        int p1full=0;
        int p2full=0;

        System.out.println(  su ); // @VS: плохое название переменной - непонятно
        System.out.println(  num1 );
        System.out.println(  num2 );




        if (su== 0) {
            System.out.println("  STANDOFF  ");
        }

        if (su== 3) {
            System.out.println("  1 ");
            p1full++;
        }

        if (su== -3) {
            System.out.println("  2 ");
            p2full++;
        }


        if (su== -8) {
            System.out.println("  2  ");
            p2full++;
        }

        if (su== 8) {
            System.out.println("  1 ");
            p1full++;
        }


        if (su== -5) {
            System.out.println("  1 ");
            p1full++;
        }

        if (su== 5) {
            System.out.println("  2 ");
            p2full++;
        }

        System.out.println( " 3 tour   " + p1full+"," +p2full);

        if (p1full > p2full) {System.out.println("1 is winner!");}
        else if (p1full < p2full) {System.out.println("2 is winner!");}
        else  {System.out.println(" Overall Standoff");}



        // @VS: нет информации в конце каждого кона "Игрок a (камень) выиграл игрока b (ножницы)"




    }

}
