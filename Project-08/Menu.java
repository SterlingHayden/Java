public class Menu 
{
    // Private variables
    private static int MENU_SIZE = 100;
    private Food [] menu;
    private int count;

    // Constructor
    public Menu()
    {
        count = 0;
        menu = new Food[MENU_SIZE];
    }
    
    // Add appetizer item to menu
    public void addFood(Food food)
    {
        if (count >= MENU_SIZE) return;
        menu[count] = food;
        count++;
    }

    // Order food item and get price
    public double orderFood(int item)
    {
       if ((item>0) && (item<=count))
       {
          System.out.printf("Ordering: %s for $%3.2f\n",
             menu[item-1].getName(), menu[item-1].getPrice());
          return menu[item-1].getPrice();
       }
       else
          return 0;
    }

    // Print all items on menu
    public void printMenu()
    {
        System.out.println("\t\t+-----------------------------+");
        System.out.println("\t\t| Sterling's New Restaurant Menu  |");
        System.out.println("\t\t+-----------------------------+");
        for (int index=0; index<count; index++)
        {
           System.out.println("Item: " + (index+1));
           menu[index].println();
           System.out.println();
        }
    }
}