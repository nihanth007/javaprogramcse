class co
{
    co()
    {
        System.out.println("default constructor ");
    }
    co(int a)
    {
        System.out.println("constructor over loading ");
    }
}
public class java019
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
        co hi = new co();
        co hii=new co(1);
        main();
        main(2);
    }
}