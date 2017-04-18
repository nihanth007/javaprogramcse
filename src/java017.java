class mula
{
    int x=1;
}
class mulb extends mula
{
    int y=2;
}
public class java017 extends mulb
{
    int z=3;
    public static void main(String args[])
    {
        java017 hi = new java017();
        System.out.println(hi.z+"\n"+hi.y+"\n"+hi.x);
    }
}
