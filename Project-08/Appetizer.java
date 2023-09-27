import java.util.Scanner;

public class Appetizer extends Food
{
    // Private variables
    private String HotCold;
    private int Portions;
    
    // Constructors
    public Appetizer()
    {
        HotCold = "none";
        Portions = 0;
    }
    
    public Appetizer(String name, String desc, String hotcold, int portions, double price)
    {
        Name = name;
        Description = desc;
        HotCold = hotcold;
        Portions = portions;
        Price = price;
    }
    
    // Setter methods
    public void setName(String name) { Name = name; }
    public void setDescription(String desc) { Description = desc; }
    public void setHotCold(String hotcold) {HotCold = hotcold; }
    public void setPortions(int portions) {Portions = portions; }
    public void setPrice(double price) { Price = price; }
    
    // Getter methods
    public String getName() { return Name; }
    public String getDescription() { return Description; }
    public String getHotCold() { return HotCold; }
    public int getPortions() { return Portions; }
    public double getPrice() { return Price; }
    
    // Read method
    public void read() 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter if food is hot or cold: ");
        setHotCold(scnr.nextLine());
        System.out.print("Enter number of portions: ");
        setPortions(scnr.nextInt());
    }
    
    // Print methods
    public String toString()
    {
        return String.format("Name: %s\nDescription: %s\nHot/Cold: %s\nPortions: %s\nPrice: $%3.2f",
           Name, Description, HotCold, Portions, Price);
    }
    public void print() { System.out.print(toString()); }
    public void println() { System.out.println(toString());
    }
    
    // Unit test method
    public static void main(String[] args) 
    {
        System.out.println("\nTesting the Food class");
        
        // Testing constructor
        Appetizer food1 = new Appetizer ("Texas Cheese Fries", 
           "Fries topped with Shredded cheese, bacon, jalapeños, green onions. Served with house-made ranch",
           "Hot", 3, 6.99);

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