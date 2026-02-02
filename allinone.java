import java.util.Scanner;
final class empdata
{
        String name = "Rohan Seiman";
        final String PRN = "24070122158";
        String Div = "CSB3";

        final void display()
        {
            System.out.println("Name: " + name);
            System.out.println("Div: " + Div);
            System.out.println("PRN: " + PRN);
        }

        void changing(String namechange, String divchange)
        {
            
            name = namechange;
            Div = divchange;
        }
    
}

public class allinone
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        empdata obj = new empdata();
        int i = 0;
        int ch;
        while(i == 0)
        {
            System.out.println("1. Display");
            System.out.println("2. Change ");
            System.out.print("Pls enter option: ");
            ch = sc.nextInt();
            sc.nextLine();

            if(ch == 1)
            {
                obj.display();
            }

            else if(ch == 2)
            {
                System.out.println("Note PRN cannot be changed. Pls enter new name and new division");
                String name, div;
                System.out.println("New Name: ");
                name = sc.nextLine();
                System.out.println("\nNew Div: ");
                div = sc.nextLine();
                obj.changing(name, div);
            }

            else
            {
                i = 1;
            }
            
        }
        
    }
}