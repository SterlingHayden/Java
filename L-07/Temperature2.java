import java.util.Scanner;
public class Temperature
{
    // Private variables
    private double CelsiusTemperature;
    private static final double ABSOLUTE_ZERO = -273.15;
    private static final double SUN_CORE_TEMP = 15710000.0;
    
    // Constructors
    public Temperature()
    {
        CelsiusTemperature = 0;
    }
    
    public double getCelsius()
    {
        return CelsiusTemperature;
    }
    
    public double getFahrenheit()
    {
        return 9.0 * CelsiusTemperature / 5.0 + 32.0;
    }
    
    public void setCelsius(double Temp)
    {
        CelsiusTemperature = Temp;
        if (CelsiusTemperature < ABSOLUTE_ZERO)
        CelsiusTemperature = ABSOLUTE_ZERO;
        if (CelsiusTemperature > SUN_CORE_TEMP)
        CelsiusTemperature = SUN_CORE_TEMP;
    }
    
    public void setFahrenheit(double Temp)
    {
        CelsiusTemperature = (Temp - 32.0) * 5.0 / 9.0 ;
        if (CelsiusTemperature < ABSOLUTE_ZERO)
        CelsiusTemperature = ABSOLUTE_ZERO;
        if (CelsiusTemperature > SUN_CORE_TEMP)
        CelsiusTemperature = SUN_CORE_TEMP;
    }
    
    // print method
    public void Print(double Temp)
    {
        System.out.printf("%3.1fF = %3.1fC\n",Temp, CelsiusTemperature);
    }
    
    // read method
    public double read()
    {
        Temperature Temp = new Temperature();
        Scanner scnr = new Scanner(System.in);
        double tmp = scnr.nextDouble();
        char unit = scnr.next ().charAt (0);
        if (unit == 'c' || unit == 'C')
        {
            Temp.setCelsius(tmp);
        }
        else if (unit == 'f' || unit == 'F') 
        {
            Temp.setFahrenheit(tmp);
        }
        return tmp;
    }
    
}