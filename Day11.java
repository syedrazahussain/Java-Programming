//===========================(day -11)Important logicv building problem===========

import java.util.Scanner;

class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1 : Check Prime number or not 
        //the prime number is said to be if number is 13 the number is divisible by 1 and itsef is called prime
        System.out.println("Enter any Number : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
        count++;
        }
        }
        if(count == 2){
        System.out.println("Its Prime Number");
        }
        else {
        System.out.println("Not a Prime number");
        }

        // question 2 : print Factorial check
        System.out.println("Enter any Number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=num; i++){
        fact*= i;
        }
        System.out.println("The Factorial Number : " +fact);

        // question 3 : Print Fibonacci series
        System.out.println("Enter number Range for series : ");
        int num1 = sc.nextInt();
        int firstSum = 0;
        int secondSum = 1;
        int nextSum;
        for(int i = 0; i<=num1; i++){
        System.out.print(firstSum + " ");
        nextSum = firstSum + secondSum;
        firstSum = secondSum;
        secondSum = nextSum;

        }

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

        // question 5 :palindrome number or not

        System.out.println("Enter any number : ");
        int num3 = sc.nextInt();
        int originalnum = num3;
        int revnum1 = 0;
        while (num3 > 0) {
        int rem1 = num3 % 10;
        revnum1 = revnum1 * 10 + rem1;
        num3 = num3/10;

        }
        if(originalnum == revnum1){
        System.out.println("It is a palindrom");

        }
        else{
        System.out.println("Not a palindrom");

        }

        // question 6 : check the given number is armstrong or not  
        // input 153 = 1^3 + 5^3 +3^3 = 153  if 153==153 the armstrong
        System.out.println("Enter Any Number : ");
        int no = sc.nextInt();

        // to know digits of number
        int digits = 0, temp;
        temp = no;

        while (temp > 0) {
            temp = temp / 10;
            digits++;

        }
        System.out.println("Digits : " + digits);
        
        temp = no;
        int sum = 0;

        while (temp > 0) {
            int rem1 = temp % 10;
            int power =1;
            for(int i = 1; i <=digits; i++){
                power = power * rem1;
            }
            sum = sum + power;
          
            temp = temp / 10;

        }
        System.out.println(" arm no" +sum);
        if(sum == no){
            System.out.println("This is armstrong");
        }
        else{
            System.out.println("NOt a armstrong");
        }

    }
}