/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scnr = new Scanner (System.in);
    // Input values
    
    System.out.print ("How much do you like meat on scale of 1 to 100? ");
        float meat = scnr.nextFloat ();
    System.out.print ("How much do you like vegetables on scale of 1 to 100? ");
        float vegetables = scnr.nextFloat ();
    System.out.print ("How much do you like pasta on scale of 1 to 100? ");
        float pasta = scnr.nextFloat ();
    System.out.print ("How much do you like potatoes on scale of 1 to 100? ");
        float potatoes = scnr.nextFloat ();
    System.out.print ("How much do you like chocolate on scale of 1 to 100? ");
        float chocolate = scnr.nextFloat ();
    System.out.print ("How much do you like fruit on scale of 1 to 100? ");
        float fruit = scnr.nextFloat ();
    System.out.print ("What is your budget (before tax) for this meal? ");
        float budget = scnr.nextFloat ();
    
    // breaking up the questions from the results
    System.out.println("--------------------------------------------------------------");
    
    // Appetizer
    System.out.println("APPETIZER:");
    if (budget <= 15)
        System.out.println("    Customer doesn't get an appetizer\n");
    else if (meat > 20 && meat > vegetables)
        System.out.println("    Customer will receive chicken wings.\n");
    else if (vegetables > 20 && vegetables >= meat)
        System.out.println("    Customer will receive a garden salad.");
    else
        System.out.println("    Customer will receive garlic bread.\n");
    
    // Main Course 
    System.out.println("MAIN COURSE:");
    if (budget <= 10)
        System.out.println("    Customer doesn't get an a main course.\n");
    else if (meat > 10 && meat > vegetables && potatoes >= pasta)
        System.out.println("    Customer will receive steak and baked potatos.\n");
    else if (meat > 10 && meat > vegetables && pasta > potatoes)
        System.out.println("    Customer will receive spaghetti and meat sauce.\n");
    else if (vegetables > 10 && vegetables >= meat)
        System.out.println("    Customer will receive pasta primavera.\n");
    else 
        System.out.println("    Customer will receive cheese omelet.\n");
    
    // Dessert
    System.out.println("DESSERT:");
    if (budget < 20)
        System.out.println("    Customer doesn't get dessert.\n");
    else if (chocolate > 20 && chocolate > fruit)
        System.out.println("    Customer will receive chocolate cake.\n");
    else if (fruit > 20 && fruit >= chocolate)
        System.out.println("    Customer will receive apple pie.\n");
    else 
        System.out.println("    Customer will receive vanilla ice cream.\n");
        
    // Calculations for final bill
        double taxrate = 1.07;
        double maincourse_only = 10 * taxrate;
        double maincourse_and_appetizer = 15 * taxrate;
        double three_course_meal = 20 * taxrate;
        
    // Final Bill
    System.out.println("FINAL BILL:");
    if (budget < 10)
        System.out.println("    0$\n");
    else if (budget >= 10 && budget < 15)
        System.out.println("    "+Math.round(maincourse_only*100)/100D+"$");
    else if (budget >= 15 && budget < 20)
        System.out.println("    "+Math.round(maincourse_and_appetizer*100)/100D+"$");
    else
        System.out.println("    "+Math.round(three_course_meal*100)/100D+"$");
        

}
}








