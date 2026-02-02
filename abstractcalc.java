class operation extends Calculator 
{
    int ch;
    float num1, num2;

    operation(int choice, float a, float b) 
    {
        ch = choice;
        num1 = a;
        num2 = b;
    }

    operation(float a, float b) 
    {
        ch = 1;
        num1 = a;
        num2 = b;
    }


    float add(float a, float b) 
    {
        return a + b;
    }

    float sub(float a, float b) 
    {
        return a - b;
    }

    float mult(float a, float b) 
    {
        return a * b;
    }

    float div(float a, float b) 
    {
        if (b == 0) 
        {
            System.out.println("Divide by 0 error");
            return 0;
        }
        return a / b;
    }

    float calc() 
    {
        switch (ch) 
        {
            case 1: return add(num1, num2);
            case 2: return sub(num1, num2);
            case 3: return mult(num1, num2);
            case 4: return div(num1, num2);
            default: return 0;
        }
    }
}

public class abstractcalc 
{
    public static void main(String[] args) 
    {
        operation op = new operation(4, 10, 5);
        System.out.println(op.calc());
    }
}
