import java.util.Scanner;

public class bubble {

    public static void bubbleShort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Eneter size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.print("Enter element in array:\t");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of array is: ");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }





        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("\nsorted array in asec order:");

        bubbleShort(arr);

        sc.close();
    }
}
