class Parent 
{
    void show() 
    {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent 
{
    void show() 
    {
        System.out.println("This is Child class method");
    }

    void display() 
    {
        super.show(); 
    }

    public static void refer(String[] args) 
    {
        Child obj = new Child();
        obj.display();
    }
}
