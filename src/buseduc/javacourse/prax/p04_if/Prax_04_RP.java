package buseduc.javacourse.prax.p04_if;


public class Prax_04_RP {
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
        if(rnd < 0){
            System.out.println("Отрицательное число");
        } else if(rnd > 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Чмсло равно нулю");
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

        //в соответствии с григорианским календарем, год является високосным,
        //если его номер кратен 4, но не кратен 100, а также если он кратен 400.
        int a = (int) (Math.random() * 2020);
        if((a % 4 == 0) & (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println(a + " Високосный год");
        } else {
            System.out.println(a + " Обычный год");
        }


        /**
         * Задание 5
         */
        int a = (int) (Math.random() * 5);
        int b = (int) (Math.random() * 5);
        int c = (int) (Math.random() * 5);

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        //int d = b * b - 4 * a * c;
        int d = (int) (Math.pow(b, 2) - 4 * a * c);
        System.out.println("D = " + d);
        if (d > 0) {
            System.out.println("Корней: 2");
        } else if (d == 0) {
            System.out.println("Корней: 1");
        }
        else if (d < 0) {
            System.out.println("Корней: 0");
        }


        /**
         * Задание 6
         */

        int a = (int) (Math.random() * 7) + 1;

        if(a == 1) {
            System.out.println(a + " - Понедельник");
        } else if (a == 2) {
            System.out.println(a + " - Вторник");
        } else if (a == 3) {
            System.out.println(a + " - Среда");
        } else if (a == 4) {
            System.out.println(a + " - Четверг");
        } else if (a == 5) {
            System.out.println(a + " - Пятница");
        }  else if (a == 6) {
            System.out.println(a + " - Суббота");
        } else {
            System.out.println(a + " - Воскресенье");
        }

        /**
         * Задание 7
         */

        int x = (int) (Math.random() * 5);
        System.out.println(x);
        switch (x) {
            case 1:
                x += 2;
                break;
            case 2:
                x++;
                break; //иначе продолжить выполнять код и переменная х пройдет все преобразования до break
            case 3:
                x += 4;
                break; //иначе продолжить выполнять код и переменная х пройдет все преобразования до break
            default:
                x += 2;
                break;
        }
        System.out.print(x);


        /**
         * Задание 8
         */

        int a = (int) (Math.random() * 7) + 1;

        switch (a) {
            case 1:
                System.out.println(a + " - Понедельник");
                break;
            case 2:
                System.out.println(a + " - Вторник");
                break;
            case 3:
                System.out.println(a + " - Среда");
                break;
            case 4:
                System.out.println(a + " - Четверг");
                break;
            case 5:
                System.out.println(a + " - Пятница");
                break;
            case 6:
                System.out.println(a + " - Суббота");
                break;
            default:
                System.out.println(a + " - Воскресенье");
                break;
        }


        /**
         * Задание 9
         */

        int num = (int) (Math.random() * 10) - (int) (Math.random() * 10);
        int result = (num >= 0) ? num : -num;
        System.out.println(result);

        /**
         * Задание 10
         */

        String word = "Roman";
        boolean isUpCase = Character.isUpperCase(word.charAt(0));
        String result = isUpCase ? word + " is name" : word + " is word";
        System.out.println(result);

        /**
         * Задание 11
         */



 /*       static int player1Value() {
            int a = (int) (Math.random() * 3 + 1);
            return a;
        }

        static int player2Value() {
            int b = (int) (Math.random() * 3 + 1);
            return b;
        }*/

            int gameCount = 0;
            int player1Wins = 0;
            int player2Wins = 0;
            String winner;

            //1 - камень, 2 - ножницы, 3 - бумага
            while (gameCount < 3) {
                //int player1 = player1Value();
                //int player2 = player2Value();
                int player1 = (int) (Math.random() * 3 + 1);
                int player2 = (int) (Math.random() * 3 + 1);
                if (player1 == 1) {
                    if (player2 == 1) {
                        System.out.println("Ничья");
                    } else if (player2 == 2) {
                        System.out.println("Игрок A (камень) выиграл игрока Б (ножницы)");
                        player1Wins++;
                    } else if (player2 == 3) {
                        System.out.println("Игрок Б (бумага) выиграл игрока А (камень)");
                        player2Wins++;
                    }
                    gameCount++;
                } else if (player1 == 2) {
                    if (player2 == 1) {
                        player2Wins++;
                        System.out.println("Игрок Б (камень) выиграл игрока А (ножницы)");
                    } else if (player2 == 2) {
                        System.out.println("Ничья");
                    } else if (player2 == 3) {
                        System.out.println("Игрок A (ножницы) выиграл игрока Б (бумага)");
                        player1Wins++;
                    }
                    gameCount++;
                } else if (player1 == 3) {
                    if (player2 == 1) {
                        System.out.println("Игрок A (бумага) выиграл игрока Б (камень)");
                        player1Wins++;
                    } else if (player2 == 2) {
                        System.out.println("Игрок Б (ножницы) выиграл игрока А (бумага)");
                        player2Wins++;
                    } else if (player2 == 3) {
                        System.out.println("Ничья");
                    }
                    gameCount++;
                }
            }
            if (player1Wins > player2Wins) {
                winner = "А";
                System.out.println("Счет " + player1Wins + ":" + player2Wins + ". " + "Победил игрок " + winner);
            } else if (player1Wins < player2Wins) {
                winner = "Б";
                System.out.println("Счет " + player1Wins + ":" + player2Wins + ". " + "Победил игрок " + winner);
            } else {
                System.out.println("Счет " + player1Wins + ":" + player2Wins + ". " + "Ничья!");
            }

        }
    }

