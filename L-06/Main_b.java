import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    static double[] solve_quadratic(double a, double b, double c)
    {
    // Check for NO roots
    double discriminant = b * b - 4 * a * c;
    if ((a == 0 && b == 0) || (discriminant < 0))
    {
    System.out.printf("No roots:");
    double result[] = {};
    return result;
    }
    // Solve linear equation
    else if (a == 0)
    {
    double root = -c / b;
    System.out.printf("Root:");
    double result[] = {root};
    return result;
    }
    // Solve for ONE root
    else if (discriminant == 0)
    {
    double root = -b / (2 * a);
    System.out.printf("Root:");
    double result[] = {root};
    return result;
    }
    // Solve for TWO roots
    else
    {
    double root1 = (- b - Math.sqrt(discriminant)) / (2 * a);
    double root2 = (- b + Math.sqrt(discriminant)) / (2 * a);
    System.out.printf("Roots:");
    double result[] = {root1, root2};
    return result;
    }
    }

    public static void main(String[] args)
    {
        // Solve Quadratic
        int range = 1;
        for (int a = -range; a <= range; a++)
        for (int b = -range; b <= range; b++)
        for (int c = -range; c <= range; c++)
            {
        System.out.print("\nQuadratic equation: ");
        System.out.println("y="+a+"x^2"+"+"+b+"x"+"+"+c);
        double roots[] = solve_quadratic(a, b, c);
        //solve_quadratic(a, b, c);
        System.out.println(Arrays.toString(roots));
    }
}
} 
