class Parent 
{
    void show() 
    {
        System.out.println("Parent class displayed");
    }
}

class Child extends Parent 
{
    void show() 
    {
        System.out.println("Child class displayed");
    }

    void display() 
    {
        super.show(); 
    }

}

public class refer
{
    public static void main(String[] args) 
    {
        Child obj = new Child();
        obj.display();
    }
}
