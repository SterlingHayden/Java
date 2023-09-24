public class Main
{
    // Testing the RealEstate class
    public static void main(String[] args)
    {
        System.out.println("\nTesting the RealEstate class:");
        
        RealEstate house1 = new RealEstate("2174 Riverfront Ln, Fayetteville, AR 72703",
        815000, 4, 3, 4285, 1);
        System.out.println("\nHouse information: ");
        house1.printsame();
        house1.printsep();
        
        RealEstate house2 = new RealEstate("1009 S Happy Hollow Rd, Fayetteville, AR 72701", 
        324900, 3, 1, 874, 0.31);
        System.out.println("\nHouse information: ");
        house2.printsame();
        house2.printsep();
        
        RealEstate house3 = new RealEstate("1415 W Mount Comfort Rd, Fayetteville, AR 72703", 
        350000, 3, 1.5, 1444, 0.47);
        System.out.println("\nHouse information: ");
        house3.printsame();
        house3.printsep();
        
        RealEstate house4 = new RealEstate("792 W Foothills Dr, Fayetteville, AR 72701", 
        389000, 5, 2.5, 2562, 0.29);
        System.out.println("\nHouse information: ");
        house4.printsame();
        house4.printsep();
        
        RealEstate house5 = new RealEstate("2927 E Pebblestone Dr, Fayetteville, AR 72701", 
        740000, 5, 4, 3808, 0.38);
        System.out.println("\nHouse information: ");
        house5.printsame();
        house5.printsep();
        
        RealEstate house6 = new RealEstate("3708 N Lalique Ln, Fayetteville, AR 72704", 
        455000, -4, .5, 2652, 0.26);
        System.out.println("\nHouse information: ");
        house6.printsame();
        house6.printsep();
        
        RealEstate house7 = new RealEstate("410 Jay Ave, Fayetteville, AR 72727", 
        306000, 3, 2.5, 1988, 0.46);
        System.out.println("\nHouse information: ");
        house7.printsame();
        house7.printsep();
        
        System.out.println("");
        System.out.println("House #7 scores " + house7.compare(house6) + " in comparison to House 6.");
        

    }
}