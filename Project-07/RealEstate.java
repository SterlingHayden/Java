public class RealEstate
{
    // Private variables
    private String address;
    private int price;
    private int bedRooms;
    private double bathRooms;
    private int houseSize;
    private double lotSize;
    
    // Constructors
    public RealEstate()
    {
        address = "";
        price = 0;
        bedRooms = 0;
        bathRooms = 0;
        houseSize = 0;
        lotSize = 0;
    }
    
    public RealEstate(String address, int price, int bedRooms, 
        double bathRooms, int houseSize, double lotSize)
    {
        this.address = address;
        this.price = price;
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;
        this.houseSize = houseSize;
        this.lotSize = lotSize;
    }
    
    public RealEstate(RealEstate param)
    {
        address = param.address;
        price = param.price;
        bedRooms = param.bedRooms;
        bathRooms = param.bathRooms;
        houseSize = param.houseSize;
        lotSize = param.lotSize;
    }
    
    // Setter methods
    public void setAddress(String param) { address = param; }
    public void setPrice(int param) { price = param; } 
    public void setBedRooms(int param) { bedRooms = param; }
    public void setBathRooms(double param) { bathRooms = param; }
    public void setHouseSize(int param) { houseSize = param; }
    public void setLotSize(double param) { lotSize = param; }
    
    // Getter methods
    public String getAddress() { return address; }
    public int getPrice() { return price; }
    public int getBedRooms() { return bedRooms; }
    public double getBathRooms() { return bathRooms; }
    public int getHouseSize() { return houseSize; }
    public double getLotSize() { return lotSize; }
    
    // Print method
    public void print()
    {
        System.out.println("Address:    " + address);
        System.out.println("Price:      " + price);
        System.out.println("Bed Rooms:  " + bedRooms);
        System.out.println("Bath Rooms: " + bathRooms);
        System.out.println("House Size: " + houseSize);
        System.out.println("Lot Size:   " + lotSize);
    }
    
    // Compare method
    public double compare(RealEstate param)
    {
       double bedWeight = 30000;
       double bathWeight = 10000;
       double houseWeight = 100;
       double lotWeight = 50000;
       return (bedRooms - param.bedRooms) * bedWeight + 
              (bathRooms - param.bathRooms) * bathWeight + 
              (houseSize - param.houseSize) * houseWeight + 
              (lotSize - param.lotSize) * lotWeight;
    }

    // Testing the RealEstate class
    public static void main(String[] args)
    {
        System.out.println("\nhouse1 information");
        RealEstate house1 = new RealEstate();
        house1.setAddress("2174 Riverfront Ln, Fayetteville, AR 72703");
        house1.setPrice(815000);
        house1.setBedRooms(4);
        house1.setBathRooms(3);
        house1.setHouseSize(4285);
        house1.setLotSize(1.00);
        house1.print();
        
        System.out.println("\nhouse2 information");
        RealEstate house2 = new RealEstate(
           "1009 S Happy Hollow Rd, Fayetteville, AR 72701",
           324900, 3, 1, 874, 0.31);
        house2.print();
        
        System.out.println("\nhouse3 information");
        RealEstate house3 = new RealEstate(
           "2927 E Pebblestone Dr, Fayetteville, AR 72701",
           740000, 5, 4, 3808, 0.38);
        house3.print();

        // Compare houses
        System.out.println("\nhouse1.compare(house2) = " +
           house1.compare(house2));
        System.out.println("\nhouse1.compare(house3) = " +
           house1.compare(house3));
        System.out.println("\nhouse2.compare(house3) = " +
           house2.compare(house3));
    }
}