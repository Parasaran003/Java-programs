import java.util.Scanner;

public class largest_num_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp = 0;
        System.out.print("Enter the size of the array = ");
        n = sc.nextInt();
        int arr[] = new int[50];
        System.out.println("Enter the elements of the array = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The Largest Number of the Array = " + arr[n - 1]);
        sc.close();
    }
}