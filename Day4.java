//*****************************Day -4 (looping statements,jumpings statements)******************************

class Day4{
    public static void main(String[] args){
        //===================loops in java================================
        //1.for loop
        int n=5;

        for(int i = 0; i <= n; i++){
            System.out.println("Iam for loop");

        }

        // 2.While loop 

        int n1 =3,i=1;

        while(i <=n1){
            System.out.println(i+ " Iam While loop ");
            i++;
        }

        //3.Do while

        int n2=5,i1=0;
        do{
            System.out.println(i1 + " DO executed");
            i1++;
        }
        while(i1<2);

        //jumpings statement

        //1.break

        for(int i2 = 0; i2 <=10; i2++){
            if(i2==5) {
                break;
            }
            System.out.println(i2);
        }

        //2.continues

         for(int i3 = 0; i3 <=10; i3++){
            if(i3 == 5) {
                
            continue;
            
            }
            System.out.println(i3);
        }



    }
}