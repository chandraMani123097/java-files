public class advance_patterns {
    public static void main(String[] args) {
       



            //       *****
            //      *****
            //     *****  
            //    *****
            //   *****   
        int n1=5;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


      System.out.print("\n\n\n");
         
//          * 
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

    int n=6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }

        

        System.out.println();
    }
    

    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }

        

        System.out.println();
    }


                                        
         

    
       
    }
}
