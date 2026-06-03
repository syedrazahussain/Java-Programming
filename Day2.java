// **********************Day2(Variables,Datatypes,Java Type conversion)***************************

class Day2 {
    public static void main(String[] args) {
        //1. variables

        //in variables we can decelare like separte lines
        int a=10;
        int b=20;

        //single line declaration
        int aa,bb,cc;
        float afloat = 2.5f;

        System.out.println(afloat);

        int var1=10,var2=30,var3;
        var1 = var2;
        var3 = var1;
        System.out.println(var3);

        //2.Datatype

        int aaa;
        byte bbb =2;
        //short
        //long
        //double
        //char
        //boolean
        //string

        System.out.println(Short.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //3.Java Type conversion

        //2types: 
                    //1.Widening Conversion(Automatically)
                    //---> It is also known as Implicit
                    //---> Here no loss of data

                    //Byte->short->Int->long->float->Double (small to big)

                    int myInt = 9;
                    double myDouble = myInt;
                    System.out.println(myInt);
                    System.out.println(myDouble);

                    //2.Narrowing Conversion
                     //---> It is also known as Explicit
                    //---> Here loss of data

                    //Double->Float->long->Int->Short->Byte (Big to small)

                    double myDouble1 = 9.74d;
                    int myInt1 = (int) myDouble1;
                    System.out.println(myDouble1);
                    System.out.println(myInt1);




        
    }

}