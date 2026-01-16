import java.util.Scanner;
public class mult
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first num: ");
        int a = sc.nextInt();
        System.out.print("Please enter second num: ");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println("Ans: " + c);
    }
}