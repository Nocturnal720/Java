import java.util.Scanner;
public class myname
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String s = sc.nextLine();
        System.out.println("My name is " + s);
    }
}