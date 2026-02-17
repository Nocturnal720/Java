class Product
{
    String name;
    double price;

    Product(String n, double p)
    {
        name = n;
        price = p;
    }
}

class cart
{
    int items = 0;
    Product[] shop = new Product[100]; 
    void addProduct(Product product)
    {
        if(items < 100)
        {
            shop[items] = product;
            items++;
        }
        else
        {
            System.out.println("Cart is full");
        }
    }

    void remProduct(String productName)
    {
    
    }

    void totalCost()
    {
        double cost = 0;

        for(int i = 0; i < items; i++)
        {
            cost = cost + shop[i].price;
        }

        System.out.println("Total cost: " + cost);
    }


    void display()
    {
        if(items == 0)
        {
            System.out.println("Cart is empty");
            return;
        }

        for(int i = 0; i < items; i++)
        {
            System.out.println("Product: " + shop[i].name + "\tPrice: " + shop[i].price);
        }
    }
}

public class case3 {
    public static void main(String[] args) {

        cart shop = new cart();


        Product p1 = new Product("Laptop", 50000);
        shop.addProduct(p1);
        Product p2 = new Product("Mouse", 800);
        shop.addProduct(p2);
        Product p3 = new Product("Keyboard", 1500); 
        shop.addProduct(p3);

        System.out.println("Items in Cart:");
        shop.display();

    
        shop.totalCost();
        shop.remProduct("Mouse");

    
        System.out.println("\nAfter removing Mouse:");
        shop.display();

        shop.totalCost();
    }
}
