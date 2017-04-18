
class exp
{
    int a=10,b=0;
    exp()
    {
        int c=a/b;
    }
}
public class java022
{
    public static void main(String args[])
    {
        try{
            exp hi= new exp();
        } catch(Exception e)
        {
            System.out.println(e);
        }
    }
}