import java.util.Scanner;

public class calculator_using_func {
    public static int calculateSum(int a,int b){
        return a+b;
    }

    public static int calculateSub(int a,int b){
        return a-b;
    } 

    public static int calculateProduct(int a, int b){
        return a*b;
    }

    public static int calculateDivide(int a, int b){
        return a/b;
    }

    public static int calculateRemainder(int a, int b){
        return a%b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("select operator= +, -, *, /, % =");
        char operator=sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("addition is:"+calculateSum(a, b));
                
                break;
            case '-': System.out.println("subtarction is:"+calculateSub(a, b));  
                break;
             
                case '*': System.out.println("Mul is:"+calculateProduct(a, b));
                break;
            case '/': System.out.println("divide is:"+calculateDivide(a, b)); 
              break;
              case '%': System.out.println("remainder is:"+calculateRemainder(a, b));   
              break;
        
            default: System.out.println("enter  wrong value");
                break;
        }


        sc.close();
    }
    
}
