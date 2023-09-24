import java.util.Scanner;
public class Main_b
{
    public static void main(String[] args)
    {
        // Get user input
        System.out.print("Enter start temperature2: ");
        temperature2 Start = new temperature2();
        Start.setFahrenheit(Start.read());
        //System.out.println(Start.getFahrenheit());
        System.out.print("Enter end temperature2: ");
        temperature2 End = new temperature2();
        End.setFahrenheit(End.read());
        
        // Loop printing temperature2s
        for (double F = Start.getFahrenheit(); F <= End.getFahrenheit(); F++)
        {
            temperature2 Temp = new temperature2();
            Temp.setFahrenheit(F);
            Temp.Print(Temp.getFahrenheit());
        }

    }
}