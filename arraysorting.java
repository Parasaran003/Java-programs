import java.util.Scanner;

public class arraysorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        System.out.print("Enter the size of the array = ");
        n = sc.nextInt();
        int[] arr = new int[50];
        char choice;
        System.out.print("Enter the elements of the array = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the choice to be performed(Ascending Order - a,Descending Oder-d) : ");
        choice = sc.next().charAt(0);
        switch (choice) {
            case 'a': {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.print("Array Sorting in Ascending Order = ");
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i] + " , ");
                }
                break;
            }
            case 'd': {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.print("Array Sorting in Descending Order = ");
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i] + " , ");
                }
                break;
            }

        }
        sc.close();

    }
}
