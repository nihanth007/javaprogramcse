class pba
{
    int x;
}
public class java012b
{
    public static void hi(pba a)
    {
        System.out.println(a.x);
    }
    public static void main(String args[])
    {
        pba a = new pba();
        a.x=3;
        hi(a);
    }
}
