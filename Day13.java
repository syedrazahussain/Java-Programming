//===========================Day13 guessing the number============================

import java.util.Scanner;

class Day13 {
    static int GenerateRandomNumber() {
        int x = (int) (Math.random() * 101);

        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand = GenerateRandomNumber();
        int num = 0;
        while (num != rand) {
            System.out.println("Guess Any Number : ");
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("Please Enter valid number 1 to 100");

            } else if(num ==0){
                System.out.println("Game Over");
                break;

            }else if (num == rand) {
                System.out.println("Congragulation You Choose Right Number");
                System.out.println("The Number is : " + rand);

            }

            else if (num > rand) {
                System.out.println("You Choose Higher Number");

            } else if (num < rand) {
                System.out.println("You Choose Less Number ");

            }

        }
    }
}