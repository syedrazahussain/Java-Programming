//============================Day 14 Master Your Logic Building ==================

import java.util.Scanner;

class Day14 {
    // ********************Phase 1 -conditional thinking (If else boolean logic) */
    // Level 1 : simple condition
    // Q1. take a number and print whether it's positive ,negative,and zero
    static Scanner sc = new Scanner(System.in);
    static void checkPosNegNumber() {
        System.out.println("Enter Any number : ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("The Number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative ");
        } else if (n == 0) {
            System.out.println("The number is zero");

        }
    }

    static void checkEvenOrOdd() {
        
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    static void checkdivisible5() {
        
        System.out.println("Enter ANy number ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else {
            System.out.println("Not divisble");
        }
    }

    static void checkdivisible5and3() {
        
        System.out.println("Enter ANy number ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("The number is divisible of 5");
        } else {
            System.out.println("Not divisible of 5");
        }
        if (n % 3 == 0) {
            System.out.println("The number is divisible of 3");
        } else {
            System.out.println("Not divisible of 3");
        }

    }

    static void checkLeapYear() {
        
        System.out.println("Enter Year ");
        int n = sc.nextInt();
        if (n % 4 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("Not a Leap year");
        }

    }

    static void printlargestnum() {
        
        System.out.println("Enter A and B Value : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A= "+a+ " Is the largest  number");
        } else {
            System.out.println("B= "+b+ " Is the largest  number");
        }
    }
    static void print3numlargest() {
        
        System.out.println("Enter A and B and C Value : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A= "+a+ " Is the largest  number");
        } else if(b > a && b > c) {
            System.out.println("B= "+b+ " Is the largest  number");
        } else if(c > a && c > b){
            System.out.println("C= "+c+ " Is the largest  number");
            
        }
    }

    static void printColdWarn(){
         
        System.out.println("Enter the temperature :  ");
        int n = sc.nextInt();
        if (n <= 0 ) {
            System.out.println("The temperature is Cold ");
        }
        else if (n > 0 && n < 100){
            System.out.println("The temperature is warm ");
        }
        else if(n >=100){
            System.out.println("The temperature is Hot");
        }

    }

    static void printVowelConsonant(){
        
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch =='e' || ch =='i' || ch == 'o' ||ch == 'u'){
            System.out.println("Its is a vowel");
        }
        else {
            System.out.println("It is a consonant");
        }
    }
    static void checkupperLowerSymbol(){
        
        System.out.println("Enter character : ");
        char ch = sc.next().charAt(0);
       
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The char is lower");
            
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("The char is Upper");
            
        }
        else if (ch >= '0' && ch <= '9'){
            System.out.println("The char is digits");
            
        }
        else{
            System.out.println("The char is special symbol");
        }

    }

    public static void main(String[] args) {
        // Q1. take a number and print whether it's positive ,negative,and zero
         checkPosNegNumber();

        // Q2. check if a number is even or odd
        checkEvenOrOdd();

        // Q3. Check if a number is divisible by 5
        checkdivisible5();

        // Q4. Check if a number is divisible by both 3 and 5
        checkdivisible5and3();

        // Q5. check if a given year is a leap Year
        checkLeapYear();

        //Q6.Take 2 number is and print largest number
        printlargestnum();

        //Q7.Take 3 numebr and print largest number
        print3numlargest();

        //Q8. take a temperatute value and print "Cold","Warm" and "Hot" Using range condition
        printColdWarn();

        //Q9. take a char and check if it's vowel or consonant.
        printVowelConsonant();

        //Q10 take a char and check whether it's upper case ,lower and a digit or special character
        checkupperLowerSymbol();



    }
}