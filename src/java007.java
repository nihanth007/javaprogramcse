import java.util.Scanner;

public class java007 {
    public static void main(String args[]) {
        System.out.print("Enter the Number of Elements : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j = 0;
        int[] arr = new int[n];
        System.out.println("Enter the Integers : ");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the Element to search : ");
        int x = in.nextInt();
        int mid;
        int a = 0, b = n - 1;
        while (a < b) {
            mid = (a + b) / 2;
            if (arr[mid] == x) {
                System.out.println("Element Found");
                a = b;
                j = 1;
            } else if (arr[mid] < x) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }
        if (j == 0) {
            System.out.println("Element Not Found");
        }
    }
}