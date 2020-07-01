package buseduc.javacourse.prax.p04_if;

import java.util.HashMap;
import java.util.Scanner;

public class Prax_04_vz {
    public static void main(String[] args) {

        /**
         * Практикум. Условные переходы
         */

        /**
         * Задание 1
         */

        System.out.println("Task 1:");
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

        System.out.println("Task 2:");
        int a2 = (int) (Math.random() * 10) - (int) (Math.random() * 10);
        if (a2 < 0) {
            System.out.println(a2 + " отрицательное число");
        } else {
            System.out.println(a2 + " отрицательное число");
        }

        /**
         * Задание 3
         */

        System.out.println("Task 3: ");
        int a3 = (int) (Math.random() * 15);
        int b3 = (int) (Math.random() * 15);
        int c3 = (int) (Math.random() * 15);
        System.out.println(a3 + ", " + b3 + ", " + c3);
//        System.out.println(Math.max(Math.max(a3, b3), c3));

        int largestNumber;
        String varName = "";
        if (a3 >= b3) {
            if (a >= c3) {
                largestNumber = a3;
                varName = "a";
            } else {
                largestNumber = c3;
                varName = "c";
            }
        } else {
            if (b3 >= c3) {
                largestNumber = b3;
                varName = "b";
            } else {
                largestNumber = c3;
                varName = "c";
            }
        }
        System.out.println("Largest number is " + varName + " = " + largestNumber);

        /**
         * Задание 4
         */

        System.out.println("Task 4:");
        int year = (int) (Math.random() * 2020);

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " обычный год");
        }

        /**
         * Задание 5
         */

        System.out.println("Task 5:");
        int a5 = (int) (Math.random() * 5);
        int b5 = (int) (Math.random() * 5);
        int c5 = (int) (Math.random() * 5);
        int d = b5 * b5 - 4 * a5 * c5;
        if (d > 0) {
            System.out.println("2");
        } else if (d == 0) {
            System.out.println("1");
        } else if (d < 0) {
            System.out.println("0");
        }

        /**
         * Задание 6
         */

        System.out.println("Task 6:");
        int a6 = (int) (Math.random() * 7) + 1;
        System.out.println(a6);
        if (a6 == 1) {
            System.out.println("Понедельник");
        } else if (a6 == 2) {
            System.out.println("Вторник");
        } else if (a6 == 3) {
            System.out.println("Среда");
        } else if (a6 == 4) {
            System.out.println("Четверг");
        } else if (a6 == 5) {
            System.out.println("Пятница");
        } else if (a6 == 6) {
            System.out.println("Суббота");
        } else if (a6 == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Не знаем такого");
        }

        /**
         * Задание 7
         */

        System.out.println("Task 7:");
        int x = (int) (Math.random() * 5);
        switch (x) {
            case 1:
                x += 2;
                break;
            case 2:
                x += 4;
                break;
            case 3:
                x++;
                break;
            default:
                x += 2;
                break;
        }
        System.out.println(x);

        /**
         * Задание 8
         */

        System.out.println("Task 8:");
        int a8 = (int) (Math.random() * 7) + 1;
        System.out.print(a8);
        String dayString;
        switch (a8) {
            case 1:
                dayString = "Понедельник";
                break;
            case 2:
                dayString = "Вторник";
                break;
            case 3:
                dayString = "Среда";
                break;
            case 4:
                dayString = "Четверг";
                break;
            case 5:
                dayString = "Пятница";
                break;
            case 6:
                dayString = "Суббота";
                break;
            case 7:
                dayString = "Воскресенье";
                break;
            default:
                dayString = "Не знаем такого";
                break;
        }
        System.out.println(" это " + dayString);


        /**
         * Задание 9
         */

        System.out.println("Task 9:");
        int num = (int) (Math.random() * 10) - (int) (Math.random() * 10);
        System.out.println(num >= 0 ? num : -num);

        /**
         * Задание 10
         */

        System.out.println("Task 10:");
        String word = "John";
        boolean ch = Character.isUpperCase(word.charAt(0));
        if (ch == true) {
            System.out.println(word + " is name");
        } else {
            System.out.println(word + " is word");
        }

        /**
         * Задание 11
         */

        System.out.println("Task 11:");
        HashMap<Integer, String> rockPaperScissors = new HashMap<>();
        rockPaperScissors.put(1, "камень");
        rockPaperScissors.put(2, "бумага");
        rockPaperScissors.put(3, "нонижницы");

        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        final int PLAYER1 = 1, PLAYER2 = 2, TIE = 3;
        int player1, player2, winner = 0;
        int winsPlayer1 = 0, winsPlayer2 = 0;
        int sum = 0;
        do {
            player1 = (int) (Math.random() * 3) + 1;
            player2 = (int) (Math.random() * 3) + 1;

            switch (player1) {
                case ROCK:
                    if (player2 == SCISSORS)
                        winner = PLAYER1;
                    else if (player2 == PAPER)
                        winner = PLAYER2;
                    else
                        winner = TIE;
                    break;

                case PAPER:
                    if (player2 == ROCK)
                        winner = PLAYER1;
                    else if (player2 == SCISSORS)
                        winner = PLAYER2;
                    else
                        winner = TIE;
                    break;

                case SCISSORS:
                    if (player2 == PAPER)
                        winner = PLAYER1;
                    else if (player2 == ROCK)
                        winner = PLAYER2;
                    else
                        winner = TIE;
            }

            if (winner == PLAYER1) {
                System.out.println("Игрок a (" + rockPaperScissors.get(player1) + ") выиграл игрока b ("
                        + rockPaperScissors.get(player2) + ")");
                winsPlayer1++;
                sum++;
            } else if (winner == PLAYER2) {
                System.out.println("Игрок b (" + rockPaperScissors.get(player2) + ") выиграл игрока a ("
                        + rockPaperScissors.get(player1) + ")");
                winsPlayer2++;
                sum++;
            } else {
                System.out.println("Ничья!");
                sum++;
            }
        }
        while (sum <= 2);

        System.out.print("Счёт " + winsPlayer1 + ":" + winsPlayer2 + ". ");
        if (winsPlayer1 == winsPlayer2) {
            System.out.println("Победила дружба");
        } else if (winsPlayer1 <= winsPlayer2) {
            System.out.println("Победил игрок b");
        } else System.out.println("Победил игрок a");
    }
}
