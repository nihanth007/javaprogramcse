import java.util.Scanner;

public class java005 {
    public static void main(String args[]) {
        System.out.print("Enter the Number of Elements : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j, k;
        int[] arr = new int[n];
        System.out.println("Enter the Integers : ");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.println("The Array after Sorting is ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}