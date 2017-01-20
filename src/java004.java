import java.util.Scanner;

/**
 * This is The 4th Program in the Lab Program List of 2-2.
 * Write a JAVA program give example for command line arguments.
 *
 * @author Nihanth Charan Mutluru
 */

public class java004 {
    public static void main(String args[]) {
        int i;
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}