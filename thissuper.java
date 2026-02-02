class parent 
{
    int x = 50;
}

class Child extends parent 
{
    int x = 100;

    void display() 
    {
        System.out.println("Value of child class: " + this.x);
        System.out.println("Value of parent class: " + super.x);
    }
}

public class thissuper
{
    public static void main(String[] args) 
    {
        Child obj = new Child();
        obj.display();
    }
}
