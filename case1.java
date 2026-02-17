class Book
{
    String title;
    String author;
    String ISBN;
}

class Lib
{
    String[] arr = new String[100];
    String[] auth = new String[100];
    String[] ISBN = new String[100];
    int pos = 0;

    void addBook(Book book)
{
    if(pos < 100)
    {
        arr[pos] = book.title;
        auth[pos] = book.author;
        ISBN[pos] = book.ISBN;
        pos++;
    }

    else
    {
        System.out.println("Library is full!");
    }
}

   void searchByTitle(String title)
{
    int flag = 0;

    for(int i = 0; i < pos; i++)
    {
        if(arr[i] != null && arr[i].equals(title))
        {
            System.out.println("Book Found!");
            System.out.println("Title: " + arr[i]);
            System.out.println("Author: " + auth[i]);
            System.out.println("ISBN: " + ISBN[i]);
            flag = 1;
            break;
        }
    }

    if(flag == 0)
    {
        System.out.println("Book not found");
    }
}

    void display()
    {
        if(pos == 0)
        {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Title        Author        ISBN");

        for(int i = 0; i < pos; i++)
        {
            System.out.println(arr[i] + "        " + auth[i] + "        " + ISBN[i]);
        }
    }
}

public class case1 {
    public static void main(String[] args) {

        Lib library = new Lib();

        Book b1 = new Book();
        b1.title = "Red Pyramid";
        b1.author = "Rick Riordan";
        b1.ISBN = "1";
        library.addBook(b1);

        Book b2 = new Book();
        b2.title = "harry Potter";
        b2.author = "JK Rowling";
        b2.ISBN = "2";
        library.addBook(b2);


        library.display();


        library.searchByTitle("Red Pyramid");
        library.searchByTitle("Amulet");
    }
}
