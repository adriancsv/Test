package com.company;

import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Arrays;

public class Main {

    public static void CheckOddEven() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }

    public static void SumAverageInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        double avg;
        avg = sum / num;
        System.out.println("Sum is: " + (int) sum);
        System.out.println("Avg is: " + avg);

    }

    public static void PerfectSquare() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();

        double sq = Math.sqrt(num);
        if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
            System.out.println("Perfect square");
        } else
            System.out.println(" Not perfect square");

    }


    public static void SumProductMinMax() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number");
        int num3 = scan.nextInt();

        System.out.println("Sum of the three numbers is: " + (int) (num1 + num2 + num3));
        System.out.println("Product of the three numbers is: " + num1 * num2 * num3);
        System.out.println("Minimum of the three numbers is: " + Math.min(Math.min(num1, num2), num3));
        System.out.println("Maximum of the three numbers is: " + Math.max(Math.max(num1, num2), num3));
    }


    public static void ReversePositiveNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("Error! Number must be positive");
            System.out.println("Enter a positive number");
            num = scan.nextInt();
        }

        System.out.println("Reverse of the number is: " + new StringBuffer(Integer.toString(num)).reverse().toString());
    }

    public static void CountVowelsDigits() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int vowelsNo = 0;
        int digitsNo = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    vowelsNo++;
                }
            }
            for (int j = 0; j < digits.length; j++) {
                if (str.charAt(i) == digits[j]) {
                    digitsNo++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsNo);
        System.out.println("Number of digits : " + digitsNo);
    }


    public static String[] InsertElementArray(String element, int position, String[] array) {
        int pos = position - 1;
        String[] nary = new String[array.length + 1];

        for (int i = 0; i < pos; i++) {
            nary[i] = array[i];
        }
        nary[pos] = element;
        for (int i = pos; i < array.length; i++) {
            nary[i + 1] = array[i];
        }

        return nary;
    }


    public static int[] RemoveElementArray(int element, int[] array) {
        int occurences = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) occurences++;
        }

        int[] nary = new int[array.length - occurences];
        int i = 0;
        int j = 0;

        while (i < array.length) {
            if (array[i] != element) {
                nary[j] = array[i];
                i++;
                j++;
            }
            i++;
        }

        return nary;


    }

    public static double ArrayAvgMaxMinExcluded(double[] arr) {
        double minv=Integer.MAX_VALUE;
        double maxv=Integer.MIN_VALUE;
        double sum = 0;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minv) {
                minv = arr[i];
            }
            if (arr[i] > maxv) {
                maxv = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > minv) && (arr[i] < maxv)) {
                sum = sum + arr[i];
                count++;
            }

        }
        return sum / count;
    }


    public static void main(String[] args) {
        //write your code here


        //-------ex1--------
        //CheckOddEven();


        //--------ex2----------
        //SumAverageInt();


        //---------ex3---------
        //PerfectSquare();


        //----------ex4--------
        //SumProductMinMax();


        //----------ex5---------
        //ReversePositiveNumber();


        //-----------ex6--------
        //CountVowelsDigits();


        //----------ex7----------
        /*String[] SIR = {"ion", "maria", "vasile", "5", "6"};
        int POSITION = 3;
        String ELEM = "x";
        String[] SIR1 = InsertElementArray(ELEM, POSITION, SIR);
        System.out.println(Arrays.toString(SIR1));*/


        //-----------ex8-------------
        /*int[] NUMBERS={2,5,3,7,9,1,3,7,9};
        int VAL=3;
        int [] NMBR=RemoveElementArray(VAL,NUMBERS);
        System.out.println(Arrays.toString(NMBR));*/


        //------------ex10-----------------
        /*double[] arr = {10,4,5,7,2,1};
        System.out.println("Avg of array except min and max is: " + ArrayAvgMaxMinExcluded(arr));*/


    }
}
