import java.util.Scanner;
public class Bestfriend
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = "text";
        while(!s.equals(""))
        {
            System.out.print("Please enter names of your best friend: ");
            s = sc.nextLine();
            System.out.println("My best friend's name is " + s + "\n");
        }
    }
}