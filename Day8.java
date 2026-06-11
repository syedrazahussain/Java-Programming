//===================Day -8 (Local,instance,static,exception handling)=======

class Day8 {
    //static var
    static int count = 0;
    //instance var
    int instancevar = 0;
    


    public static void main(String[] args) {
        //local var
        int localvar = 10;
        System.out.println(localvar);
        Day8 obj1 = new Day8();
        System.out.println(count);
        System.out.println(obj1.instancevar);

        //exception handling 
        //1.try
        //2.catch
        //3.throw
        //4.throws
        //5.finally

        try{
            int[] arr = {10,20,30};
            System.out.println(arr[3]);
        }
        catch(Exception e) {
            System.out.println("Out of bound array "+e.getMessage());
        }
        finally{
            System.out.println("Finally is executed");
        }

       int age = 18;
       if(age < 18) {
        throw new ArithmeticException("Access denied you are not eligible for voting");
       }
       else{
        System.out.println("Congras you are eligible for vote ");
       }

        
       }
        
    }
