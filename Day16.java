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
        if (digits == 1) {
            System.out.println("Single Digit hai");
        }
        if (digits == 2) {
            System.out.println("double Digit hai");
        }
        if (digits >= 3) {
            System.out.println("multi Digit hai");
        }

    }

    static void checkmultipleof7orends7() {
        System.out.println("Enter Any number :");
        int number = sc.nextInt();
        int temp = number;
        int digits = 0;
        int originalnum = number;
        int lastvalue = 0;

        number = temp % 10;

        temp = temp / 10;

        digits++;
        if (digits == 1) {

            lastvalue = number;
        }

        System.out.println(lastvalue);
        if (originalnum % 7 == 0 || lastvalue == 7) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

    }

    static void determineQuadrant() {
        System.out.println("Enter X axis : ");
        int x = sc.nextInt();
        System.out.println("Enter Y-axis : ");
        int y = sc.nextInt();
        System.out.println("Coordinates are " + "(" + x + "," + y + ")");

        if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");

        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");

        } else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");

        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("y-axis");
        } else if (y == 0) {
            System.out.println("X-axis");
        }
    }

    static void checkcurrencyevenlydivided() {
        System.out.println("Enter an $Amount : ");
        int amount = sc.nextInt();
        int remaining = 0;
        int originalamount = amount;
        amount = originalamount / 2000;
        remaining = originalamount % 2000;
        System.out.println("Remaining" + remaining);
        amount = remaining / 500;
        remaining = remaining % 500;
        System.out.println("Remaining" + remaining);
        amount = remaining / 100;
        remaining = remaining % 100;
        System.out.println("Remaining" + remaining);

        if (remaining == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Not possible");
        }
    }

    static void checknumberRange() {
        System.out.println("Enter number [100-999] : ");
        int number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            System.out.println("Yes it lies between [100-999]");
        } else {
            System.out.println("NOt lies");
        }

    }

    static void calthirdangle() {
        System.out.println("Enter first angle ");
        int firstAngle = sc.nextInt();
        System.out.println("Enter Second angle");
        int secondAngle = sc.nextInt();
        int TotalAngleofTraingle = 180;

        TotalAngleofTraingle = TotalAngleofTraingle - (firstAngle + secondAngle);
        System.out.println("The Third Angle is : " + TotalAngleofTraingle);
    }

    static void checkPerfectSquare() {
        System.out.println("Enter Any number ");
        int number = sc.nextInt();
        int square = 0;
        boolean found = false;
        for (int i = 1; i <= number; i++) {
            square = i * i;
            if (square == number) {

                found = true;
                break;

            }

        }
        if (found == true) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect number");
        }

    }

    public static void main(String[] args) {
        // Q1. Take a 3-digit number and check if all digits are distinct
        checkDistinct();

        // Q2. Take a 3 -digit number and determine if th emiddle digit is the
        // largest,smallest or neither
        checkmiddleDigit();

        // Q3 . take a 4 - digit number and check if the first and last digits arev
        // equal
        checkfirstandlastequality();

        // Q4. Check whether a given integer is single digit,double digir or multi digit
        checksinglemultidigit();

        // Q5. check if a number is a multiple of 7 or ends with 7
        checkmultipleof7orends7();

        // Q6. Take coordinates (x,y) and determine which quadrant the point lies in
        determineQuadrant();

        // Q7. check if an amount can be evenly divided into 2000,500, and 100 currency
        // notes
        checkcurrencyevenlydivided();

        // Q8. check if a number lies within the range[100,999]
        checknumberRange();

        // Q9. Take two angles of a triangle and compute the third angle
        calthirdangle();

        // Q10. Check whether a number is a perfect square(without the square root
        // function)
        checkPerfectSquare();
    }
}