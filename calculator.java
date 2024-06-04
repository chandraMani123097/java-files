import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner symbol= new Scanner(System.in);
       
        System.out.println("enter two number");

        int num1=symbol.nextInt();
        int num2=symbol.nextInt();
        int res;

        System.out.println("Select any symbol:+,-,*,/");
        char operator = symbol.next().charAt(0);
       
        switch (operator) {
            case'+': res= num1 + num2;
            System.out.println(res);
                
                break;
            case '-' :   res= num1-num2;
            System.out.println(res);
            break;

            case '*': res= num1*num2;
            System.out.println(res);
            break;
            case '/': res=num1/num2;
            System.out.println(res);
            break;
        
            default: System.out.println("Enter wrong symbol");
                
        }
        symbol.close();


    }
}
