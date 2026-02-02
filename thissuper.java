class Parent 
{
    int x = 10;

    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent 
{
    int x = 20;

    Child() 
    {
        super(); 
        System.out.println("Child class constructor");
    }

    void display() 
    {
        System.out.println("Value of x using this: " + this.x);
        System.out.println("Value of x using super: " + super.x);
    }

    public static void thissuper(String[] args) 
    {
        Child obj = new Child();
        obj.display();
    }
}
