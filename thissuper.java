class Parent 
{
    int x = 10;
}

class Child extends Parent 
{
    int x = 100;

    void display() 
    {
        System.out.println("Value of child class: " + this.x);
        System.out.println("Value of parent class: " + super.x);
    }

    public static void thissuper(String[] args) 
    {
        Child obj = new Child();
        obj.display();
    }
}

