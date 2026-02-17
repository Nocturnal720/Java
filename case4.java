class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException(String message) 
    {
        super(message);
    }
}

class Account
{
    String accNum;
    String accName;
    double balance;

    Account(String num, String name, double initbal)
    {
        accNum = num;
        accName = name;
        balance = initbal;
    }

    void deposit(double amt)
    {
        balance = balance + amt;
        System.out.println("New Balance: " + balance);

    }

    void withdraw(double amt)
    {
        try
        {
            balance = balance - amt;
            if(balance == 0)
            {
                throw new InsufficientFundsException("Insufficient balance");
            }
            else
            {
                System.out.println("Amount Withdrawn Successfully");
            }
        }
        catch(InsufficientFundsException e)
        {
            System.out.println();

        }

        @SuppressWarnings("unused")
    void transfer(Account target, double amt)
    {
        target.deposit(amt);
        withdraw(amt);
    }

    void display()
    {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + accName);
        System.out.println("Account balance: " + balance);
        System.out.println("--------------------------------------");
    }
}

class Bank
{
    Account[] arr = new Account[1000];
    int curr = 0;
    void createAcc(String accNum, String accName, double initbal)
    {
        arr[curr] = new Account(accNum, accName, initbal);
        curr = curr + 1;
    }


    void getAcc(String num)
    {
        for(int b = 0; b < curr; b++)
        {
            if(arr[b].accNum.equals(num))
            {
                arr[b].display();
            }
        }

    }

    void displayAll()
    {
        for(int b = 0; b < curr; b++)
        {
            arr[b].display();
        }
    }
}
