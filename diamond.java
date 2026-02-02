interface A 
{
    void show();
}


interface B extends A 
{
    default void show() 
    {
        System.out.println("Show from interface B");
    }
}


interface C extends A 
{
    default void show() 
    {
        System.out.println("Show from interface C");
    }
}


class D implements B,C
{
    public void show() 
    {
        B.super.show();
    }
}


public class diamond 
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.show();
    }
}
