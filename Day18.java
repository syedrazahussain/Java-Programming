//====================Day -18 (Master Your Logic Bilding)====================
//*Level 5 : Creative /TRicky logical Scenarios *************************** */

import java.util.Scanner;

class Day18 {
    static Scanner sc = new Scanner(System.in);

    static void checkpointlies() {
        System.out.println("Enter X axis : ");
        int x = sc.nextInt();

        System.out.println("Enter Y axis : ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies on origin");
        } else if (x > 0 && y == 0) {
            System.out.println("Point lies on x-axis ");
        } else if (x == 0 && y > 0) {
            System.out.println("Point lies on y-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Not lies between x axis and y axis");
        }

    }

    static void checkpythogorean() {
        System.out.println("Enter A value : ");
        int a = sc.nextInt();
        System.out.println("Enter B value : ");
        int b = sc.nextInt();
        System.out.println("Enter C value : ");
        int c = sc.nextInt();

        int biggestNum = 0;

        if (a > b && a > c) {

            biggestNum = a * a;
        } else if (b > a && b > c) {

            biggestNum = b * b;

        } else if (c > a && c > b) {

            biggestNum = c * c;

        }

        int A = a * a, B = b * b, C = c * c;

        if (A + B == biggestNum) {
            System.out.println("It can form Pythogorean triplet");

        } else if (B + C == biggestNum) {
            System.out.println("It can form Pythogorean triplet");

        } else if (A + C == biggestNum) {
            System.out.println("it can form pythogorean triplet");
        } else {
            System.out.println("cannot form");
        }

    }

    static void checkvalidDate() {
        System.out.println("Enter Date (1 -31) : ");
        int date = sc.nextInt();
        System.out.println("Enter Month (1-12) : ");
        int month = sc.nextInt();
        if (month > 0 && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (date > 0 && date <= 31) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("not valid date");

                }
            }

            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (date > 0 && date <= 30) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("not valid date");

                }
            } else if (month == 2) {
                if (date > 0 && date <= 28) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("not valid date");

                }

            }

        } else {
            System.out.println("Please Enter (1-12) Month only");
        }

    }

    static void printSmallerangle() {
        System.out.println("Enter Hours : ");
        int hours = sc.nextInt();
        System.out.println("Enter Minutes : ");
        int minutes = sc.nextInt();

        int minutesAngle = 6 * minutes;

        double hoursAngle = 30 * hours + (0.5 * minutes);
        System.out.println("Minutes angle " + minutesAngle);
        System.out.println("Hours angle " + hoursAngle);

        double difference = hoursAngle - minutesAngle;
        double diff = Math.abs(difference);

        double answer = 0;

        if (diff > 180) {
            answer = 360 - diff;
        } else {
            answer = diff;
        }
        System.out.println(Math.abs(answer));

    }

    static void checkarithmeticprogression() {
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value : ");
        int c = sc.nextInt();

        int diff1 = b - a;
        int diff2 = c - b;

        if (diff1 == diff2) {
            System.out.println("It is ARithmetic progression");
        } else {
            System.out.println("No");
        }

    }

    static void checkgeometricprogression() {
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value : ");
        int c = sc.nextInt();

        int ratio1 = b / a;
        int ratio2 = c / b;
        System.out.println(ratio1);
        System.out.println(ratio2);

        if (ratio1 == ratio2) {
            System.out.println("It is geometric progression");
        } else {
            System.out.println("No");
        }

    }

    static void check2digitssum() {
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value : ");
        int c = sc.nextInt();

        if (a + c == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }

    static void checksumgreaterproduct() {
        System.out.println("Enter 1 - 9999 number : ");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        int product = 1;
        int extractdigits = 0;
        while (temp > 0) {
            extractdigits = temp % 10;
            sum += extractdigits;
            product *= extractdigits;
            temp = temp / 10;

        }
        if (sum > product) {
            System.out.println("greater sum");
        } else {
            System.out.println("NO");
        }
    }

    static void checkwhichComesFirst() {
        System.out.println("Enter Date 1 : ");
        int date1 = sc.nextInt();
        System.out.println("Enter Date 2 : ");
        int date2 = sc.nextInt();
        System.out.println("Enter Month 1 : ");
        int month1 = sc.nextInt();
        System.out.println("Enter Month 2 : ");
        int month2 = sc.nextInt();

        if (month1 < month2) {
            System.out.println("Date 1 comes first in the calendar.");
        } else if (month1 > month2) {
            System.out.println("Date 2 comes first in the calendar.");
        } else if (month1 == month2) {
            if (date1 < date2) {
                System.out.println("Date 1 comes first in the calendar.");
            } else if (date1 > date2) {
                System.out.println("Date 2 comes first in the calendar.");

            } else if (date1 == date2) {
                System.out.println("Both month and dates same hai");
            }
        }
    }

    static void printCenturybyYear() {
        System.out.println("Enter Year :");
        int year = sc.nextInt();
        if (year >= 1801 && year <= 1900) {
            System.out.println("19th Century");
        } else if (year >= 1901 && year <= 2000) {
            System.out.println("20th Century");

        } else {
            System.out.println("Enter valid year");
        }
    }

    public static void main(String[] args) {
        // Q1. Take coordinates(X,Y) and check if the point lies on the x- axis,y-axis
        // or at the origin
        checkpointlies();

        // Q2. take three numbers anc check if it forms a pythogorean triplet
        checkpythogorean();

        // Q3. Take day and month and check if it forms a valid calender date (ignoring
        // leap year)
        checkvalidDate();

        // Q4. take time hours and minute and print the smaller angle between the hour
        // and minute hands
        printSmallerangle();

        // Q5. take three numbers and check if they are in arithmetic progression
        checkarithmeticprogression();

        // Q6. take three numbers and check if they are in geometric progression
        checkgeometricprogression();

        // Q7. take 3 digits number and check if the sum of the first and last digit
        // equals the middle digit
        check2digitssum();

        // Q8. take an integer (1-9999) and check if the sum of its digits is greater
        // than the product of its digit
        checksumgreaterproduct();

        // Q9. Take two dates (day and month ) and determine which one comes first in
        // the calender
        checkwhichComesFirst();

        // Q10. take a year and print the corresponding century (e.g., "19th
        // century","20th century")
        printCenturybyYear();

    }
}