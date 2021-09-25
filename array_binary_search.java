import java.util.Scanner;

public class array_binary_search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array = ");
        n = scan.nextInt();
        int low = 0, high = n - 1, key, mid, flag = 0;
        mid = (low + high) / 2;
        int[] arr = new int[50];
        System.out.println("Enter the elements of the array = ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the element to be searched in the array = ");
        key = scan.nextInt();
        for (int i = low; i <= high; i++) {
            if (key < arr[i]) {
                high = mid - 1;
            }
            if (key > arr[i]) {
                low = mid + 1;
            }
            if (key == arr[i]) {
                low = mid;
            }
        }
        for (int i = low; i <= high; i++) {
            if (key == arr[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Value is Found!");
        } else {
            System.out.println("Value is Not Found!");
        }
        scan.close();
    }
}