import java.util.Scanner;

/**
 * This is The 8th Program in the Lab Program List of 2-2.
 * Write a JAVA program to determine the addition of two matrices
 *
 * @author Nihanth Charan Mutluru
 */

public class java008 {
    public static void main(String args[]) {
        int r1, r2, c1, c2, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in Matrix 1 :");
        r1 = in.nextInt();
        System.out.println("Enter number of colomns in Matrix 1 :");
        c1 = in.nextInt();
        System.out.println("Enter number of rows in Matrix 2 :");
        r2 = in.nextInt();
        System.out.println("Enter number of colomns in Matrix 2 :");
        c2 = in.nextInt();
        if (r1 == r2 && c1 == c2) {
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] c = new int[r2][c2];
            System.out.println("Enter elements of Matrix 1:");
            for (i = 0; i < r1; i++)
                for (j = 0; j < c1; j++)
                    a[i][j] = in.nextInt();
            System.out.println("Enter elements of Matrix 2:");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    b[i][j] = in.nextInt();
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("The Addition of the Two Matrices is :");
            for (i = 0; i < r2; i++) {
                System.out.println("");
                for (j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }

            }
        } else {
            System.out.println("Array Addition is not possible as the sizes are different");
        }
    }
}