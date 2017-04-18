import java.util.Scanner;

public class java006 {
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
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element Found at Index : " + i);
                j = 1;
            }
        }
        if (j == 0) {
            System.out.println("Element Not Found");
        }
    }
}