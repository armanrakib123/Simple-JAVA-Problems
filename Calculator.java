import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);

        System.out.print("Inter First Number = ");
        Double Num1 = Input.nextDouble();

        System.out.print("Inter Operator( + - * / ) = ");
        char operator = Input.next().charAt(0);

        System.out.print("Inter Second Number = ");
        Double Num2 = Input.nextDouble();

        double result;

        switch (operator){
            case '+':
                result = Num1+Num2;
                break;
            case '-':
                result = Num1-Num2;
                break;
            case '*':
                result = Num1*Num2;
                break;
            case '/':
                if(Num2 == 0){
                    System.out.println("Error: Division by Zero");
                    return;
                }
                result = Num1/Num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;

        }

        System.out.println("Result = "+ result);
        Input.close();

    }
}