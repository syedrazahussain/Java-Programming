//=========Day 19 Phase 2 - looping & pattern (iteration & flow)=========
//********Level 1 : Basic Looping (introductory)************* */

import java.util.Scanner;

class Day19 {
    static Scanner sc = new Scanner(System.in);

    static void printnumberwithloop() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    static void printallevennumber() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    static void printalloddnumber() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    static void printreversernumbering() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");

        }
    }

    static void printtable() {
        System.out.println("Enter Number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

    static void printsumofnatural() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;

        }
        System.out.print(sum + " ");
    }

    static void printsumofevennumber() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum + " ");

    }

    static void printsumofalloddnumber() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.print(sum + " ");
    }

    static void printfactorial() {
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println(product);
    }

    static void printproductofdigit() {
        System.out.println("Enter Any number : ");
        int n = sc.nextInt();
        int temp = n;
        
        int product =1;
        while (temp > 0) {
           int digits = temp % 10;
            product*=digits;
            temp = temp / 10;
            
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        
        // Q1. Print numbers from 1 to 10
        printnumberwithloop();

        // Q2.Print all even numbers from 1 t0 100
        printallevennumber();

        // Q3. print all odd number between 1 to 100
        printalloddnumber();

        // Q4. print number from 10 down to 1
        printreversernumbering();

        // Q5. print the table of a given number (n x 1 to n x 10)
        printtable();

        // Q6. print the sum of first n natural numbers
        printsumofnatural();

        // Q7. print the sum of all even number up to n
        printsumofevennumber();

        // Q8. print the sum of all odd number up to n
        printsumofalloddnumber();

        // Q9. print the factorial of a given number.
        printfactorial();

        // Q10. print the product of digits of a given number.
        printproductofdigit();

    }
}