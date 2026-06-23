
//======================Day-12 (important question)==========================

import java.util.Scanner;

class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1 : The sum of the digits

        // System.out.println("Enter any number : ");
        // int no = sc.nextInt();

        // int temp = no;
        // int sum = 0;

        // while (temp > 0) {
        //     temp = no % 10; // 123 ==> 3
        //     sum += temp; // sum =0+3 =3
        //     no = no / 10; // 123/10 ==>12

        // }
        // System.out.println("The sum of the digits is : " + sum);

        // question 2 : The GCD or lcm of the number
        System.out.print("Enter value of A : ");
        int a = sc.nextInt();

        System.out.print("Enter value of B : ");
        int b = sc.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
            if (a == 0) {
                System.out.println("B is a GCD");
                break;

            }
            if (b == 0) {
                System.out.println("A is a GCD");
                break;
            }
        }
        System.out.println("The greatest common factor is : " +a);

    }
}