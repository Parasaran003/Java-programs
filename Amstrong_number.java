import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        int num, orgnum, result = 0, remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit number = ");
        num = input.nextInt();
        input.close();
        orgnum = num;
        while (orgnum != 0) {
            remainder = orgnum % 10;
            result += remainder * remainder * remainder;
            orgnum /= 10;
        }
        if (result == num) {
            System.out.print(num + " is an amstrong number ");
        } else {
            System.out.print(num + " is not an amstrong number ");
        }
    }
}