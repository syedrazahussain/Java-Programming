//======================Day-22 (pattern printing (stars & number) )=====================================
//********Level 5 : Logical Loop combination******* */

import java.util.Scanner;

class Day22 {
    static Scanner sc = new Scanner(System.in);

    static void printsinglestar() {
        System.out.println("*");
    }

    static void fourstars() {
        System.out.println("****");
    }

    static void printNStars(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*" + " ");
        }

    }

    static void printsquarestars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printincreasingtraingle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void printrighttraingle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void printevennumberstars(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printoddnumberstars(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printcenteredpyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printsstarswithbspaces(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("B");
            }

            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Q1. print a single star(*)
        // printsinglestar();

        // Q2. print four stars
        // fourstars();

        // Q3. print n stars on same line
        // printNStars(20);

        // Q4. print square of stars(n X n stars)
        // printsquarestars(5);

        // Q5. print an increasing traingle of stars
        // printincreasingtraingle(5);

        // Q6. print a right aligned traingle of stars
        // printrighttraingle(10);

        // Q7. print stars in even number(2,4,6,8)
        // printevennumberstars(10);

        // Q8. print stars in odd number(1,3,5,7,9)
        // printoddnumberstars(5);

        // Q9. print a centered pyramid of stars
        // printcenteredpyramid(5);

        // Q10. print stars and spaces alternating (stars and blank spaces)
        printsstarswithbspaces(10);

    }
}