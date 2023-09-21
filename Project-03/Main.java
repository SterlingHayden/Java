import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main (String[]args)
    {
        Scanner scnr = new Scanner (System.in);
        
        // Input value for workers hired
        System.out.print("1 to 5 crew members is required to dig; how many crew members will you hire? ");
        float crew = scnr.nextFloat ();
        
            // error checking
            while ((crew < 1) || (crew > 5))
            {
                System.out.print("Error: Enter value between 1 and 5: ");
                crew = scnr.nextFloat ();
            }
        
        // input value for hourly wage 
        System.out.print("Minimum wage is $11.5; what is the wage you will pay your crew? ");
        float wage = scnr.nextFloat ();
        
            //error checking
            while ((wage < 11.5) || (wage > 50))
            {
                System.out.print("Error: Enter value between 11.5 and 50: ");
                wage = scnr.nextFloat (); 
            }
        
    // Beautify the output 
    System.out.println("--------------------------------------------------------------------------");
    System.out.printf("\n%14s %18s %13s %13s\n", "Hours Worked  ", "Cartridges Found  ", "Sales Price  ", "Net Profit  ");
        
    // iterate over a year
    for(int i = 1; i <= 52; i++)
    {
        // Get random # from 0 to 1
        Random rand = new Random();
        int rand_int = rand.nextInt(2);
        
        // Cool or hot week
        float workweek;
        if (rand_int == 0)
           workweek = 30;
        else 
            workweek = 20;
        
        // How many cartridges do we find every hour
        float luck = rand.nextInt(6);
        luck = luck + 1;
        
        // How many cartridges do we find in the week
        float found;
        found = crew * workweek * luck;
        
        // Sales price per cartridge
        float salesprice;
        if (found <= 99)
            salesprice = 10;
        else if (found > 99 && found <= 199)
            salesprice = (20-(found/10));
        else 
            salesprice = 1;
        
        // Net profit
        float cost;
        float income;
        float margin;
        float total = 0;
        cost = crew * workweek * wage;
        income = salesprice * found;
        margin = income - cost;
        total += margin;
        
    // formated prints
    System.out.printf("%4f %11.2f %17.2f %15.2f\n", workweek, found, salesprice, total);
    }
    scnr.close();
    }
}












