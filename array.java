import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] num=new int[size];
       
        System.out.println("Enter elemnets in array");

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
         
        System.out.println("Elements is");
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
          System.out.println("Enter value for  search");
        int x=sc.nextInt();

        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                System.out.println("x found at index"+i);
            }
        }
       sc.close();
         
    }
}
