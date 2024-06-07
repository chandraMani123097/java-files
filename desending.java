import java.util.Scanner;

public class desending {

    //function for print arrays
    public static void bubbleShortAsc(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"  ");
        }
    }
   
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter size of array\t");
        int size=sc.nextInt();
        int[] arr1=new int[size];

        System.out.println("Enter elements in array");

        //enter elements in array
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
          
        System.out.print("Array element is:  ");
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }


        System.out.println("\nArray descending order :");

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]<arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }

        
        bubbleShortAsc(arr1);

        sc.close();





    }
}
