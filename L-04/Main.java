import java.util.Scanner;
public class Main
{
  static char GetConcert ()
  {
    // Print menu
    System.out.println ("The following concerts are available:");
    System.out.println (" B for Beyonce");
    System.out.println (" L for Lady Gaga");
    System.out.println (" T for Taylor Swift");
    System.out.println ("Enter the concert you want:");

    // Read user input
    Scanner scnr = new Scanner (System.in);
    char Concert = scnr.nextLine ().charAt (0);
    while (Concert != 'B' && Concert != 'L' && Concert != 'T')
      {
	System.out.println ("Invalid selection please try again:");
	Concert = scnr.nextLine ().charAt (0);
      }
      return Concert;
  }

  static int GetNumTickets ()
  {
    // Read user input
    System.out.println ("Enter number of tickets:");
    Scanner scnr = new Scanner (System.in);
    int NumTickets = scnr.nextInt ();

    // Loop until user input is valid
    while ((NumTickets < 0) || (NumTickets > 10))
      {
	if (NumTickets < 0)
	  System.out.println ("Error: number must be > 0");
	else if (NumTickets > 10)
	  System.out.println ("Error: number must be <= 10");
	System.out.println ("Enter number of tickets:");
	NumTickets = scnr.nextInt ();
      }
    return NumTickets;
  }
  static float GetCost (char Concert, int NumTickets)
  {
    float Cost = 0;;
    // Beyonce tickets are $35 each
    if (Concert == 'B'){
        Cost = 35 * NumTickets;
    }
    // Lady Gaga tickets are $45 each
    if (Concert == 'L'){
        Cost = 45 * NumTickets;
    }
    // Taylor Swift tickets are $40 each
    if (Concert == 'T'){
        Cost = 40 * NumTickets;
    }
    // Cost is price * NumTickets
    // Give 10% discount on 5 or more Tickets
    if (NumTickets > 5){
        Cost = Cost * 0.9f;
        System.out.println(Cost);
    }
    return Cost;
  }

  public static void main (String[]args)
  {
    // Call function to find out the concert they want to attend
    char Concert = GetConcert ();
    int NumTickets = GetNumTickets ();
    float Cost = GetCost(Concert, NumTickets);
    // Call function to find out how many tickets they want
    // Call function to calculate total cost
    // Print out the information you have collected.
    System.out.println ("The customer wants the following:");
    System.out.println ("Concert: " + Concert);
    System.out.println ("Number of Tickets: " + NumTickets);
    System.out.println ("Total Cost: " + Cost);
  }
}



