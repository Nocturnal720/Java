import java.util.Scanner;

class WrapperDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        
        Float floatObj = Float.valueOf(f);
        int intValue = floatObj.intValue();

        System.out.println("Integer value: " + intValue);
    }

}
