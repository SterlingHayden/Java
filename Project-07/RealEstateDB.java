import java.util.Scanner;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.Arrays;
import java.io.IOException;
    
public class RealEstateDB
{
    private RealEstate[] houses;
    private int count;
    
    public RealEstateDB()
    {
        count = 0;
        houses = new RealEstate[409];
    }
    
    public RealEstateDB(RealEstateDB param)
    {
        count = param.count;
        houses = new RealEstate[409];
        for(int i = 0; i < count ; i++)
        {
            houses[i] = param.houses[i];
        }
    }
    
    // readFile
    public void readFile() throws IOException
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scnr.next();
        
        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner fileScnr = new Scanner(fileStream);
        
        int count = 0;
        while(fileScnr.hasNext())
        {
            String address = fileScnr.nextLine();
            int price = fileScnr.nextInt();
            String str_price = fileScnr.nextLine();
            int bedrooms = fileScnr.nextInt();
            String bed_str = fileScnr.nextLine();
            double bathrooms = fileScnr.nextDouble();
            String bath_str = fileScnr.nextLine();
            int size = fileScnr.nextInt();
            String size_str = fileScnr.nextLine();
            double lot = fileScnr.nextDouble();
            String lot_str = fileScnr.nextLine();
            String blank = fileScnr.nextLine();
            
            RealEstate copy = new RealEstate (address, price, bedrooms, bathrooms,size,lot);
            houses[count] = copy;
            count++;
        }
        fileScnr.close();
        fileStream.close();
    }
    
    // searchPrice
    public void searchPrice(int lower, int upper)
    {
        int count = 293;
        int prices = 0;
        for(int i = 0; i < count; i++)
        {
            if (houses[i].getPrice() <= upper && houses[i].getPrice() >= lower)
            {
            houses[i].print();
            prices = prices + 1;
            }
        }
        if(prices == 0)
        {
            System.out.println("No houses match price range");
        }
    }
    
    // searchBedrooms
    public void searchBedrooms(int NumBed)
    {
        int count = 293;
        int bedroom = 0;
        for(int i = 0; i < count; i++)
        {
            if (houses[i].getBedRooms() == NumBed)
            {
                houses[i].print();
                bedroom++;
            }
        }
        if(bedroom == 0)
        {
        System.out.println("No houses avalibale with 0 bedrooms available");
        }
    }
    
    // searchSize
    public void searchSize(double lower, double upper)
    {
        int count = 293;
        int size = 0;
        for(int i = 0; i < count; i++)
        {
            if ((houses[i].getHouseSize() <= upper) && (houses[i].getHouseSize() >= lower))
            {
                houses[i].print();
                size = size + 1;
            }
        }
        if(size == 0)
        {
            System.out.println("No houses match square footage range.");
        }
    }
    
    // searchSimiliar
    public void searchSimiliar(RealEstate param)
    {
        double difference = 99999;
        int finder = 0;
        for(int i = 0; i < count; i ++)
        {
            difference = param.compare(houses[i]);
            finder = i;
        }
                houses[finder].print();
    }
}