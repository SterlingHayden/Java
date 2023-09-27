import java.util.Scanner;

public class MainCourse extends Food
{
    // Private variables
    private String Veg;
    private String Gluten;
    
    // Constructors
    public MainCourse()
    {
        Veg = "none";
        Gluten = "none";
    }
    
    public MainCourse(String name, String desc, String veg, String gluten, double price)
    {
        Name = name;
        Description = desc;
        Veg = veg;
        Gluten = gluten;
        Price = price;
    }
    
    // Setter methods
    public void setName(String name) { Name = name; }
    public void setDescription(String desc) { Description = desc; }
    public void setVeg(String veg) {Veg = veg; }
    public void setGluten(String gluten) {Gluten = gluten; }
    public void setPrice(double price) { Price = price; }
    
    // Getter methods
    public String getName() { return Name; }
    public String getDescription() { return Description; }
    public String getVeg() { return Veg; }
    public String getGluten() { return Gluten; }
    public double getPrice() { return Price; }
    
    // Read method
    public void read() 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter if food is vegetarian: ");
        setVeg(scnr.nextLine());
        System.out.print("Enter if food is gluten free: ");
        setGluten(scnr.nextLine());
    }
    
    // Print methods
    public String toString()
    {
        return String.format("Name: %s\nDescription: %s\nVegetarian: %s\nGluten Free: %s\nPrice: $%3.2f",
           Name, Description, Veg, Gluten, Price);
    }
    public void print() { System.out.print(toString()); }
    public void println() { System.out.println(toString());
    }
    
    // Unit test method
    public static void main(String[] args) 
    {
        System.out.println("\nTesting the Food class");
        
        // Testing constructor
        MainCourse food1 = new MainCourse ("House Salad", 
           "Romaine, carrots, cucumber, tomatoes, red onion and crunchy croutons dressed with a delicious apple cider vinaigrette",
           "Yes", "Yes", 7.99);

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