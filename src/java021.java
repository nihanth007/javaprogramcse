
public class java021
{
    static   int i=-1;
    public static void main(String args[])
    {
        try{
            int a[]=new int[i];
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}