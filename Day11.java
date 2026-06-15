//===========================(day -11)Important logicv building problem===========

import java.util.Scanner;

class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1 : Check Prime number or not
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

    }
}