//=====================Day-9(patterns)=====================================
class Day9 {
    public static void main(String[] args) {

        // print A Pattern
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) / 2 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
        System.out.println();

        // // pattern B
        int n2 = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) ||
                        j == 0 ||
                        (j == n - 1 && i > 0 && i < n / 2) ||
                        (j == n - 1 && i > n / 2 && i < n - 1) ||
                        (i == n / 2 && j < n - 1) ||
                        (i == n - 1 && j < n - 1)) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //pattern c

         n = 8;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==0 || i ==0|| i == n-1) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //pattern D
          n = 8;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==0 || i ==0 && j <n-1|| i == n-1 && j<n-1 || j== n-1 && i>0 && i<n-1) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //pattern E
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==0 || i == 0 || i == n-1 || i == (n-1)/2) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

         //pattern F

         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==0 || i == 0 || i == (n-1)/2) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        // pattern G
         
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==0 || i==0 || i ==(n-1) || j == n-1 && i>(n-1)/2 || i == (n-1)/2 && j>(n-1)/2) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

         //pattern H
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==0 || j == n-1 || i ==(n-1)/2) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // pattern I
         
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==(n-1)/2 || i ==0 || i == n-1) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // pattern J

         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j==(n-1) && i<n-1|| i == n-1 && j<n-1 && j>(n-1)/2 || i ==0 && j>(n-1)/2) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


    }
}