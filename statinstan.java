import java.util.Scanner;

class statinstan 
{
    float rad;             
    static int square;       

    void calculateCircle() 
    {
        System.out.println("Area of Circle" + (3.14*rad*rad));
    }


    static void calculateSquare(int n) 
    {
        square = n * n;
        System.out.println("Area of Square: " + square);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        statinstan obj = new statinstan();

        System.out.print("Enter a number: ");
        obj.rad = sc.nextFloat();

        System.out.print("Enter another number: ");
        obj.square = sc.nextInt();


        obj.calculateCircle();

        statinstan.calculateSquare(obj.square);
    }
}
