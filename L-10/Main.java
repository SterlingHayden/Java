import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scnr = new Scanner(System.in);
        // Arrays for dates and prices
        String date[] = new String[1000];
        double price[] = new double[1000];
        int count = 0;
        
        // Read file name
        System.out.print("Enter file name: ");
        String fileName = scnr.next();

        // Create file stream and scanner
        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner fileScnr = new Scanner(fileStream);
        
        // Read and store dates and prices
        //System.out.println("Enter up to 1000 date and price values");
        //System.out.println("Hit control-D when finished");
        while (fileScnr.hasNext())
        {
            date[count] = fileScnr.next();
            price[count] = fileScnr.nextDouble();
            count++;
        }
        // Close input file
        fileStream.close();
        
        // Print date and price data
        double smallest = 10000;
        double biggest = 10000;
        int green = 0;
        int red = 0;
        for (int i=0; i<count; i++)
        {
            System.out.println(date[i] + " " + price[i]);
            // finding MIN
            if (price[i] < smallest) 
            {
                smallest = price[i]; 
            }
            // finding MAX
            if (price[i] > biggest)
            {
                biggest = price[i];
            }
            // finding number of green days
            if (price[i+1] > price[i])
            {
                green += 1;    
            }
            // finding number of red days
            if (price[i+1] < price[i])
            {
                red += 1;
            }
        }
        System.out.println("The lowest price of the year was "+ smallest);
        System.out.println("The highest price of the year was "+ biggest);
        System.out.println("The number of green days on the year was "+ green);
        System.out.println("The number of red days on the year was "+ red);
    }
}