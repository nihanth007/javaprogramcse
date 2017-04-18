class or
{
    void main()
    {
        System.out.println("over riding");
    }
}
public class java018
{
    static void main()//meathod over loading
    {
        System.out.println("main");
    }
    static  void main(int x)//meathod over loading
    {
        System.out.println(x);
    }
    public static void main(String args[])
    {
        or hi = new or();
        main();
        hi.main();
        main(2);
    }
}