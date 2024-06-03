public class pattern1 {
    public static void main(String[] args) {


        // 1 2 3 4 5 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        int n=6;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
          }
             
          System.out.print("\n\n\n");


         //  1  
          // 0  1
          // 1  0  1
          // 0  1  0  1
          // 1  0  1  0  1
          int num=5;
          for(int i=1;i<=num;i++){
              for(int j=1;j<=i;j++){
                  int sum = i+j;
                  if(sum%2==0){
                      System.out.print("1  ");
                  }else{
                      System.out.print("0  ");
                  }
      
      
              }
              System.out.println();
          }
          System.out.print("\n\n\n");
           


        //   1  
        //   2  3  
        //   4  5  6  
        //   7  8  9  10
        //   11  12  13  14  15
        //   16  17  18  19  20  21
        int n1=5;
        int num2=1;
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(num2++ +"  ");
            }
            System.out.println();
        }
    }
    
}
