import java.util.Scanner;

public class two_dim_arr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows:");
        int row=sc.nextInt();
        System.out.print("Enter number of column:");
        int column=sc.nextInt();
        
        int [][] arr1=new int[row][column];
        System.out.println("Enter elements in array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("array element is:");

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr1[i][j]+"   ");
            }
            System.out.println();
        }
         System.out.print("Enter number to find element:");
         int num=sc.nextInt();


        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr1[i][j]==num)
                System.out.println(num+"element found at index"+i+j);
            }
            
        }


        sc.close();

    }

    
}
