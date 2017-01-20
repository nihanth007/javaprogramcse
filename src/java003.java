import java.util.Scanner;

/**
 * This is The 3rd Program in the Lab Program List of 2-2.
 * Write a JAVA program to display the Fibonacci sequence
 *
 * @author Nihanth Charan Mutluru
 */
public class java003 {
    public static void main(String args[]) {
        int a = 0, b = 1, c, n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms to print : ");
        n = in.nextInt();
        if (n == 1) {
            System.out.print("0 ");
        } else if (n == 2) {
            System.out.print("0 1 ");
        } else if (n > 2) {
            System.out.print("0 1 ");
            c = a + b;
            while (n > 2) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a + b;
                n--;
            }
        } else
            System.out.println("Enter a valid Number");
    }
}
