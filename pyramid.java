public class pyramid {
    public static void main(String[] args) {
        
    //      1
    //     2 2
    //    3 3 3
    //   4 4 4 4 
    //  5 5 5 5 5
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        
    //      1
    //     212
    //    32123
    //   4321234
    //  543212345

        int n1=5;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            
            
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
