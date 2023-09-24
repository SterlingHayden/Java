import java.util.Scanner;
import java.util.Arrays;
public class Main_a
{
    static void add1(double data[])
    {
        for (int i = 0; i < data.length; ++i ){
            data[i] = data[i] + 1;
        }
    }
    static void sqrt(double data[])
    {
        for (int i = 0; i < data.length; ++i ){
            data[i] = Math.sqrt(data[i]);
        }
    }
    static double average(double data[])
    {
        double sum = 0;
        for (int i = 0; i < data.length; ++i ){
            sum += data[i];
        }
    return sum/data.length;
    }
    static double median(double data[])
    {
        double sorted_array[] = Arrays.copyOf(data, data.length);
        Arrays.sort(sorted_array);
        return sorted_array.length/2;
    }
    public static void main(String[] args)
    {
    double data[] = {3,1,4,1,5,9,2,6,5,3,5,1000};
    System.out.println("Data: " + Arrays.toString(data));
    add1(data);
    System.out.println("Add1(Data): " + Arrays.toString(data));
    sqrt(data);
    System.out.println("Sqrt(Data): " + Arrays.toString(data));
    System.out.println("Average(Data): " + average(data));
    System.out.println("Median(Data): " + median(data));
    System.out.println("Data: " + Arrays.toString(data));
    }
}


