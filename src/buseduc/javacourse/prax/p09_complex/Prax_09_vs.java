package buseduc.javacourse.prax.p09_complex;

import java.util.Arrays;
import java.util.Scanner;

public class Prax_09_vs {
    public static void main(String[] args) {

        /**
        * Практикум. Итог
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
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int arrLen = sc.nextInt();
        int[] array = new int[arrLen];
        long sum = 0;
        for(int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            sum += array[i];
        }
        double avg = (double) sum / arrLen;
        System.out.println(Arrays.toString(array));
        System.out.println("AVG: " + avg);
        for (int nx: array) {
            if(nx < avg) {
                System.out.print(nx);
                System.out.print(", ");
            }

        }
<<<<<<< HEAD



=======
*/

        /**
         * Задание 4
         */

        /**
         * Задание 5
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT NUMBER");
        int n = sc.nextInt();
*/
/*
        int n = 5;
        int nSqrt = n * n;
        if (n % 2 == 0) {
            System.out.println("Must be odd number!");
            return;
        }
        int arr[] = new int[nSqrt];
        for(int i = 0; i < nSqrt; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int endIndex = nSqrt - 1;
        for(int i = 0; i < n; i++) {
            for(int y = 0; y < n; y++) {
                int nextIndex = (int) (Math.random() * endIndex);
                System.out.print(arr[nextIndex] + "\t");
                arr[nextIndex] = arr[endIndex--];
            }
            System.out.println("");
        }
*/

        /**
         * Задание 6
         */

        int n06 = 5;
        int nSqrt06 = n06 * n06;
        int arr06[] = new int[nSqrt06];
        for(int i = 0; i < nSqrt06; i++) {
            arr06[i] = i;
        }
        int matrix[][] = new int[n06][n06];

//        System.out.println(Arrays.toString(arr06));
        int endIndex06 = nSqrt06 - 1;
        int[] row;
        for(int i = 0; i < n06; i++) {
            row = new int[n06];
            for(int y = 0; y < n06; y++) {
                int nextIndex06 = (int) (Math.random() * endIndex06);
                System.out.print(arr06[nextIndex06] + "\t");
                row[y] = arr06[nextIndex06];
                arr06[nextIndex06] = arr06[endIndex06--];
            }
            matrix[i] = row;
//            System.out.println("");
        }
        for(int[] subrow : matrix) {
            System.out.println(Arrays.toString(subrow));
        }
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        boolean isVerticalBigger = sumVertical(matrix) > sumHorizontal(matrix);
        if (userChoice.equals("v") && isVerticalBigger ||
                userChoice.equals("h") && !isVerticalBigger) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose");
        }


        /**
         * Задание 7
         */

        /**
         * Задание 8
         */

    }

    private static int sumVertical (int[][] matrix){
        int length = matrix.length;
        int mid = length / 2;
        int result = 0;
        for(int i = 0; i < length; i++ ) {
            result += matrix[i][mid];
        }
        return result;

    }
    private static int sumHorizontal (int[][] matrix){
        int length = matrix.length;
        int mid = length / 2;
        int result = 0;
        for(int next : matrix[mid]) {
            result += next;
        }
        return result;
    }
}
