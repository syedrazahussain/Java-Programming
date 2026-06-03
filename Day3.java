//*****************************Day -3 (Operators,control statements decison makings)******************************
class Day3{
    public static void main(String args[]){
        //1.Arithmetic operator
        System.out.println("arithemetic operators");
        int a = 60; 
        int b = 10;
        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (a/b));
        System.out.println("A % B = " + (a%b));

        //2.Assignment Operaotors
        System.out.println("assignment operators");
        int a1 = 1;
        
        System.out.println("a1 += 3: " + (a1 += 3));
        System.out.println("a1 -= 2: " + (a1 -= 2));
        System.out.println("a1 *= 4: " + (a1 *= 4));
        System.out.println("a1 /= 3: " + (a1 /= 3));

        //3.relational operators
        System.out.println("Relational operators");

        int a2 = 10;
        int b2 = 20;
        int c2 = 30;

        System.out.println("a2 > b2: " + (a2 > b2));
        System.out.println("a2 > b2:  " + (a2 < b2));
        System.out.println("a2 >= b2: " + (a2 >= b2));
        System.out.println("a2 <= b2: " + (a2 <= b2));
        System.out.println("a2 == c: " + (a2 == c2));
        System.out.println("a2 != c: " + (a2 != c2));

        //4 Logical Operators
        System.out.println("Logical Operators");

        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        //5.Unary operators
        System.out.println("Unary operators");

        int a3 =10;
        int b3 = 20;

        System.out.println("post increment: "+ (a3++));
        System.out.println("pre increment: "+ (++a3));
        System.out.println("post decrement: "+ (b3--));
        System.out.println("pre decrement: "+ (--b3));

        //6.Ternary operators
        System.out.println("Ternary operators");
        int n1= 5,n2 =10;
        System.out.println("First num: " + n1);
        System.out.println("second num: " + n2);

        int max = (n1 > n2)? n1 :n2;
        System.out.println("Maximum is: " + max);



        //=================Control statement (If else)==========================================
        //simple if condition

        int x1 = 10;
        int x2 = 12;

        if(x1+x2 > 20){
            System.out.println("x + y is greater than 50 ");
        }

        //if else condition 
        int x3 = 10;
        int x4 = 20;
        if (x3 > x4){
            System.out.println("x3 is graeter");
        }
        else {
            System.out.println("x4 is greater");
        }

        //if else if condition

        String city = "Hyd";
        if(city == "Hyd"){
            System.out.println("This is hyderabad");
        }
        else if (city =="vizag"){
            System.out.println("This is vizag");
        }
        else{
            System.out.println("NO city");
        }

        //nested if statement

        int a4 = 10;
        int b4 = 20;
        if (a4==10){
            if(b4==20){
                System.out.println("Hello");
            }
            else{
                System.out.println("Iam inside");
            }
        }
        else{
            System.out.println("else outside executed");
        }

        //switch

        int number =1;

        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
        
        
            default:
                System.out.println("not in 10,20 or 30");
        }




        




    }

}