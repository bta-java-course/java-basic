package buseduc.javacourse.prax.p07_methods;


import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.*;


public class Prax_07_RP {

    public static void main(String[] args) {

        /**
         * Практикум. Методы
         *  Задание 1
         */

        int min = min(10, 11, 5);
        System.out.println(min);

        //Задание 1.2
        int[] numbers = new int[]{1, 2, 3, -23, 8, 15};
        int min2 = min2(numbers);
        System.out.println("UNIVERSAL: " + min2);

        /**
         * Задание 2
         */
        double avg = avg(10, 11, 5);
        System.out.printf("Average: %2.2f\n", avg);

        //Задание 2.2
        double avg2 = avg2(numbers);
        System.out.printf("Universal Average: %2.2f\n", avg2);


        /**
         * Задание 3
         */

        int num = 12345;
        System.out.println("Сумма цифр числа " + num + " = " + sumNumbers(num));

        /**
         * Задание 4
         */
        String str = "chetire4chertenka"; // length = 17
        char middleChar = middleChar(str);


        /**
         * Задание 5
         */
        String str2 = "Pdrtwsg";
        int vowelChar = vowelChar(str2);


        /**
         * Задание 6
         */
        calculateResult();


        /**
         * Задание 7
         */
        calculateInterest(1000, 5, 10);


        /**
         * Задание 8
         */
        System.out.println("Enter PASSWORD: ");
        Scanner in = new Scanner(System.in);
        String password = in.next();
        passwordCheck(password);


        /**
         * Задание 9
         */


        playGame();

        /**
         * Задание 10
         */

        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        //int[] array1 = removeElement(array, 3);
        deleteElement(array, 2);

        /**
         * Задание 11
         */
        int playerAScore = 0;
        int playerBScore = 0;


        int gameCount = 0;
        while (gameCount++ < 3) {
            int aHand = createHand();
            int bHand = createHand();

            if (aHand == bHand) {
                System.out.println("Ничья");
                continue;
            }

            //1 - камень, 2 - ножницы, 3 - бумага
            if (isStone(aHand)) {
                if (isScissors(bHand)) {
                    makeRound("A", aHand, "Б", bHand);
                    playerAScore++;

                } else if (isPaper(bHand)) {
                    makeRound("Б", bHand, "A", aHand);
                    playerBScore++;
                }
            }

            if (isScissors(aHand)) {
                if (isStone(bHand)) {
                    makeRound("Б", bHand, "A", aHand);
                    playerBScore++;

                } else if (isPaper(bHand)) {
                    makeRound("A", aHand, "Б", bHand);
                    playerAScore++;
                }
            }

            if (isPaper(aHand)) {
                if (isStone(bHand)) {
                    makeRound("A", aHand, "Б", bHand);
                    playerAScore++;

                } else if (isScissors(bHand)) {
                    makeRound("Б", bHand, "A", aHand);
                    playerBScore++;
                }
            }
        }

        printResults(playerAScore, playerBScore);

    }


    private static int min(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }


    private static int min2(int[] numbers) {
        int minSoFar = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int num = numbers[i];
            if (num < minSoFar) {
                minSoFar = num;
            }
        }

        return minSoFar;
    }

    private static double avg(int first, int second, int third) {
        double sum = first + second + third;
        double avgFun = sum / 3;
        return avgFun;
    }

    private static double avg2(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }


    private static int sumNumbers(int num) {
        int sum = 0;

        int lastDigit;
        do {
            lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        } while (num > 0);

        return sum;
    }


    private static char middleChar(String str) {
        int msgLength = str.length();
        int print = msgLength / 2;
        if (msgLength % 2 == 0 || msgLength == 0) {
            System.out.println("Не удалось найти средний символ!");
            return 0;
        }

        // String str = "chetire4chertenka"; // length = 17
        char charMid = str.charAt(--print);
        System.out.println("Average symbol: " + charMid);
        return charMid;
    }

    //String str2 = "Pdrtwsg";
    private static int vowelChar(String str) {
        str = str.toLowerCase();

        int vowelCount = 0;

        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                vowelCount += 1;
            }
        }

        if (vowelCount > 0) {
            System.out.println("Количество гласных: " + vowelCount);
        } else {
            System.out.println("Гласных не найдено!");
        }
        return vowelCount;
    }


    private static boolean isVowel(char ch) {
        switch (ch) {
            // english
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            //russian
            case 'а':
            case 'е':
            case 'ё':
            case 'и':
            case 'й':
            case 'о':
            case 'у':
            case 'э':
            case 'ю':
            case 'я':
                return true;

            default:
                return false;
        }
    }


    //Задание 6
    static void calculateResult() {
        final int randomNumber = (int) (Math.random() * 10 + 1);
        System.out.println("My random: " + randomNumber);

        boolean isWholeNumber = isWholeRoot(randomNumber);
        boolean isEven = isEven(randomNumber);

        if (isWholeNumber) {  // 3
            if (isEven) { // b
                int sum = 0;
                for (int i = randomNumber; i > randomNumber - 5; i--) {
                    if (i < 0) {
                        break;
                    }

                    sum += i * i;
                }

                System.out.println("SUM: " + sum);

            } else {  //c
                int sum = 0;
                for (int i = randomNumber; i < randomNumber + 5; i++) {
                    sum += i * i;
                }
                System.out.println("SUM: " + sum);
            }
        } else { //4
            if (isEven) { // a
                for (int i = randomNumber; ; ++i) {
                    if (isWholeRoot(i)) {
                        System.out.println("Closest bigger number: " + i);
                        break;
                    }
                }

            } else {  //b
                for (int i = randomNumber; ; --i) {
                    if (isWholeRoot(i)) {
                        System.out.println("Closest smaller number: " + i);
                        break;
                    }
                }
            }
        }
    }


    static boolean isWholeRoot(double number) {
        double root = Math.sqrt(number);
        if (isWholeNumber(root)) {
            System.out.println("Number " + number + " is whole");
            return true;
        }

        System.out.println("Number " + number + " is not whole");
        return false;
    }


    static boolean isWholeNumber(double number) {
        return number % 1 == 0;
    }


    static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
            return true;
        }

        System.out.println("Number " + number + " is odd");
        return false;
    }

    static double calculateInterest(double deposit, int years, double rate) {
        System.out.println("Years\tTotal");
        double interestRate = rate / 100;

        for (int i = 1; i <= years; i++) {
            deposit += deposit * interestRate;
            System.out.println(i + "\t\t" + deposit);
        }
        return deposit;
    }

    static void passwordCheck(String pswd) {
        if ((pswdLength(pswd) & isCharOrNum(pswd) & hasTwoDigitsMin(pswd))) {
            System.out.println("Password is OK!");
        } else {
            System.out.println("Password is invalid!");
        }
    }

    static boolean pswdLength(String pswd) {
        int pswdLength = pswd.length();
        if (pswdLength == 10) {
            System.out.println("\n" + "Password length: " + pswdLength);
            return true;
        } else {
            System.out.println("The Password must be 10 characters long!");
            return false;
        }
    }

    static boolean isCharOrNum(String pswd) {
        char[] result = pswd.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (!isLetter(result[i]) && !isDigit(result[i])) {
                System.out.println("The Password must contain only characters and digits!");
                return false;
            }
        }

        return true;
    }

    static boolean hasTwoDigitsMin(String pswd) {
        char[] result = pswd.toCharArray();
        int counter = 0;

        for (int i = 0; i < result.length; i++) {
            if (isDigit(result[i])) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        }
        System.out.println("The Password must contain at least two numbers!");
        return false;
    }

    static void playGame() {
        int steps = 10;
        int cntScore = 0; //points counter
        for (int i = 0; i < steps; i++) {
            int rndRoom = (int) (Math.random() * 4);
            cntScore += calcPoint(rndRoom);
            System.out.println("Now you are in room *" + roomName(rndRoom) + "." + " You have " + cntScore + " points.");
        }
        if (cntScore > 0) {
            System.out.println("***You win!***");
        } else {
            System.out.println("***You lose!***");
        }
    }

    static int calcPoint(int room) {
        int points = 0;
        switch (room) {
            case 0:
            case 3:
                points = -1;
                break;
            case 1:
            case 2:
                points = 1;
                break;
        }
        return points;
    }

    static char roomName(int room) {
        char name = ' ';
        switch (room) {
            case 0:
                name = 'N';
                break;
            case 1:
                name = 'S';
                break;
            case 2:
                name = 'E';
                break;
            case 3:
                name = 'W';
                break;
        }
        return name;
    }

    //Задание 11
    private static int createHand() {
        return (int) (Math.random() * 3 + 1);
    }

    private static boolean isPaper(int bHand) {
        return bHand == 3;
    }

    private static boolean isScissors(int bHand) {
        return bHand == 2;
    }

    private static boolean isStone(int aHand) {
        return aHand == 1;
    }
    //1 - камень, 2 - ножницы, 3 - бумага

    private static void makeRound(String winner, int winnerHand, String looser, int looserHand) {
        System.out.printf("Игрок %s (%s) выиграл игрока %s (%s)\n", winner, nameHand(winnerHand), looser, nameHand(looserHand));
    }

    //1 - камень, 2 - ножницы, 3 - бумага
    private static String nameHand(int hand) {
        switch (hand) {
            case 1:
                return "камень";
            case 2:
                return "ножницы";
            case 3:
                return "бумага";
            default:
                return null;
        }
    }


    private static void printResults(final int player1Score, final int player2Score) {
        String result = getResult(player1Score, player2Score);
        printWinner(result, player1Score, player2Score);
    }

    private static String getResult(int player1Score, int player2Score) {
        if (player1Score > player2Score) {
            return "Победил игрок А";
        } else if (player1Score < player2Score) {
            return "Победил игрок Б";
        } else {
            return "Ничья!";
        }
    }

    private static void printWinner(String result, int player1Score, int player2Score) {
        System.out.println(printScore(player1Score, player2Score) + "\t" + result);
    }

    private static String printScore(int player1Score, int player2Score) {
        return "Счет " + player1Score + " - " + player2Score + ".";
    }

    //Задание 10
    //int array[] = {0,1,2,2,3,0,4,2};
    //int array1[] = removeElement(array, 3);


    static void deleteElement(int[] array, int number) {
        System.out.println("Incoming array " + Arrays.toString(array));

        int indexOfNumber;
        while ((indexOfNumber = findndex(number, array)) != -1) {
            System.out.println("Index of number " + number + " is " + indexOfNumber);

            shiftArray(array, indexOfNumber);
            array = cutArrayData(array);
        }

        System.out.println("Final version of array: " + Arrays.toString(array));

    }

    private static void shiftArray(int[] array, int indexToRemove) {
//        for (int i = indexToRemove; i < array.length - 1; i++) {
//            array[i] = array[i + 1];
//        }

        System.arraycopy(array, indexToRemove + 1, array, indexToRemove, array.length - indexToRemove - 1);
        System.out.println("Shifted array " + Arrays.toString(array));
    }

    private static int[] cutArrayData(int[] array) {
        array = Arrays.copyOf(array, array.length - 1);
        System.out.println("Shorted version of  array: " + Arrays.toString(array));
        return array;
    }


    //return index of number or -1 if missing

    private static int findndex(int number, int[] array) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        System.out.println("Index " + index);
        return index;
    }
}



