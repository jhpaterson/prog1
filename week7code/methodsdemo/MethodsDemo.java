
public class MethodsDemo
{

    public void method1()
    {
        System.out.println("in method1 - about to call method2");
        method2();
        System.out.println("in method1 - after call to method2");
    }
    
    public void method2()
    {
        System.out.println("in method2");
    }
}
