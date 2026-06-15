//===========================(day -11)Important logicv building problem===========

import java.util.Scanner;

class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1 : Check Prime number or not
        // System.out.println("Enter any Number : ");
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // if(count == 2){
        // System.out.println("Its Prime Number");
        // }
        // else {
        // System.out.println("Not a Prime number");
        // }

        // question 2 : print Factorial check
        // System.out.println("Enter any Number : ");
        // int num = sc.nextInt();
        // int fact = 1;
        // for(int i = 1; i<=num; i++){
        // fact*= i;
        // }
        // System.out.println("The Factorial Number : " +fact);

        // question 3 : Print Fibonacci series
        // System.out.println("Enter number Range for series : ");
        // int num1 = sc.nextInt();
        // int firstSum = 0;
        // int secondSum = 1;
        // int nextSum;
        // for(int i = 0; i<=num1; i++){
        // System.out.print(firstSum + " ");
        // nextSum = firstSum + secondSum;
        // firstSum = secondSum;
        // secondSum = nextSum;

        // }

        // question 4 : Reverse number
        System.out.println("Enter any number : ");
        int num2 = sc.nextInt();
        int revnum = 0;
        while(num2 > 0) {
            int rem = num2 % 10;
            revnum = revnum * 10 + rem;
            num2 = num2 / 10;
        }
        System.out.println(revnum);
        

    }
}