class Employee
{
    String EmpId;
    String EmpName;
    String role;
    double basesal;
    double sal;

    Employee(String id, String name, String r)
    {
        EmpId = id;
        EmpName = name;
        role = r;
    }


    void calcSal()
    {
        if(role.equals("Manager"))
        {
            sal = basesal + (0.2*basesal);
        }
        else if(role.equals("Developer"))
        {
            sal = basesal + (0.1*basesal);
        }
        else if(role.equals("Designer"))
        {
            sal = basesal + (0.05*basesal);
        }
        else if(role.equals("Intern"))
        {
            sal = 1000;
        }
        else
        {
            System.out.println("Invalid Role");
        }
    }

    void applyDeduction(double amt)
    {
        sal = sal - amt; //apply 0 balance exception
    }

    void display()
    {
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
        System.out.println("Employee salary: " + sal);
        System.out.println("--------------------------------------");
    }
}

class Payroll
{
    Employee[] arr = new Employee[1000];
    int curr = 0;
    void addEmployee(Employee emp)
    {
        arr[curr] = emp;
        curr = curr + 1;
    }

    void calcAllSal()
    {
        for(int i = 0; i < curr; i++)
        {
            arr[i].calcSal();
            arr[i].display();
        }
    }

    void find(String ID)
    {
        for(int i = 0; i < curr; i++)
        {
            if(arr[i].EmpId.equals(ID))
            {
                System.out.println("Employee Found!");
                arr[i].display();
                break;
            }
        }
    }

}

public class case5 {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        Employee e1 = new Employee("100", "Rohan", "Manager");       
        Employee e2 = new Employee("101", "Rohit", "Developer");
        Employee e3 = new Employee("102", "Reinhard", "Designer");

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);

        payroll.calcAllSal();

        e1.applyDeduction(2000);

        e1.display();

        payroll.find("102");
    }
}
