import java.util.Scanner;

public class java010 {
    public static void main(String args[]) {
        System.out.print("Enter the Number of Strings : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        String[] sorted = new String[n];
        int i;
        in.nextLine();
        System.out.println("Enter " + n + " Strings, Each one in each line ");
        for(i = 0; i < n; i++) {
            str[i] = in.nextLine();
        }
        for(i = 0; i < n; i++) {
            sorted = str_sort(str[i], sorted, i);
        }
        System.out.println("The Sorted Arry of Strings is ");
        for(i = 0; i < n; i++) {
            System.out.println(sorted[i]);
        }
    }
    
    public static String[] str_sort(String s, String[] str, int n) {
        if(n == 0) {
            str[0] = s;
            return str;
        } else{
            int i,j,k,m,l1,l2;
            for( i = 0; i <= n; i++) {
                l1 = str[i].length();
                l2 = s.length();
                k = (l1 < l2) ? l1 : l2;
                for( j = 0; j < k; j++) {
                    if( str[i].charAt(j) > s.charAt(j) ) {
                        for( m = n ; m > i ; m--) {
                            str[m] = str[m-1];
                        }
                        str[i] = s;
                        return str;
                    }
                    else if(str[i].charAt(j) == s.charAt(j) ) {
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return str;
    }
    
}