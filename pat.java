//WAP to accept a number and print its pyramid
import java.util.Scanner;
public class pat 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int num = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println();

        }
        



    }
    
}
