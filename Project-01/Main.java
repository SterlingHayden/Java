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
    float diameter;
        System.out.print ("Enter the diameter of the rebar in inches:");
        diameter = scnr.nextFloat ();
    float length;
        System.out.print ("Enter the length of the rebar in feet:");
        length = scnr.nextFloat ();
    float bundle;
        System.out.print ("Enter the number of rebar pieces are in a bundle:");
        bundle = scnr.nextFloat ();
    float truck;
        System.out.print ("Enter the weight limit for the truck:");
        truck = scnr.nextFloat ();
        
    // Calculate weight of each rebar
        float diameterinft = diameter / 12;
        float radius = diameterinft / 2;
        float radiussqr = radius * radius;
        float density = 490;
        
    double stick = (Math.PI * radiussqr * length) * density;
    // Calculate weight of each bundle 
    double bund = stick * bundle;
    // Calculate number of n bundles truck can carry
    double carry = truck / bund;
    
    // Print the output
      System.out.println ("Each piece of rebar weighs " + stick + " pounds.");
      System.out.println ("Each bundle of rebar weighs " + bund +
			  "pounds.");
      System.out.println ("This truck can carry " + Math.floor(carry) +
			  " bundles of rebar.");
  }
}





