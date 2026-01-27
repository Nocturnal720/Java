//WAP to get the number of fibonacci numbers from the user and print them
import java.util.Scanner;
public class fib 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the lenghth of the fibonacci series you want: ");
        int c = sc.nextInt();
        System.out.println("");
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        for(int i = 1; i <= c; i++)
        {
            if(i == 1 && c >= 3)
            {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
                i = 3;
                n1 = n2;
                n2 = n3;
                continue;
            }

            if(c == 1)
            {
                System.out.println(n1);
                break;
            }

            if(c == 2)
            {
                System.out.println(n1);
                System.out.println(n2);
                break;
            }

            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }   
}