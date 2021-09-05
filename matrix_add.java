import java.util.Scanner;

public class matrix_add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, row, col;
        System.out.print("Enter the number of rows of the matrix = ");
        row = scan.nextInt();
        System.out.print("Enter the number of columns of the matrix = ");
        col = scan.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] res = new int[row][col];
        int[][] sub = new int[row][col];
        System.out.println("Matrix A");
        System.out.println("Enter the elements of the first matrix A = ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix B");
        System.out.println("Enter the elements of the second matrix B = ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Sum of the two matrix = ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Subtraction of the two matrix = ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(sub[i][j] + "  ");
            }
            System.out.println();
        }
    }
}