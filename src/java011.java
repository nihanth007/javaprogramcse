
import java.util.*;
public class java011
{
    public static void main(String args[])
    {
        System.out.println("enter the text to check weather a string is palindrome or not");
        Scanner hi = new Scanner(System.in);
        String s=hi.next();
        int x=0, n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                System.out.println("entered string is not a palindrome");
                x=1;
                break;
            }
        }
        if(x==0)
        {
            System.out.println("entered string is  a palindrome");
        }
    }
}