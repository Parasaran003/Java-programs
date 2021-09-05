import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        int i, j, k, row, col;
        int row1, col1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows of first matrix = ");
        row = scan.nextInt();
        System.out.print("Enter the number of columns of first matrix = ");
        col = scan.nextInt();
        System.out.print("Enter the number of rows of second matrix = ");
        row1 = scan.nextInt();
        System.out.print("Enter the number of columns of second matrix = ");
        col1 = scan.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row1][col1];
        int[][] res = new int[row][col1];
        System.out.println("Matrix A");
        System.out.println("Enter the elements of the first matrix = ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix B");
        System.out.println("Enter the elements of the second matrix = ");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("Multiplication of two matrix = ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col1; j++) {
                for (k = 0; k < col; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
