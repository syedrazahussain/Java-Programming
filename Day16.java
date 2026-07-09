//====================Day 16 (Master Your Logic Building)========================
// ************Level 3 : Math and Number Logic*******************************

import java.util.Scanner;

class Day16 {
    static Scanner sc = new Scanner(System.in);

    static void checkDistinct() {
        System.out.println("Enter Any number :");
        int number = sc.nextInt();
        int temp = number;
        int digits = 0;

        int lastValue = 0, midValue = 0, firstValue = 0;

        while (temp > 0) {

            number = temp % 10;

            temp = temp / 10;

            digits++;

            if (digits == 1) {
                lastValue = number;

            }
            if (digits == 2) {
                midValue = number;

            }
            if (digits == 3) {
                firstValue = number;

            }

        }
        if (digits == 3) {

            if (lastValue != midValue && lastValue != firstValue && midValue != firstValue) {
                System.out.println("Its is distinct");
            } else {
                System.out.println("Not distinct");
            }
        } else {
            System.out.println("PLease enter 3 digits only");
        }

    }

    static void checkmiddleDigit() {
        System.out.println("Enter Any number :");
        int number = sc.nextInt();
        int temp = number;
        int digits = 0;

        int lastValue = 0, midValue = 0, firstValue = 0;

        while (temp > 0) {

            number = temp % 10;

            temp = temp / 10;

            digits++;

            if (digits == 1) {
                lastValue = number;

            }
            if (digits == 2) {
                midValue = number;

            }
            if (digits == 3) {
                firstValue = number;

            }

        }
        if (digits == 3) {

            if (midValue > lastValue && midValue > firstValue) {
                System.out.println("Largest");
            } else if (midValue < lastValue && midValue < firstValue) {
                System.out.println("Smallest");
            } else {
                System.out.println("Neither");
            }
        } else {
            System.out.println("PLease enter 3 digits only");
        }

    }

    static void checkfirstandlastequality() {
        System.out.println("Enter Any number :");
        int number = sc.nextInt();
        int temp = number;
        int digits = 0;

        int finalValue = 0, lastValue = 0, midValue = 0, firstValue = 0;

        while (temp > 0) {

            number = temp % 10;

            temp = temp / 10;

            digits++;

            if (digits == 1) {
                lastValue = number;

            }
            if (digits == 2) {
                midValue = number;

            }
            if (digits == 3) {
                firstValue = number;

            }
            if (digits == 4) {
                finalValue = number;
            }

        }

        if (digits == 4) {

            if (lastValue == finalValue) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        } else {
            System.out.println("PLease enter 4 digits only");
        }

    }

    static void checksinglemultidigit() {
        System.out.println("Enter Any number :");
        int number = sc.nextInt();
        int temp = number;
        int digits = 0;
         while (temp > 0) {

            number = temp % 10;

            temp = temp / 10;

            digits++;

         }
         if(digits == 1){
            System.out.println("Single Digit hai");
         }
         if(digits == 2){
            System.out.println("double Digit hai");
         }
         if(digits >= 3){
            System.out.println("multi Digit hai");
         }

    }

    public static void main(String[] args) {
        // Q1. Take a 3-digit number and check if all digits are distinct
        // checkDistinct();

        // Q2. Take a 3 -digit number and determine if th emiddle digit is the
        // largest,smallest or neither
        // checkmiddleDigit();

        // Q3 . take a 4 - digit number and check if the first and last digits arev
        // equal
        // checkfirstandlastequality();

        // Q4. Check whether a given integer is single digit,double digir or multi digit
        // checksinglemultidigit();

        //Q5. check if a 

    }
}