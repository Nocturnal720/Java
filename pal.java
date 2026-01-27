//WAP to check if a word is a palindrome or not
import java.util.Scanner;
public class pal 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word you want to check: ");
        String word = sc.nextLine();
        int l = word.length();
        String rev = "";
        for(int i = l-1; i >= 0; i--)       
        {
            rev = rev + word.charAt(i);
        }
        if(rev.equals(word))
        {
            System.out.println(word + " is a palindrome");
        }
        else
        {
            System.out.println(word + " is not a palindrome");
        }
    }
}
    

