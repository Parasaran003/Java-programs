import java.util.Scanner;

class Sum_of_natural_numbers {
    public static void main(String[] args) {
        int sum = 0, num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        num = input.nextInt();
        input.close();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers = " + sum);
    }
}