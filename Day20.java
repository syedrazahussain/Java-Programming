//===========Day 20 (phase 2 - looping patterns(iteration & flow)===========
//Level 2: Number-based looping logic

import java.util.Scanner;

class Day20 {
    static Scanner sc = new Scanner(System.in);

    static int takeinput() {
        System.out.println("Enter Any Number : ");
        int number = sc.nextInt();
        return number;
    }

    static void countNoOfDigits() {
        int number = takeinput();
        int temp = number;
        int digits = 0;
        while (temp > 0) {

            digits++;
            temp = temp / 10;

        }
        System.out.println(digits);
    }

    static void printreversernumber() {
        int number = takeinput();
        int temp = number;
        int reverse = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;

        }
        System.out.print(reverse);

    }

    static void checkpalindromenumber() {
        int number = takeinput();
        int temp = number;
        int digit = 0;
        int reverse = 0;
        while (temp > 0) {
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;

        }

        if (number == reverse) {
            System.out.println("Palindrome");

        } else {
            System.out.println("No");
        }
    }

    static void findsumofdigits() {
        int number = takeinput();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;

        }
        System.out.println("The sum of digits : " + sum);
    }

    static void findArmStrongNumber() {
        int number = takeinput();
        int temp = number;
        int digits = 0;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;

            digits++;

            temp = temp / 10;
        }

        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }
            sum += power;

            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not");
        }

    }

    static void findperfectnumber() {
        int number = takeinput();
        int sum = 0;
        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                sum += i;
            }

        }

        if (sum == number) {
            System.out.println("Perfect number ");
        } else {
            System.out.println("Not");
        }
    }

    static void printprimenumber() {

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {

                    count++;
                }

            }

            if (count == 2) {
                System.out.print(i + " ");
            }

        }

    }

    static void checkprimenumber() {
        int number = takeinput();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("It is prime number ");
        } else {
            System.out.println("Not");
        }
    }

    static void printfibonacciseries(){
        int number = takeinput();
        int fib1 =0;
        int fib2 =1;
        
        for(int i = 1; i <=number; i++){
            System.out.print(fib1+" ");
           int fib = fib1+fib2;
           fib1 = fib2;
           fib2 = fib;
            
            
            
            
            
        }
    }

    public static void main(String[] args) {
        // Q1. Count the number of digits in a given number
        // countNoOfDigits();

        // Q2. print the reverse of a given number
        // printreversernumber();

        // Q3. check if a number is a palindrome
        // checkpalindromenumber();

        // Q4. Find the sum of digits of a number
        // findsumofdigits();

        // Q5. check if a number is an armstrong number
        // findArmStrongNumber();

        // Q6. check if a number is a perfect number
        // findperfectnumber();

        // Q7. print all prime number between 1 and 100
        // printprimenumber();

        // Q8. check if a numvber is prime or not
        // checkprimenumber();

        // Q9. print fibonacci series upto n terms
        printfibonacciseries();
    }
}