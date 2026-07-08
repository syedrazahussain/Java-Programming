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
    static void checkevenoroddWith2num(){
        System.out.println("Enter any 2 values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%2 == 0 && b%2 == 0){
            System.out.println("Both are even ");
        }
        else if (a%2 == 1 && b%2 ==1){
            System.out.println("Bothe are odd");
        }
        else if(a%2 == 1 || b%2 ==0 && a%2 ==0 || b%2 == 1){
            System.out.println("One is even and one is odd ");
        }
    }

    static void checkalpahbet(){
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'm'){
            System.out.println("Its lies between A - M");
        }
        else if(ch >= 'n' && ch <= 'z'){
            System.out.println("Its lies between N - Z");
        }
        else {
            System.out.println("Invalid char");
        }
    }

    static void printDay(){
        System.out.println("Enter Number (1-7)");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                
                break;
            case 2:
                System.out.println("Tuesday");
                
                break;
            case 3:
                System.out.println("Wednesday");
                
                break;
            case 4:
                System.out.println("Thursday");
                
                break;
            case 5:
                System.out.println("Friday");
                
                break;
            case 6:
                System.out.println("Saturday");
                
                break;
            case 7:
                System.out.println("Sunday");
                
                break;
        
            default:
                System.out.println("Invalid number");
                break;
        }
    }
    static void printNoofdays(){
        System.out.println("Enter Month number (1-12)");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("31");
                
                break;
            case 2:
                System.out.println("28");
                
                break;
            case 3:
                System.out.println("31");
                
                break;
            case 4:
                System.out.println("30");
                
                break;
            case 5:
                System.out.println("31");
                
                break;
            case 6:
                System.out.println("30");
                
                break;
            case 7:
                System.out.println("31");
                
                break;
            case 8:
                System.out.println("30");
                
                break;
            case 9:
                System.out.println("31");
                
                break;
            case 10:
                System.out.println("30");
                
                break;
            case 11:
                System.out.println("31");
                
                break;
            case 12:
                System.out.println("31");
                
                break;
        
            default:
                System.out.println("Invalid number");
                break;
        }

    }


    public static void main(String[] args) {

        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value : ");
        int c = sc.nextInt();

        // Q1. Take three sides and check if they form a valid triangle.
        checkValidTraingle(a,b,c);

        // Q2. if the sides form a valid triangle, determine whether it is equilateral,
        // isosceles, or scalene
        checkwhichTypeTraingle(a, b, c);

        // Q3. Take marks (0-100) and print the corresponding grade (A/B/C/D/F)
        printgrade();

        // Q4. Check if one of two given numbers is a multiple of the other
        check2multiplenumbers();

        // Q5. Take the hour of the day (0-23) and print "Good morning","Good
        // afternoon","Good Evening","Good Night"
        greetingwithHour();

        // Q6. Check Voting eligibilty for a given age(18+)
        checkVotingAge();

        //Q7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd
        checkevenoroddWith2num();

        //Q8. Take a alphabet character and check if it lies between ' a' and 'm' or 'n' and 'z'
        checkalpahbet();

        //Q9. Take a day number (1-7) and print the corresponding day name
        printDay();

        //Q10. Take a month number (1-12) and print the number of days in that month (ignore)
        //leap year
        printNoofdays();


    }
}