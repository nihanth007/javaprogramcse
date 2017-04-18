class This
{
    int x;
    This hi(int x)
    {
        this.x=x;
        System.out.println(this.x);
        return this;
    }
}
public class java013
{
    public static void main(String args[])
    {
        This a = new This();
        System.out.println(a.hi(10));
    }
}