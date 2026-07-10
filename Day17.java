//===============Day17 (Master Your Logic Building)======================
//**********Level 4 : Logical Operators & Compound Statements **********/

import java.util.Scanner;

class Day17 {
    static Scanner sc = new Scanner(System.in);

    static void checkDigitletterneither() {
        System.out.println("Enter Any Letter: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Letter");
        } else if (ch >= '1' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Neither");
        }
    }

    static void printfizzbuzz() {
        System.out.println("Enter Any number : ");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        }
    }

    static void printmedianvalue() {
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value : ");
        int c = sc.nextInt();

        if (a > b && a < c || a < b && a > c) {
            System.out.println(a + " Median");
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b + " Median");
        } else if (c > a && c < b || c < a && c > b) {
            System.out.println(c + " Median");
        }

    }

    static void checkAMorPM() {
        System.out.println("Enter Hours (1 - 24) : ");
        int hours = sc.nextInt();
        System.out.println("Enter Minutes (0 - 59)");
        int minutes = sc.nextInt();

        if (hours >= 1 && hours <= 12 && minutes >= 0 && minutes <= 59) {
            System.out.println("AM");
        } else if (hours >= 13 && hours <= 24 && minutes >= 0 && minutes <= 59) {
            System.out.println("PM");
        }

    }

    static void checkeligibleTax() {
        System.out.println("Enter Income : ");
        int income = sc.nextInt();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();

        if (income >= 5 && age >= 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Not eligible");
        }
    }

    static void checkbothpos() {
        System.out.println("Enter A value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        if (a >= 0 && b >= 0 && (a + b) < 100) {
            System.out.println("Yes it is postive and also less than 100");

        } else {
            System.out.println("No");
        }
    }

    static void printwordnumber() {
        System.out.println("Enter a number (0-9) : ");
        int number = sc.nextInt();
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("five");
                break;

            case 6:
                System.out.println("six");
                break;

            case 7:
                System.out.println("seven");
                break;

            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

            default:
                System.out.println("Enter number in between (0-9)");
                break;
        }
    }

    static void printweekday() {
        System.out.println("Enter a number (0-7) : ");
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
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Enter number in between (0-7)");
                break;
        }

    }

    static void calelectricitybill() {

        System.out.println("Enter Units : ");
        int units = sc.nextInt();
        int rupees = 0;
        if (units >= 0 && units <= 100) {
            rupees = 2 * units;
            System.out.println("Rupees : $" + rupees);

        }
        if (units >= 101 && units <= 200) {
            rupees = 3 * units;
            System.out.println("Rupees : $" + rupees);

        }

        if (units > 200) {
            rupees = 5 * units;
            System.out.println("Rupees : $" + rupees);

        }

    }

    static void checkPassword() {
        System.out.println("Enter combination of letters and one digit : ");
        String password = sc.next();

        int length = password.length();
        boolean hasDigits = false;

        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigits = true;

            }

        }

        if(length >= 8 && hasDigits == true){
            System.out.println("Password valid");
        }
        else {
            System.out.println("Invalid");
        }

    }

    public static void main(String[] args) {
        // Q1. Take a character and check if it is a letter, a digit, or neither.
        checkDigitletterneither();

        // Q2. Take a number and print "Fizz" if divisible by 3, "BUZZ" if divisible by
        // 5,
        // and "FizzBuzz" if divisible by both.
        printfizzbuzz();

        // Q3. Take three numbers and print the median value (neither maximum or
        // minimum)
        printmedianvalue();

        // Q4. Take 24 hour time (hours and minutes) and print whether its AM or PM
        checkAMorPM();

        // Q5. take income and age, and check if eligible for tax (age > 18 and income >
        // 5L)
        checkeligibleTax();

        // Q6. Take two numbers anc check if both are positive and their sum is less
        // than 100.
        checkbothpos();

        // Q7. Take a single digit (0-9) and print its word from ("Zero" to "Nine").
        printwordnumber();

        // Q8. Take a weekday number (1-7) and determine if it is a weekday or weekend
        printweekday();

        // Q9. take a electricity units consumed and calculate the bill as per slabs
        // (using if -else)
        calelectricitybill();

        // Q10. Take a password string and check basic rules (length >=8 and contains at
        // least one digit)
        checkPassword();

    }
}