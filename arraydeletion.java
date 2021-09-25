import java.util.Scanner;

public class arraydeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array = ");
        n = sc.nextInt();
        int[] arr = new int[50];
        int position;
        System.out.println("Enter the elements of the array = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position of the element to be deleted = ");
        position = sc.nextInt();
        for (int i = position; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("The New Array After Deletion = ");
        System.out.print("{");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("}");
        sc.close();
    }
}
