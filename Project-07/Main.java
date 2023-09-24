import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
import java.io.IOException;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        RealEstateDB database = new RealEstateDB();
        database.readFile();
        
        //user prompt
        System.out.println("\n");
        System.out.println("Select how you want to search for a home:");
        System.out.println("-Enter P for search by price");
        System.out.println("-Enter S for search by houses size");
        System.out.println("-Enter B for search by number of bedrooms");
        System.out.println("-Enter H for search by similiar homes");
    
        Scanner scnr_1 = new Scanner(System.in);
        Scanner scnr_2 = new Scanner(System.in);
        Scanner scnr_3 = new Scanner(System.in);
        Scanner scnr_4 = new Scanner(System.in);
        Scanner scnr_5 = new Scanner(System.in);
        char select = scnr_3.nextLine().charAt(0);
    
        if(select == 'p' || select == 'P')
        {
            System.out.println("Enter the lowest price you're willing to pay for a house");
            int lower = scnr_1.nextInt();
            System.out.println("Enter the higest price you're willing to pay for a house");
            int upper = scnr_2.nextInt();
            System.out.println("Search Results: ");
            database.searchPrice(lower, upper);
        }
        
        if(select == 's' || select == 'S')
        {
            System.out.println("In sqft enter the lower bound for the houses size");
            int lower = scnr_1.nextInt();
            System.out.println("In sqft enter the upper bound for the houses size");
            int upper = scnr_2.nextInt();
            System.out.println("Search Results: ");
            database.searchSize(lower, upper);
        }
    
        if(select == 'b' || select == 'B')
        {
            System.out.println("Enter the number of bedrooms you want for your house");
            int low = scnr_1.nextInt();
            
            System.out.println("Search Results: ");
            database.searchBedrooms(low);
        }
    
        if(select == 'h' || select == 'H')
        {
            System.out.println("Enter the home price to be compared");
            int compare_price = scnr_1.nextInt();
            
            System.out.println("Enter the homes square footage to be compared");
            int compare_size = scnr_1.nextInt();
            
            System.out.println("Enter the number of bedrooms in the house to be compared");
            int compare_beds = scnr_2.nextInt();
            
            System.out.println("Enter the number of bathrooms in the house to be compared");
            double compare_baths = scnr_1.nextDouble();
            
            System.out.println("Enter the homes acreage to be compared");
            int compare_lot = scnr_1.nextInt();
            
            RealEstate compare_homes = new RealEstate("", compare_price, compare_beds,compare_baths, compare_size, compare_lot);
            
            System.out.println("Matches:");
            database.searchSimiliar(compare_homes);
    
        }
    
    }
}
