import java.util.Scanner;

public class Dessert extends Food
{
    // Private variables
    private int Calories;
    private String Nuts;

    // Constructors
    public Dessert()
    {
        Calories = 0;
        Nuts = "none";
    }
    
    public Dessert(String name, String desc, int calories, String nuts, double price)
    {
        Name = name;
        Description = desc;
        Calories = calories;
        Nuts = nuts;
        Price = price;
    }
    
    // Setter methods
    public void setName(String name) { Name = name; }
    public void setDescription(String desc) { Description = desc; }
    public void setCalories(int calories) {Calories = calories; }
    public void setNuts(String nuts) {Nuts = nuts; }
    public void setPrice(double price) { Price = price; }
    
    // Getter methods
    public String getName() { return Name; }
    public String getDescription() { return Description; }
    public int getCalories() { return Calories; }
    public String getNuts() { return Nuts; }
    public double getPrice() { return Price; }
    
    // Read method
    public void read() 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of calories in this food: ");
        setCalories(scnr.nextInt());
        System.out.print("Enter if this food contians nuts: ");
        setNuts(scnr.nextLine());
    }
    
    // Print methods
    public String toString()
    {
        return String.format("Name: %s\nDescription: %s\nCalories: %s\nContains Nuts: %s\nPrice: $%3.2f",
           Name, Description, Calories, Nuts, Price);
    }
    public void print() { System.out.print(toString()); }
    public void println() { System.out.println(toString());
    }
}