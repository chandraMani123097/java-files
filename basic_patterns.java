import java.util.Scanner;

public class basic_patterns {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of row:\t");
        int row=sc.nextInt();
        System.out.print("enter number of column:\t");
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            //inner  loop
            for(int j=1;j<=column;j++){
                if (i==1 || j==1||i==row||j==column ) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
              
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");

                              
// *****
// ****
// ***
// **
// *



          int row1=5;
             for(int i=row1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
             }
        

             System.out.print("\n\n\n");


        //       *
        //      **
        //     ***
        //    ****
        //   *****
        //  ******

       int n1=5;
       for(int i=0;i<=5;i++){
        for(int j=0;j<=n1-i;j++){
            System.out.print(" ");
        }

        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }

       System.out.print("\n\n\n");

    //    1  
    //    1  2
    //    1  2  3
    //    1  2  3  4
    //    1  2  3  4  5
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"  ");
        }
        System.out.println();
       }
          
    
  
        sc.close();
    }
}





   
