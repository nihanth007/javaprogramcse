import java.util.Scanner;

/**
 * This is The 10th Program in the Lab Program List of 2-2.
 * Write a JAVA program to Sort an Array of Strings
 *
 * @author Nihanth Charan Mutluru
 */

public class java010 {
    public static void main(String args[]) {
        System.out.print("Enter the Number of Strings : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        int i;
        in.nextLine();
        System.out.println("Enter " + n + " Strings, Each one in each line ");
        for(i = 0; i < n; i++) {
            str[i] = in.nextLine();
        }
    }
}
