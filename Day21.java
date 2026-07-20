//=====Day 20 (Phase 2 looping & patterns (itreation & flow) )==================
//Level 3 : Mathematical & Logical patterns

import java.util.Scanner;

class Day21 {
    static Scanner sc = new Scanner(System.in);

    static void printsquaresnumber() {
        System.out.println("Enter Any number : ");
        int number = sc.nextInt();
        for (int i = 0; i <= number - 1; i++) {
            System.out.print(i * i + " ");
        }

    }

    static void printcubenumber() {
        System.out.println("Enter Any number : ");
        int number = sc.nextInt();
        for (int i = 0; i <= number - 1; i++) {
            System.out.print(i * i * i + " ");
        }

    }

    static void printallnumberdivisibleby7() {
        System.out.println("Enter A value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    static void findHCFNumber() {
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B value : ");
        int b = sc.nextInt();
        int hcf = 0;
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    hcf = i;

                }
            }
            System.out.print(hcf + " ");
        }

        else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    hcf = i;

                }
            }
            System.out.print(hcf + " ");

        }

    }

    static void printLcmNumber() {
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B value : ");
        int b = sc.nextInt();
        int lcm = 0;
        if (a > b) {
            int i = a;
            while (true) {
                if (i % a == 0 && i % b == 0) {
                    lcm = i;
                    break;
                }
                i++;
            }
            System.out.println("Lcm : " + lcm);
        } else {
            int i = b;
            while (true) {
                if (i % a == 0 && i % b == 0) {
                    lcm = i;
                    break;
                }
                i++;
            }
            System.out.println("Lcm : " + lcm);

        }

    }

    static void printallfactors() {
        System.out.println("Enter Any number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void sumofallfactors() {

        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }

        }
        System.out.println("The sum is : " + sum);

    }

    static void checksumoffactorial() {
        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int digit = 0;
        while (temp > 0) {
            int factorial = 1;
            int digits = temp % 10;
            digit++;
            for (int i = 1; i <= digits; i++) {

                factorial *= i;
            }
            sum += factorial;
            temp = temp / 10;

        }
        if (sum == number) {
            System.out.println("Strong number ");
        } else {
            System.out.println("Not");
        }
    }

    static void printarithmetic() {
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter d value : ");
        int d = sc.nextInt();
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        int current = a;

        for (int i = 1; i <= n; i++) {

            System.out.print(current + " ");
            current += d;

        }

    }

    static void printgeometric() {
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter d value : ");
        int r = sc.nextInt();
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        int current = a;

        for (int i = 1; i <= n; i++) {

            System.out.print(current + " ");
            current *= r;

        }

    }

    public static void main(String[] args) {
        // Q1. Print the squares of number from 1 to n
        // printsquaresnumber();

        // Q2. print cubes of number from 1 to n
        // printcubenumber();

        // Q3. print all numbers between a and b divisible by 7.
        // printallnumberdivisibleby7();

        // Q4. find HCF (GCD) of two numbers using loops.
        // findHCFNumber();

        // Q5. Find LCM of two numbers using loops.
        // printLcmNumber();

        // Q6. print all factors of a given number.
        // printallfactors();

        // Q7. find the sum of all factors of a number.
        // sumofallfactors();

        // Q8. check if a number is strong number (sum of factorial of digits = number)
        // checksumoffactorial();

        // Q9. print first n terms of an arithmetic progression (a,d)
        // printarithmetic();

        // Q10. print first n terms of an geometric progression (a,r)
        printgeometric();

    }
}