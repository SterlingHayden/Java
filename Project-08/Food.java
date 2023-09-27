import java.util.Scanner;

public class Food 
{
    // Private variables
    public String Name;
    public String Description;
    public double Price;
    
    // Constructors
    public Food()
    {
        Name = "none";
        Description = "none";
        Price = 0;
    }
    
    public Food(String name, String desc, double price)
    {
        Name = name;
        Description = desc;
        Price = price;
    }
    
    public Food(Food item)
    {
        Name = item.Name;
        Description = item.Description;
        Price = item.Price;
    }
    
    // Setter methods
    public void setName(String name) { Name = name; }
    public void setDescription(String desc) { Description = desc; }
    public void setPrice(double price) { Price = price; }
    
    // Getter methods
    public String getName() { return Name; }
    public String getDescription() { return Description; }
    public double getPrice() { return Price; }
    
    // Read method
    public void read() 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter name: ");
        setName(scnr.nextLine());
        System.out.print("Enter description name: ");
        setDescription(scnr.nextLine());
        System.out.print("Enter price: ");
        setPrice(scnr.nextDouble());
    }
    
    // Print methods
    public String toString()
    {
        return String.format("Name: %s\nDescription: %s\nPrice: $%3.2f",
           Name, Description, Price);
    }
    public void print() { System.out.print(toString()); }
    public void println() { System.out.println(toString());
    }
    
    // Unit test method
    public static void main(String[] args) 
    {
        System.out.println("\nTesting the Food class");
        
        // Testing constructor
        Food food1 = new Food ("Hamburger", 
           "Quarter pound grilled ground beef on a warm bun", 6.99);

        // Testing print method
        System.out.println("food1:");
        food1.println();
        
        // Testing read method
        Food food2 = new Food();
        food2.read();

        // Testing toString method
        System.out.println("food2:\n" + food2.toString());
    }
}