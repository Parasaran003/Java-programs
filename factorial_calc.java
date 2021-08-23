import java.util.Scanner;

import java.util.Scanner;

public class factorial_calc {
    public static void main(String[] args) {
        int num;
        long fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        num = input.nextInt();
        input.close();
        if (num <= 0) {
            System.out.println("Factorial does not exist!");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(" Factorial = " + fact);
        }
    }
}
