import java.util.Scanner;
public class Main
{
  static void solve_quadratic (double a, double b, double c)
  {
    System.out.println ("Quadratic equation: ");
    System.out.println ("y = " + a + "x^2" + " + " + b + "x" + " + " + c);
    double discriminant = b * b - 4 * a * c;
    if ((discriminant >= 0) && (a != 0))
      {
	double root1 = (-b - Math.sqrt (discriminant)) / (2 * a);
	double root2 = (-b + Math.sqrt (discriminant)) / (2 * a);
	  System.out.println ("Root1 = " + root1);
	  System.out.println ("Root2 = " + root2);
      }
    else
      {
	System.out.println ("Sorry no roots can be calculated.");
      }

  }
  public static void main (String[]args)
  {
    // Get user input
    Scanner scnr = new Scanner (System.in);
    System.out.print ("Enter x^2 coefficient: ");
    double a = scnr.nextDouble ();
    System.out.print ("Enter x coefficient: ");
    double b = scnr.nextDouble ();
    System.out.print ("Enter constant coefficient: ");
    double c = scnr.nextDouble ();
    //for (double a = -2; a <= 2; a = a + 1)
    //for (double b = -2; b <= 2; b = b + 1)
	//for (double c = -2; c <= 2; c = c + 1)
	  //solve_quadratic (a, b, c);

    // calling function 
    solve_quadratic (a, b, c);

  }
}

