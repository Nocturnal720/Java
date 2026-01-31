class OuterClass 
{
    int outerData = 100;


    class InnerClass 
    {
        void display() 
        {
            System.out.println("Outer class data: " + outerData);
        }
    }

    public static void main(String[] args) 
    {
        OuterClass outer = new OuterClass();


        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}
