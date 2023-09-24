public class Main_a
{
    public static void main(String[] args)
     {
        Temperature freezing = new Temperature();
        Temperature boiling = new Temperature();
        Temperature coldcold = new Temperature();
        Temperature hothot = new Temperature();
        freezing.setCelsius(0);
        boiling.setCelsius(100);
        coldcold.setCelsius(-500);
        hothot.setCelsius(20000000);
        System.out.println("freezing: " + freezing.getFahrenheit()+"F");
        System.out.println("boiling: " + boiling.getFahrenheit()+"F");
        System.out.println("coldcold: " + coldcold.getFahrenheit()+"F");
        System.out.println("hothot: " + hothot.getFahrenheit()+"F");
    }
}