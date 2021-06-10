package com.company;

import java.util.Scanner;
import java.lang.StringBuffer;

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
                if (str.charAt(i) == digits[j]){
                    digitsNo++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsNo);
        System.out.println("Number of digits : "+ digitsNo);
    }

    public static void main(String[] args) {
        //write your code here
        //CheckOddEven();
        //SumAverageInt();
        //PerfectSquare();
        //SumProductMinMax();
        //ReversePositiveNumber();
        //CountVowelsDigits();

    }
}
