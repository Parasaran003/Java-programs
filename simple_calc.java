import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {
        char operator;
        double a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Selection the operation(Addition=+,Subtraction=-,Multiplication=*,Division=/,Modulus=%)");
        operator = input.next().charAt(0);
        System.out.print("Enter the value of a and b = ");
        a = input.nextDouble();
        b = input.nextDouble();
        switch (operator) {
            case '+': {
                result = a + b;
                System.out.println("Addition of the numbers = " + result);
                break;
            }
            case '-': {
                result = a - b;
                System.out.println("Subtraction of the numbers = " + result);
                break;
            }
            case '*': {
                result = a * b;
                System.out.println("Multiplication of the numbers = " + result);
                break;
            }
            case '/': {
                result = a / b;
                System.out.println("Division of the numbers = " + result);
                break;
            }
            case '%': {
                result = a % b;
                System.out.println("Modulus of the numbers = " + result);
                break;
            }
            default: {
                System.out.println("Invalid operator!");
                break;
            }
        }
    }
}
