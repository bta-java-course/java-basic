package buseduc.javacourse.prax.p09_complex;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Prax_09_pr {
    public static void main(String[] args) {

        /**
         * Практикум. Итог
         */

        /**
         * Задание 1
         */
        System.out.println("Task1    " + "\n");
        int a = 1;
        int b = 10;
        System.out.println("Before    " + a + "   " + b);
        int[] numbs = changePlace(a, b);
        a = numbs[0];
        b = numbs[1];
        System.out.println("After    " + a + "    " + b);
        System.out.print("\n");
        /**
         * Задание 2
         */
        System.out.println("Task2    " + "\n");
        Scanner scanner2 = new Scanner(System.in);

        int next = scanner2.nextInt();
        //int len2=userInput2.length();
        System.out.println("You have entered: " + next);

        psvmT3(next);
        System.out.print("\n");

        /**
         * Задание 3
         */
        System.out.print("Task3    " + "\n");
        Scanner scanner3 = new Scanner(System.in);
        int next3 = 0;
        try {
            System.out.println("Input number");

            next3 = scanner3.nextInt();

            System.out.println(next3);

        } catch (Exception e) {
            System.out.println(" not integer");
        }

        int[] y = new int[next3];

        for (int i3 = 0; i3 < next3 - 1; i3++) {


        y[i3] = (int) (Math.random() * 2000) - 1000;

    }
        System.out.println(Arrays.toString(y));

        float average=0;
        for ( int i3 = 0; i3 < next3 - 1; i3++)
        {average=average+y[i3];}
        average=average/next3;
        System.out.println("Avarage="+average);
        System.out.print("[");
        for ( int i3 = 0; i3 < next3 - 1; i3++) // @VS: Здесь он не доберется до последнего элемента массива
        {if(y[i3]< average){System.out.print(y[i3]+" ");}}
        System.out.print("]");







        /**
         * Задание 4
         */
        System.out.print(  "\n"   +"Task4    " + "\n");
        Scanner sc4= new Scanner(System.in);
        String next4 = sc4.nextLine().toLowerCase();
        float radiusKruga = 123;
        float a4=123;
        float b4=321;
        // @VS: не разбито на методы (

        switch (next4){
            case "circle":     {
                try {
                    System.out.println("Input radius");
                     radiusKruga = sc4.nextFloat();
                    System.out.println(" Radius=   " + radiusKruga);
                    if(radiusKruga<0) {System.out.print(" R must by positive  " );  break;}
                    System.out.println(" S=   " + Math.PI * Math.pow(radiusKruga, 2));

                } catch (Exception e) {
                    System.out.println(" It is not number");
                }

            break;               }
            case "triangle":{

                try {
                    System.out.println("Input the lengths of the right triangle legs");
                    a4 = sc4.nextFloat();
                    b4 = sc4.nextFloat();
                    System.out.print(" a  " + a4);    System.out.println(" b  " + b4);
                    if(a4<0 ||  b4<0) {System.out.print(" Legs must by positive  " );  break;}
                    System.out.println(" S=   " + a4*b4*0.5 );

                } catch (Exception e) {
                    System.out.println(" It is not number");
                }


                break;


            }
            case "rectangle":{

                try {
                    System.out.println("Input the lengths of the legs");
                    a4 = sc4.nextFloat();
                    b4 = sc4.nextFloat();
                    System.out.print(" a  " + a4);    System.out.println(" b  " + b4);
                    if(a4<0 ||  b4<0) {System.out.print(" Legs must by positive  " );  break;}
                    System.out.println(" S=   " + a4*b4 );

                } catch (Exception e) {
                    System.out.println(" It is not number");
                }


                break;


            }
            default: System.out.print("Task5    " + "\n");
                               }




        /**
         * Задание 5
         */
           Scanner sc = new Scanner(System.in);
        System.out.println("INPUT NUMBER");
        int n = sc.nextInt();

         //n = 5;
        int nSqrt = n * n;
        if (n % 2 == 0) {
            System.out.println("Must be an odd number!");
            return;
        }
        int arr[] = new int[nSqrt];
        for(int i = 0; i < nSqrt; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int endIndex = nSqrt - 1;
        for(int i = 0; i < n; i++) {
            for(int y8 = 0; y8 < n; y8++) {
                int nextIndex = (int) (Math.random() * endIndex);
                System.out.print(arr[nextIndex] + "\t");
                arr[nextIndex] = arr[endIndex--];
            }
            System.out.println("");
        }



        //}

        /**
         * Задание 6
         */
        System.out.println(" Task6");
        /////////////////////////////
        int n06 = 5;
        int nSqrt06 = n06 * n06;
        int arr06[] = new int[nSqrt06];
        for(int i = 0; i < nSqrt06; i++) {
            arr06[i] = i;
        }
        int matrix[][] = new int[n06][n06];

//	        System.out.println(Arrays.toString(arr06));
        int endIndex06 = nSqrt06 - 1;
        int[] row;
        for(int i = 0; i < n06; i++) {
            row = new int[n06];
            for(int yy = 0; yy < n06; yy++) {
                int nextIndex06 = (int) (Math.random() * endIndex06);
                System.out.print(arr06[nextIndex06] + "\t");
                row[yy] = arr06[nextIndex06];
                arr06[nextIndex06] = arr06[endIndex06--];
            }
            matrix[i] = row;
//	            System.out.println("");


        }

        System.out.println("");


        for(int i=0; i<5; i++ ) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("");




        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please сhoose vertical (v) or horizontal (h)?);");
        String userChoice = sc1.nextLine();

        if (userChoice.equals("v")  || userChoice.equals("h") ) {
            System.out.println(userChoice);
        } else {
            System.out.println("not h or v");  return;
        }



        boolean isVerticalBigger = sumVertical(matrix) > sumHorizontal(matrix);
        boolean isHorizontalBigger = sumVertical(matrix) < sumHorizontal(matrix);
        if (userChoice.equals("v") && isVerticalBigger ||
                userChoice.equals("h") && !isHorizontalBigger) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose");
        }




        /////////////////////////////





        /**
         * Задание 7
         */
        System.out.println(" Task7");


        /////////////////
        int num1;
        int num2e;
        int num3d;
        int num4s;
        int num5t;



        while(true){

            num1 = (int) (Math.random() * 8853 + 1023);
            num2e=num1%10;
            num3d=((num1-num2e)/10)%10;
            num4s=((num1-num2e-num3d*10)/100)%10;
            num5t= (num1-num4s*100-num3d*10-num2e)/1000;

            if ((num2e != num3d)&(num2e != num4s)&(num2e != num5t)&(num3d != num4s)&(num3d != num5t)&(num4s != num5t)) {break;}

        } //endofwhile

        System.out.println("Number is generated: "+num1);
        int[] arnum1 = new int[4];
        arnum1[0]=num2e;
        arnum1[1]=num3d;
        arnum1[2]=num4s;
        arnum1[3]=num5t;
        int sl;
        int z;
        int attempt=0;

        Scanner scannersz = new Scanner(System.in);

        while(true){
            attempt++;
            System.out.println("Input 4-digt number. Digits in this number should not  match");
            int nextnumber=scannersz.nextInt();
            System.out.println("Your number:"+nextnumber);

        //    System.out.println(nextnumber);
            int ne=nextnumber%10;
        //    System.out.println(ne);
            int nd=((nextnumber-ne)/10)%10;
        //    System.out.println(nd);
            int ns=((nextnumber-ne-nd*10)/100)%10;
        //    System.out.println(ns);
            int nt= (nextnumber-ns*100-nd*10-ne)/1000;
        //    System.out.println(nt);

            int[] arnum2 = new int[4];
            arnum2[0]=ne;
            arnum2[1]=nd;
            arnum2[2]=ns;
            arnum2[3]=nt;
            sl=0;
            z=0;

            for (int i = 0; i <4; i=i+1)         {
             //   System.out.println(i);
                for (int ii = 0; ii <4; ii++) {

                    if((arnum1[i]==arnum2[ii])&(i==ii)) {sl=sl+1;  }
                    if((arnum1[i]==arnum2[ii])&(i!=ii)) {z=z+1;  }

                                 } //endii
            } //endi

            System.out.println("Elephants:"+sl+"           Rabbits:"+z);
            if (sl==4) {    System.out.println( "You have guest a number! Number of attempts is "+attempt);  break;}
        }  ////////////////endofwhile

        //////////
        /**
         * Задание 8
         */


    }
    //////////////////////////////////////////////task1
public static int[] changePlace (int aa, int bb)
{

    int tmp=bb;
    bb=aa;
    aa=tmp;
    return new int[] {aa, bb};
}

    /////////////////////////////
    //////////////////////////////////////////////////////////////////////7
    public static void psvmT3(int inputt3)
    {
        int rrr=inputt3;
        String str1=Integer.toString(rrr);

        //System.out.println(str1);  //  int to string
        int dlin=str1.length();
        //System.out.println(dlin);

        int sum=0;
        int product=1;
        for ( int i11a = 1; i11a < dlin+1 ; i11a++)
        {

            //  System.out.println(i11a);
            int tmp=rrr%10;
            rrr=(rrr-tmp)/10;
            sum=sum+tmp;
            product=product*tmp;
        }
        System.out.print("\n");

        System.out.println("Input number ="+  inputt3 + " , Sum of digits = "+ sum);
        System.out.println("Input number ="+  inputt3 + " , Product of digits = "+ product);

    }
        //////////////////////////////////fortask

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
        for(int i=0; i < length;i++) {
            result =result+  matrix[mid][i];
        }
        return result;
    }


        /////////////////////////////////////fortask6
}

     /////////////////////////////

