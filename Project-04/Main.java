import java.util.Scanner;
public class Main
{
    //                          calculating individual volumes 
    // semi sphere
    static double volume_semi_sphere (double W2)
    {
        double r = W2 / 2;
        double sphere = (((4 * Math.PI * Math.pow(r, 3)) / 3) / 2);
        //System.out.println("The volume of the semi sphere is " + sphere);
        return sphere; 
    }
    // cylinder
    static double volume_cylinder (double H2, double W2)
    {
        double r = W2 / 2;
        double cylinder = (Math.PI * H2 * Math.pow(r, 2));
        //System.out.println("The volume of the cylinder is " + cylinder);
        return cylinder;
    }
    // cone
    static double volume_cone (double H1, double W1)
    {
        double r = W1 / 2;
        double cone = ((Math.PI * H1 * Math.pow(r, 2)) / 3);
        //System.out.println("The volume of the cone is " + cone);
        return cone;
    }
    
    //                          calculating total volume 
    // top volume 
    static double top_volume (double H1, double H2, double W1, double W2)
    {
        double p1 = volume_semi_sphere(W2);
        double p2 = volume_cylinder(H2, W2);
        double p3 = volume_cone(H1, W1);
        double total_volume = p1 + p2 + p3;
        System.out.println("The total volume of the top is " + total_volume +  " cubic inches.");
        if ((p3 < p1) || (p3 < p2))
        {
            System.out.println("Error! Heavy handle, may not work properly!");
        }
        return total_volume;
    }
    
    // calculating metal mass
    static double metal_mass (double total_volume, char name)
    {
        double PoundsCubicinches = 0;
        if (name == 'A'){
            PoundsCubicinches = 0.0975; 
        }
        if (name == 'C'){
            PoundsCubicinches = 0.321;
        }
        if (name == 'I'){
            PoundsCubicinches = 0.26;
        }
        if (name == 'S'){
            PoundsCubicinches = 0.2833;
        }
        if (name == 'T'){
            PoundsCubicinches = 0.264;
        }
        double mass = PoundsCubicinches * total_volume;
        return mass; 
    }
    
    
    public static void main (String[]args)
    {
    Scanner scnr = new Scanner (System.in);
        
    // Input values with error checking  
    System.out.print("Enter the dimensions of H1 (in inches): ");
    double H1 = scnr.nextDouble ();
    while (H1 <= 0)
        {
            System.out.println("Error: H1 must be a positive inches.");
            H1 = 0;
            break;
        }
    System.out.print("Enter the dimensions of H2 (in inches): ");
    double H2 = scnr.nextDouble ();
    while (H2 <= 0)
        {
            System.out.println("Error: H2 must be a positive value.");
            H2 = 0;
            break;
        }
    System.out.print("Enter the dimensions of W1 (in inches): ");
    double W1 = scnr.nextDouble ();
    while (W1 <= 0)
        {
            System.out.println("Error: W1 must be a positive value.");
            W1 = 0;
            break;
        }
    System.out.print("Enter the dimensions of W2 (in inches): ");
    double W2 = scnr.nextDouble ();
    while (W2 <= 0)
        {
            System.out.println("Error: W2 must be a positive value.");
            W2 = 0;
            break;
        }
    // metal type input 
    System.out.println("Select from metals bellow:");
    System.out.println("A for aluminum");
    System.out.println("C for copper");
    System.out.println("I for iron");
    System.out.println("S for steel");
    System.out.println("T for tin");
    System.out.print("Metal selection: ");
    char name = scnr.next ().charAt (0);
    //error checking
    while (name != 'A' && name != 'C' && name != 'I' && name != 'S' && name != 'T' )
    {
	   System.out.print ("Invalid selection, ensure capitalization: ");
	        name = scnr.next ().charAt (0);
    }
            
    // Calling functions 
    double sphere = volume_semi_sphere(W2);
    double cylinder = volume_cylinder(H2, W2);
    double cone = volume_cone(H1, W1);
    System.out.println("The volume of the semi sphere is " + sphere +  " cubic inches.");
    System.out.println("The volume of the cylinder is " + cylinder +  " cubic inches.");
    System.out.println("The volume of the cone is " + cone +  " cubic inches.");
    double total_volume = top_volume(H1, H2, W1, W2);
    double mass = metal_mass (total_volume, name);
    System.out.println("The mass of the toy is " + mass + " pounds.");
    }
}






