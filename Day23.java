//==========================Day 23(star pattern)=======================

import java.util.Scanner;

class Day23 {

    static void printincreasingsequence(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

    static void printsamenumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printincreasingeveryrow(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }

    }

    static void printonetozero(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((num % 5) + " ");
                num++;

            }
            System.out.println();
        }
    }

    static void print0and1trainglepattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int val = (i + j) % 2;
                System.out.print(val+" ");
            }
            System.out.println();;
        }
    }
    static void printsequenceabc(int n){
          char ch = 'A';
        for(int i =1; i<=n;i++){
            for(int j = 1; j <=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // Q1. print numbers in an increasing sequence (1,12,123,12345)
        // printincreasingsequence(10);

        // Q2. print repeated numbers per row (same number repeated)
        // printsamenumber(10);

        // Q3.print increasig the every row
        // printincreasingeveryrow(10);

        // Q4. print 1 to 0 the start again start 1 to 0
        // printonetozero(10);

        // Q5. print 0 and 1 in triangle pattern
        // print0and1trainglepattern(10);

        //Q6. print sequence character
        printsequenceabc(5);
      
    }
}