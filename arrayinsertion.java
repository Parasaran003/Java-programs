import java.util.Scanner;

public class arrayinsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array = ");
        n = sc.nextInt();
        int arr[] = new int[50];
        int position, element;
        System.out.println("Enter the elements of the array = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the poistion to which the element to be inserted = ");
        position = sc.nextInt();
        System.out.print("Enter the element to inserted = ");
        element = sc.nextInt();
        for (int i = n - 1; i >= position; i--) {
            arr[i + 1] = arr[i];// left value will be assigned to right arr[4] = arr[3]
        }
        arr[position] = element;
        System.out.print("The New Array After Insertion = ");
        for (int i = 0; i <= n; i++) {
            System.out.println(" { " + arr[i] + " , " + " } ");
        }
        sc.close();
    }
}