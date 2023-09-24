public class Temperature
{
    private static final double ABSOLUTE_ZERO = -273.15;
    private static final double SUN_CORE_TEMP = 15710000;
    private double CelsiusTemperature;
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
        {
            CelsiusTemperature = ABSOLUTE_ZERO;
        }
        if (CelsiusTemperature > SUN_CORE_TEMP)
        {
            CelsiusTemperature = SUN_CORE_TEMP;
        }
    }
    
    public void setFahrenheit(double Temp)
    {
        CelsiusTemperature = (Temp - 32.0) * 5.0 / 9.0;
        if (CelsiusTemperature < ABSOLUTE_ZERO)
        {
            CelsiusTemperature = ABSOLUTE_ZERO;
        }
        if (CelsiusTemperature > SUN_CORE_TEMP)
        {
            CelsiusTemperature = SUN_CORE_TEMP;
        }
    }
}