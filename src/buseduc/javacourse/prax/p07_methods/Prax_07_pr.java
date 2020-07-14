package buseduc.javacourse.prax.p07_methods;

import java.util.ArrayList;

import java.util.Arrays;

public class Prax_07_pr {
    public static void main(String[] args) {

        /**
        * Практикум. Методы
        */

        /**
         * Задание 1
         */

        System.out.println( " Task 1 " );
         int a= 100;
         int a1 =1 ;
         int a2=-2;

        psvmT1(a, a1, a2);

        System.out.print("\n");




        /**
         * Задание 2
         */
        System.out.println( " Task 2 " );

        int first = 22;
        int second = 45;
        int third =655;
        psvmT2(first, second, third);
        /**
         * Задание 3
         */
        System.out.println( " Task 3 " );
        int t3= 678;
        psvmT3(t3);
        /**
         * Задание 4
         */
        System.out.println( " Task 4 " );

        System.out.print("\n");


        String str = "abc5efgw";
        System.out.print(str + "\n");
        psvmT4(str);
        str = "abc5efg";
        System.out.print(str + "\n");
        psvmT4(str);


        /**
         * Задание 5
         */
        System.out.println( " Task 5  \n" );

        String str5 = "Polistrategiya";
        System.out.println( str5);
        psvmT5(str5);
        str5 = "Plstrtg";
        System.out.println( str5);
        psvmT5(str5);
        /**
         * Задание 6
         */
        System.out.print(" Task6" + "\n");
        System.out.print( "\n");
        int randomInt=144;
        System.out.println("input task6      "+(randomInt));
        System.out.println("rez task6   "+calculateResult(randomInt));
        System.out.println("test task6   "+ (143*143+142*142+141*141+140*140+139*139));
        System.out.print( "\n");
        randomInt=169;
        System.out.println("input task6      "+(randomInt));
        System.out.println("rez task6   "+calculateResult(randomInt));
        System.out.println("test task6   "+ (170*170+171*171+172*172+173*173+174*174));
        System.out.print( "\n");
        randomInt=145;
        System.out.println("input task6      "+(randomInt));
        System.out.println("rez task6   "+calculateResult(randomInt));
        System.out.print( "\n");
        randomInt=146;
        System.out.println("input task6      "+(randomInt));
        System.out.println("rez task6   "+calculateResult(randomInt));
        System.out.print( "\n");
        randomInt = (int) (Math.random() * 1000);
        System.out.println("input task6      "+(randomInt));
        System.out.println("rez task6   "+calculateResult(randomInt));


        System.out.print("\n");

        /**
         * Задание 7
         */
        System.out.print(" Task7" + "\n");

        double sum7=1000;
        double rate7=10;
        int n7=5;

        System.out.print("years          total" + "\n");

        for ( int  i7 = 1; i7 < n7+1 ; i7++)
        {
            psvmT7(sum7, rate7, i7);
        }

        /**
         * Задание 8
         */
        System.out.println("  task 8");
        String parol="ghjuyta@@@aa7";
        System.out.println(parol);
        checkparilya(parol);

        parol="ghjuyta777";
        System.out.println(parol);
        checkparilya(parol);

        /**
         * Задание 9
         */
        System.out.println("  task 9");


        int count=0;
        int komn=1;
        for(int istep = 1; istep < 11; istep++) {
            System.out.println("After "+istep+" step");
            komn++;
            System.out.print("Room");
            count=count+rez();
            System.out.println("Your score  "+count);


        }

        String rezOfGame;


        if(count>0)
        {rezOfGame= "You win ";}
        else
        {rezOfGame= "You lose ";}

        System.out.println("Your score at the end of game is "+count + " "+ rezOfGame);

        /**
         * Задание 10
         */
        System.out.println("  task 10");

        System.out.println("  Input array");
        int array[] = {0,1,2,2,3,0,4,2,3,3};
        //int array[] = {3,3,3,3,3,3,3,3,3,3};
        System.out.println(Arrays.toString(array));

        int array1[] = removeElement(3, array);
        System.out.println("  Output array");
        System.out.println(Arrays.toString(array1));

        /**
         * Задание 11
         */

        System.out.println("  task 11");

        int noftours=10;
        int num1=0;
        int num2=0;
        int p1full=0;
        int p2full=0;
        int su=0;

        System.out.println("  START ");

        for (int i12 = 1; i12 < noftours+1; i12++) {
            System.out.println("\n"+"Tour "+i12);

            //nachalo tura
            num1 = (int) (Math.random() * 3 + 1);
            num2 = (int) (Math.random() * 3 + 1);
            su = num1 * num1 - num2 * num2;
            int[] numbs1 = rezTura(su);

            p1full=p1full+numbs1[0];
            p2full=p2full+numbs1[1];



        }


        System.out.println("Overall score: 1 player: "+p1full+"           2 player: "+ p2full);
        if (p1full > p2full) {System.out.println("1 is winner!");}
        else if (p1full < p2full) {System.out.println("2 is winner!");}
        else  {System.out.println(" Overall Standoff");}
    }

    
////////////////////task1
public static void psvmT1(int input, int input1, int input2)
{

    int temp=funcmin(input,input1,input2);

    System.out.println("task1");
    System.out.print("\n");

    System.out.println("minimum="+temp); }

    public static int funcmin(int aa, int bb, int cc)
    {
    int minv=1;

    if (aa>bb) {minv=bb;}
    else {minv=aa;}

    if (minv>cc) {minv=cc;}

    return minv;
}
////////////////////task2
    public static void psvmT2(int input, int input1, int input2)
    {

        double temp=avt2(input,input1,input2);

        System.out.print("\n");

        System.out.println("average="+temp);

    }

    public static double avt2 (int aa, int bb, int cc)
    {
        double aver=(aa+bb+cc)/3.0;
        return aver;
    }

///////////////////////////task3
//////////////////////////////////////////////////////////////////////7
public static void psvmT3(int inputt3)
{
    int rrr=inputt3;
    String str1=Integer.toString(rrr);

    //System.out.println(str1);  //  int to string
    int dlin=str1.length();
    //System.out.println(dlin);

    int sum=0;
    for ( int i11a = 1; i11a < dlin+1 ; i11a++)
    {

        //  System.out.println(i11a);
        int tmp=rrr%10;
        rrr=(rrr-tmp)/10;
        sum=sum+tmp;
    }
    System.out.print("\n");

    System.out.println("Input number ="+  inputt3 + " , Sum of digits = "+ sum);

}
    ////////////////////////////////////////////////////task4

    public static void psvmT4(String inputt4)
    {
        int len4=inputt4.length();

        if(len4 == 0 || len4%2 == 0) {System.out.print("Middle character was not found.");}

        else {int ll=len4/2;

            char c = inputt4.charAt(ll);

            System.out.println(c);

        }
        System.out.print("\n");
    }
    //////////////////////////////////////////////task5
    //////////////////////////////////////////////task5
     public static void psvmT5(String inputt5)
    {
      int len5=inputt5.length();
      int amount=0;

    for (int i5 = 0; i5 < len5 ; i5++)
                                         {


     char c = inputt5.charAt(i5);

     switch (c){
      case 'a':{amount++;     break;}
      case 'A':{amount++;     break;}
      case 'e':{amount++;     break;}
      case 'E':{amount++;     break;}
      case 'Y':{amount++;     break;}
      case 'y':{amount++;     break;}
      case 'U':{amount++;     break;}
      case 'u':{amount++;     break;}
      case 'i':{amount++;     break;}
      case 'I':{amount++;     break;}
      case 'o':{amount++;     break;}
               }

                                         }

        System.out.print("\n");
        if (amount==0){System.out.println("There is no vowels in this word. ");}
        if (amount!=0){System.out.println("The number of vowels is "+amount);}
        if (amount!=0){System.out.println("\n");}
    }
    /////task6
//////////////////////////////////////////////////////////////////////////

    static int calculateResult(int inputNumber) {
        boolean hasRoot = hasIntegerRoot(inputNumber);
        boolean isEven = isEven(inputNumber);
        //System.out.print(isEven);
        int result;
        if(hasRoot) {
            if(isEven) {
                result = sumOfPreviousSqrt(inputNumber);
            } else {
              //  System.out.print(isEven +","+inputNumber);
                result = NextSqrt(inputNumber);
            }
        } else {
            if(isEven) {

                result = biggerNumWithRoots(inputNumber);
            } else {

                result = smallerNumWithRoots(inputNumber);

            }
        }
        return result;
    }
    ////////////////////////
    static boolean hasIntegerRoot(int inputNumber) {
        boolean rr;
        double svalue6 = Math.sqrt(inputNumber);

        int ivalue6=(int)  svalue6;
        double dr6=svalue6-ivalue6;

        if (dr6 == 0) { rr=true;}
        else { rr=false;}
        return rr;
    }

    static int sumOfPreviousSqrt(int inputNumber) {
        int sum=0;

        for ( int  i7 = inputNumber-1 ; i7 > inputNumber-6 ; i7--)
        {

            sum=sum+i7*i7;
        }

        return sum;
    }

    static int NextSqrt(int inputNumber) {
        int sum=0;

        for ( int  i7 = inputNumber+1 ; i7 < inputNumber+6 ; i7=i7+1)
        {

            sum=sum+i7*i7;
        }

        return sum;

    }

    //////////////////////////////////////////////////////////////////////////////////////
    static int biggerNumWithRoots(int inputNumber) {
        int i7=inputNumber;

        int aa=0;
        while(true)      {  i7=i7+1;
            boolean hasRoot = hasIntegerRoot(i7);
            if(hasRoot)                            {

                aa=i7;
                break;
            }
        }
        return aa;
    }
    //////////////////////////////////////////////////////////////////
    static int smallerNumWithRoots(int inputNumber) {
        int i7=inputNumber;
        int aa=0;
        while(true)      {  i7=i7-1;

            boolean hasRoot = hasIntegerRoot(i7);
            if(hasRoot)                            {

                aa=i7;
                break;
            }
        }

        return aa;
    }
    //////////////////////////////////////////////////////////////////////////////////
    static boolean isEven(int inputNumber) {
        return inputNumber % 2 == 0;
    }
    ///////////////////////////////////////////////////////////////////////////task7
    public static void psvmT7(double input7, double input7a, int input7b )
    {
        double tmp7=(1+input7a/100.0);
        double rez7=input7*Math.pow(tmp7, input7b);
        System.out.print(input7b + "              " + (float) rez7);
        System.out.print("\n");
    }


    //////////////////////////////////////////////////////////////////////////task11



    public static int[] rezTura(int su1)
    {
        ///////////////////////////////////rez tura

        int p1=0;
        int p2=0;

        if (su1 == 0) {
            System.out.println("  STANDOFF  ");
        }

        if (su1 == 3) {
            System.out.println("  1 scissors, 2 stone => 2 winner");
            p2++;
        }

        if (su1 == -3) {
            System.out.println("  1 stone, 2 scissors => 1 winner ");
            p1++;
        }

        if (su1 == -8) {
            System.out.println(" 1 stone, 2 paper => 2 winners ");
            p2++;
        }

        if (su1 == 8) {
            System.out.println("  1 paper, 2 stone, => 1 winner");
            p1++;
        }

        if (su1 == -5) {
            System.out.println(" 1 scissors, 2 paper => 1 winner");
            p1++;
        }

        if (su1 == 5) {
            System.out.println(" 1 paper, 2 scissors => 2 winner ");
            p2++;
        }

        System.out.println("Result after tour   " + p1 + "," + p2);
        // konec  tura
        return new int[] {p1, p2};
    }
    //////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////
    public static int[] removeElement(int rem, int[] array)
    {
        int arrLeng=array.length;

        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i12 = 0; i12 < arrLeng; i12++) {
            number.add(array[i12]);
        }

        for (int i = number.size() - 1; i > -1; i--) {
            int tmp=number.get(i);
            if (tmp==rem) {
                number.remove(i);
            }
        }


        int dim=number.size();
        int[] arrr;
        arrr = new int[dim];
        for(int i = 0; i < dim; i++) arrr[i] = number.get(i);

        return arrr;
    }

    /////////////////////////////////////////

    public static int rez (){
        int  rezult = (int) (Math.random() *3);

        switch (rezult) {
            case  (0):
                rezult=-1;
                System.out.println(" N");
                break;
            case (1):
                rezult=1;
                System.out.println(" S");
                break;
            case (2):
                rezult=1   ;
                System.out.println(" E");
                break;
            case (3):
                rezult=-1   ;
                System.out.println(" W");
                break;
            default:
                System.out.println(" ?");

                break;
        }


        return rezult;}
    /////////////////////////////////////////////////////////////////////////////


    /////////task8///////////metodproveryajuwijparol
    public static void checkparilya(String parol1) {
        /////
        Boolean dlina10simvolov;
        int len8= dlinaParolya(parol1);

        if (len8==10) { dlina10simvolov=true;}
        else  { dlina10simvolov=false;
            {System.out.println("Length of password is not equal to 10");} }

        Boolean alphaOrInteger =alpOrInt(parol1);
        if(alphaOrInteger==false)
            System.out.println("Password must contain only digits or letters");

        //////////////////////////////////////
        int numberofintegers=numberOfInt(parol1);
        if(numberofintegers<2)
            System.out.println("Password must contain at least two digits");

        if(alphaOrInteger & dlina10simvolov & (numberofintegers>1) )
        {System.out.println(" Password is OK");}
       // else
      //  {System.out.println("Password is not OK");}

    }
    ////////////////////////
    ///////////////   dlina parolya
    public static int dlinaParolya(String prl)
    {
        int len8=prl.length();
        return len8;
    }

    /////////////////////
    public static Boolean alpOrInt(String prl)
    {
        Boolean  alphaOrInteger=true;

        int len8= dlinaParolya(prl);
        for(int i = 0; i < len8; i++) {//
            char c = prl.charAt(i);


            if( Character.isDigit(c) || Character.isAlphabetic(c))
                alphaOrInteger=true;
            else
            {
                alphaOrInteger=false;
                break;
            }
        }//
        return  alphaOrInteger;
    }
    ////////////////////////////////////////////////////////////////////////////
    public static int numberOfInt(String prl)
    {
        Boolean  alphaOrInteger=true;

        int len8= dlinaParolya(prl);
        int numberofintegers=0;
        for(int i = 0; i < len8; i++) {//
            char c = prl.charAt(i);

            if( Character.isDigit(c) ) {

                numberofintegers++;

            }
        }//
        return  numberofintegers;
    }
    /////endfortask8//////////////////////////

    ////////////////////////////////////////////////////////////////////////////
}
