//*****************************Day -5 (Arrays,strings,functions)******************************

import java.util.Scanner;

class Day5 {

    //  =======================Function ===========================================
    public static void greeting(){
        System.out.println("Hello! Good Evening");
    }

    public static void sum(int a,int b){
        int c= a+b;
        System.out.println("The sum of " + a + " and " + b + " is : " + c );
    }
    public static void printarray(int [] arr5,int x2){ 
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter elements: ");
        for(int i = 0; i < arr5.length; i++) {
            arr5[i] = sc.nextInt();

        }
        for(int i = 0; i < arr5.length; i++) {
            if(arr5[i] == x2){
                System.err.println("Target present in array : ");
            }

        }
      


    }
    public static void main(String[] args) {

        greeting();
        sum(10,20);
        int[] arr5 = new int[5];
        printarray(arr5, 10);
        //============================arrays====================================
        //array declaration

        int a[] = {44,3,2,1};
        System.out.println(a[0]); //accessing the element
        a[0] = 2222;
        System.out.println(a[0]);//changing of array elements
        System.out.println(a.length);

        //single dimensional array
        int[] singledimensionaal = {10,2030,23,4,5};

        for (int i = 0; i < singledimensionaal.length; i++) {
            System.out.println("Element at index " + i + " : " + singledimensionaal[i]);

        }

        //2 dimensional array
        int[][] multidimen = {{1,2,3},{23,4,5},{10,2,3}};
        for(int i =0;i<multidimen.length;i++){
            for(int j =0;j<multidimen.length;j++){
                System.out.print(multidimen[i][j] + " ");
                
            
            }
            System.out.println();
        }

        //3 dimensional 
        int [][][] threedimen = new int[1][2][3];


        //==========================strings=======================================

        //strings declaration
        String firstName = "Syed";
        String middleName = "Raza";
        String lastName = "Hussain";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        //strings operation

        //length
        System.out.println(firstName.length());

        //concat
        String joinedstring = firstName.concat(" " + middleName);
        String finalname = joinedstring.concat(" " + lastName);
        joinedstring = finalname;
        System.out.println("My name is : " + joinedstring);

        //contains

        boolean result = joinedstring.contains("Raza");
        System.out.println(result);

        //replace
       String result1 = joinedstring.replace("x", "y");
       System.out.println(result1);

       //to lower case

       String lowercasename = joinedstring.toLowerCase();
       System.out.println(lowercasename);

       //to upper case

       String Uppercase = joinedstring.toUpperCase();
       System.out.println(Uppercase);

        //trim

        String str1 = "          hello              ";
        System.out.println(str1.trim());;

        //isempty

        String str2 = "Hello";
        String str3 = "";
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());

        //==========================Function==================================
        


    }
}