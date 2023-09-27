import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        // Create and print menu
        Menu menu = new Menu();
        // Appetizers
        // food 1
        menu.addFood( new Appetizer("Texas Cheese Fries", "Fries topped with Shredded cheese, bacon, jalapeños, green onions. Served with house-made ranch.",
           "Hot", 4, 6.99));
        // food 2
        menu.addFood( new Appetizer("Chips n' Queso", "Roasted green chile queso infused with verde sauce.",
           "Hot", 2, 4.99));
        // food 3
        menu.addFood( new Appetizer("Fruit Platter", "Strawberries, pineapple, blackberries, grapes, and watermelon served on a wooden platter.",
           "Cold", 3, 7.99));
        // Main Courses
        // food 4
        menu.addFood( new MainCourse("House Salad", "Romaine, carrots, cucumber, tomatoes, red onion and crunchy croutons dressed with a delicious apple cider vinaigrette.",
           "Yes", "Yes", 9.99));
        // food 5
        menu.addFood( new MainCourse("Shrimp Scampi", "Sautéed shrimp, asparagus, and tomatoes, tossed with angel hair pasta in a creamy garlic sauce.",
           "No", "No", 12.99));
        // food 6
        menu.addFood( new MainCourse("Herb-Grilled Salmon", "Filet grilled to perfection and topped with garlic herb butter. Served with parmesan garlic broccoli.",
           "No", "Yes", 11.99));
        // Converted items 
        // food 7
        menu.addFood( new MainCourse("Hamburger", "Quarter pound grilled ground beef on a warm bun.",
           "No", "No", 6.99));
        // food 8
        menu.addFood( new MainCourse("Hot Dog", "100% pure beef hot dog with all the fixings.",
           "No", "No", 5.99));
        // food 9
        menu.addFood( new MainCourse("Fish Taco", "Lime marinated cod with spicy cabbage slaw.",
           "No", "No", 7.99));
        // Desserts
        // food 10
        menu.addFood( new Dessert("Tiramisu", "coffee-dipped ladyfingers with sweetened mascarpone cream and dusted with cocoa.",
            500, "No", 7.99));
        // food 11
        menu.addFood( new Dessert("Cheesecake with Strawberry Topping", "Ricotta cheesecake with a shortbread cookie crust, topped with strawberry sauce.",
            700, "No", 6.99));
        // food 12
        menu.addFood( new Dessert("Pecan Pie", "Crunchy pecans surrounded by a sweet, rich sticky filling in a flaky pie crust.",
            620, "Yes", 5.99));
        menu.printMenu();

        // Get user input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Get user input here");
        System.out.println("What item would you like: ");
        int choice = scnr.nextInt();
        double bill = 0.0;
    
        while(choice != -1)
        {
            double item = menu.orderFood(choice);
            bill = bill + item;
            choice = scnr.nextInt();    
        }
        
        // Print bill for meal
        double tax = .0875;
        double afterTax = bill * (1 + tax);
        double tip = afterTax * 0.175;
        System.out.println("Bill before tax: $" + bill);
        System.out.print("Bill after tax:  ");
        System.out.printf("$%3.2f", afterTax);
        System.out.println();
        System.out.print("Suggested Tip:   ");
        System.out.printf("$%3.2f", tip);
        System.out.println();
    }
}