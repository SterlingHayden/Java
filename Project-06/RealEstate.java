public class RealEstate
{
    // data fields 
    private String Address;
    private int Price;
    private int Bedrooms;
    private double Bathrooms;
    private int Size_Sqft;
    private double Size_Acres;
    
    // default constructor
    public RealEstate()
    {
        Address = "none";
        Price = 0;
        Bedrooms = 0;
        Bathrooms = 0.0;
        Size_Sqft = 0;
        Size_Acres = 0.0;
    }
    
    // initialize constructor
    public RealEstate(String address, int price, int bedrooms, double bathrooms, int size_sqft, double size_acres)
    {
        Address = address;
        Price = price;
        Bedrooms = bedrooms;
        Bathrooms = bathrooms;
        Size_Sqft = size_sqft;
        Size_Acres = size_acres;
    }
    
    
    // setting methods
    public void setAddress(String address)
    {
        Address = address.trim();
    }
    
    public void setPrice(int price)
    {
        Price = price;
        if (Price < 0)
        Price = 0;
    }
    
    public void setBedrooms(int bedrooms)
    {
        Bedrooms = bedrooms;
        if (Bedrooms < 0) 
        Bedrooms = 0;
    }
    
    public void setBathrooms(double bathrooms)
    {
        Bathrooms = bathrooms;
        if (Bathrooms < 0)
        Bathrooms = 0;
    }
    
    public void setSize_Sqft(int size_sqft)
    {
        Size_Sqft = size_sqft;
        if (Size_Sqft < 0)
        Size_Sqft = 0;
    }
    
    public void setSize_Acres(double size_acres)
    {
        Size_Acres = size_acres;
        if (Size_Acres < 0)
        Size_Acres = 0;
    }
    
    
    // getter methods
    public String getAddress()
    {
        return Address;
    }
    
    public int getPrice()
    {
        return Price;
    }
    
    public int getBedrooms()
    {
        return Bedrooms;
    }
    
    public double getBathrooms()
    {
        return Bathrooms;
    }
    
    public int getSize_Sqft()
    {
        return Size_Sqft;
    }
    
    public double getSize_Acres()
    {
        return Size_Acres;
    }
    
    // print on separate lines
    public void printsep()
    {
        System.out.printf("Address: '" + Address + "'\n");
        System.out.printf("Price: " + Price + "\n");
        System.out.printf("Bedrooms: " + Bedrooms + "\n");
        System.out.printf("Bathrooms: " + Bathrooms + "\n");
        System.out.printf("Size in Sqft: " + Size_Sqft + "\n");
        System.out.printf("Size in Acres: " + Size_Acres);
        System.out.println();
    }
    
    // print on one line
    public void printsame()
    {
        System.out.println(Address + ", " + Price + ", " + Bedrooms  + ", " + Bathrooms + ", " + Size_Sqft + 
        ", " + Size_Acres);
    }
    
    // compare method
    public int compare(RealEstate param)
    {
        int calc = 0;
        //Price
        if (Price < param.Price)
        calc += 1;
        if (Price > param.Price)
        calc += -1;
        if (Price == param.Price)
        calc += 0;
        
        //Bedrooms
        if (Bedrooms > param.Bedrooms)
        calc += 1;
        if (Bedrooms < param.Bedrooms)
        calc +=-1;
        if (Bedrooms == param.Bedrooms)
        calc += 0;
        
        //Bathrooms
        if (Bathrooms > param.Bathrooms)
        calc += 1;
        if (Bathrooms < param.Bathrooms)
        calc += -1;
        if (Bathrooms == param.Bathrooms)
        calc += 0;
        
        //Sqft
        if (Size_Sqft > param.Size_Sqft)
        calc += 1;
        if (Size_Sqft < param.Size_Sqft)
        calc += -1;
        if (Size_Sqft == param.Size_Sqft)
        calc += 0;
        
        //Acres
        if (Size_Acres > param.Size_Acres)
        calc += 1;
        if (Size_Acres < param.Size_Acres)
        calc += -1;
        if (Size_Acres == param.Size_Acres)
        calc += 0;
        
        return calc;
    }
    
    
    
    
}