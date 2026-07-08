//========================Day 15(Master Your Logic building)===============

//***********Level 2 Nested if & Multiple condition***************** */

import java.util.Scanner;

class Day15 {
    static Scanner sc = new Scanner(System.in);

    static boolean checkValidTraingle(int a, int b, int c) {

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Its is valid Traingle");
            return true;
        } else {
            System.out.println("can't form valid traingle");
        }
        return false;

    }

    static void checkwhichTypeTraingle(int a, int b, int c) {

        boolean trai = checkValidTraingle(a, b, c);

        if (trai == false) {
            System.out.println("Invalid Traingle");
        } else {
            if (a == b && a == c) {
                System.out.println("Its is a equilateral traingle");
            } else if (a == b || a == c || b == c) {

                System.out.println("Isoscles traingle");

            } else if (a != b && a != c && b != c) {

                System.out.println("Scalene traingle");
            }

        }

    }

    static void printgrade() {
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        if (marks > 90 && marks <= 100) {
            System.out.println("A Grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("B Grade");

        } else if (marks >= 70 && marks < 80) {
            System.out.println("c Grade");

        } else if (marks >= 60 && marks < 70) {
            System.out.println("D Grade");

        } else {
            System.out.println("F Grade");

        }
    }

    static void check2multiplenumbers() {
        System.out.println("Enter A value : ");
        int a = sc.nextInt();
        System.out.println("Enter B value : ");
        int b = sc.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("Its is multiple");
        } else {
            System.out.println("Its is not a multiple");
        }
    }

    static void greetingwithHour() {
        System.out.println("Enter Time (0 - 23)");
        int time = sc.nextInt();
        if (time == 0 && time < 12) {
            System.out.println(" Good Morning ");
        } else if (time >= 12 && time <= 16) {
            System.out.println("Good Afternoon");
        } else if (time >= 17 && time <= 18) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
    }

    static void checkVotingAge() {
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible ");
        } else {
            System.out.println("Not eligible");
        }
    }
    static void
    public static void main(String[] args) {

        // System.out.println("Enter A Value : ");
        // int a = sc.nextInt();
        // System.out.println("Enter B Value : ");
        // int b = sc.nextInt();
        // System.out.println("Enter C Value : ");
        // int c = sc.nextInt();

        // Q1. Take three sides and check if they form a valid triangle.
        // checkValidTraingle(a,b,c);

        // Q2. if the sides form a valid triangle, determine whether it is equilateral,
        // isosceles, or scalene
        // checkwhichTypeTraingle(a, b, c);

        // Q3. Take marks (0-100) and print the corresponding grade (A/B/C/D/F)
        // printgrade();

        // Q4. Check if one of two given numbers is a multiple of the other
        // check2multiplenumbers();

        // Q5. Take the hour of the day (0-23) and print "Good morning","Good
        // afternoon","Good Evening","Good Night"
        // greetingwithHour();

        // Q6. Check Voting eligibilty for a given age(18+)
        // checkVotingAge();

        //Q7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd
        checkevenoroddWith2num();

    }
}