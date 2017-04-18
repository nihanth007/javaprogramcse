import java.util.Scanner;

public class java002 {
    public static void main(String args[]) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Coefficients a,b,c respectively: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = (b * b) - (4 * a * c);
        if (d != 0)
            d = d > 0 ? 1 : -1;
        switch (d) {
            case 0:
                double x = (-b / (2 * a));
                System.out.println("The Roots are Real and Equal : " + x);
                break;
            case 1:
                double d1 = Math.sqrt(d);
                double x1 = (-b + d1) / (2 * a);
                double x2 = (-b - d1) / (2 * a);
                System.out.println("The Roots are Real and Unequal : " + x1 + " and " + x2);
                break;
            case -1:
                d = -d;
                double d2 = Math.sqrt(d);
                d2 = d2 / (2 * a);
                b = -b / (2 * a);
                System.out.println("The Roots are Imaginary : " + b + "+" + d2 + "i" + " and " + b + "-" + d2 + "i");
                break;
        }
    }
}