import java.util.Scanner;

public class if_string {
    public static void main(String[] args) {
        String lang = "java", n;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word : ");
        n = scan.next();
        System.out.print("Enter the number = ");
        num = scan.nextInt();
        if (lang == n) {
            System.out.println("Both are equal!");
        } else {
            System.out.println("Both are not equal!");
        }
        if (num > 5) {
            System.out.println("Number is greater than five!");
        } else {
            System.out.println("Number is less than five!");
        }
    }
}