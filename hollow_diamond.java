import java.util.Scanner;

public class hollow_diamond {
    public static void main(String[] args) {
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = scan.nextInt();
        for (i = 1; i < n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= i; j++) {
                System.out.print("* ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= i; j++) {
                System.out.print("* ");
            }
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}