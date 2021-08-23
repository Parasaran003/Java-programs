import java.util.Scanner;

public class factors_of_a_number {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        number = input.nextInt();
        input.close();
        System.out.print("Factors of " + number + " = ");
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
