class Student
{
    String name;
    double[] grades = new double[10];
    int pos = 0;
    double avg = 0;

    Student(String n)
    {
        name = n;
    }

    void addGrade(double grade)
{
    if(pos < 10)
    {
        grades[pos] = grade;
        pos++;
    }
    else
    {
        System.out.println("Grade limit reached");
    }
}

    void calcAvg()
{
    if(pos == 0)
    {
        System.out.println("No grades available");
        return;
    }

    avg = 0;
    for(int i = 0; i < pos; i++)
    {
        avg = avg + grades[i];
    }

    avg = avg / pos;
    System.out.println("Average grade: " + avg);
}

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Grades:");

        for(int i = 0; i < pos; i++)
        {
            System.out.println("Subject " + (i+1) + ": " + grades[i]);
        }

        if(pos == 0)
        {
            System.out.println("No grades added");
        }
        else
        {
            System.out.println("Average: " + avg);
        }
    }
}

class ClassMan
{
    int studs = 0;
    Student[] arr = new Student[100];

    void addStudent(Student student)
    {
        if(studs < 100)
        {
            arr[studs] = student;
            studs++;
        }
        else
        {
            System.out.println("Student limit reached");
        }
    }


    void findStudent(String name)
    {
        for(int i = 0; i < studs; i++)
        {
            if(arr[i].name.equals(name))
            {
                System.out.println("Student found");
                arr[i].display();
                return;
            }
        }

        System.out.println("Student not found");
    }


    void display()
    {
        if(studs == 0)
        {
            System.out.println("No students available");
            return;
        }

        for(int i = 0; i < studs; i++)
        {
            arr[i].display();
        }
    }
}

public class case2 {
    public static void main(String[] args) {

        ClassMan manager = new ClassMan();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");


        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(80);
        s1.calcAvg();
        manager.addStudent(s1);

        s2.addGrade(70);
        s2.addGrade(75);
        s2.addGrade(65);
        s2.calcAvg();
        manager.addStudent(s2);

        manager.display();

        manager.findStudent("Alice");
        manager.findStudent("Charlie");
    }
}

