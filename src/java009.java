import java.util.Scanner;

public class java009 {
    public static void main(String args[]) {
        int r1, r2, c1, c2, i, j, k, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Rows in Matrix 1 :");
        r1 = in.nextInt();
        System.out.println("Enter number of Columns in Matrix 1 :");
        c1 = in.nextInt();
        System.out.println("Enter number of Rows in Matrix 2 :");
        r2 = in.nextInt();
        System.out.println("Enter number of Columns in Matrix 2 :");
        c2 = in.nextInt();
        if (c1 == r1) {
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] c = new int[r1][c2];
            System.out.println("Enter elements of Matrix 1:");
            for (i = 0; i < r1; i++)
                for (j = 0; j < c1; j++)
                    a[i][j] = in.nextInt();
            System.out.println("Enter elements of Matrix 2:");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    b[i][j] = in.nextInt();
                }
            }
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    for (k = 0; k < r2; k++) {
                        sum = sum + a[i][k] * b[k][j];
                    }

                    c[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("The Multiplication of the Two Matrices is :");
            for (i = 0; i < r1; i++) {
                System.out.println("");
                for (j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }

            }
        } else {
            System.out.println("Matrix Multiplication for the given Sizes");
        }
    }
}