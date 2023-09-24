import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    //
    static double[] GenerateData(int N)
   {
      // Create output array
      double data[] = new double[N];
        
      // Loop creating data
      double height1 = 20;
      double height2 = 4;
      double height3 = 2;
      double frequency1 = 2;
      double frequency2 = 13;
      for (int i=0; i<data.length; i++)
      {
            double theta = (2 * Math.PI * i) / data.length;
            double wave1 = height1 * Math.sin(theta*frequency1);
            double wave2 = height2 * Math.cos(theta*frequency2);
            double noise = height3 * Math.random();
            data[i] = wave1 + wave2 + noise;
      }
      return data;
   }
    
    //
    static double[] Average(double input[], int N)
    {
        double[] output = new double[input.length];
        for (int i = 0 ; i < input.length; i++)
        {
            for (int k = 0; k < N; k++)
            {
                if (i-k < 0)
                {
                    output[i] += input[0];
                }
                else {
                    output[i] += input[i-k];
                }
            }
            output[i] = output[i] / N;
        }
        return output;
    }
    
    //
    static double[] Median(double input[], int N)
    {
        double[] output = new double[input.length];
        output[0] = input[0];
        for (int i = 1; i < input.length; i++)
        {
            if (i < N)
            {
                double copied_array[] = Arrays.copyOfRange(input, 0, i);
                Arrays.sort(copied_array);
                output[i] = copied_array[copied_array.length / 2];
            }
            else
            {
                double copied_array[] = Arrays.copyOfRange(input, i-N, i);
                Arrays.sort(copied_array);
                output[i] = copied_array[copied_array.length / 2];
            }
        }
        return output;
    }
    
    //
    static double[] Predict(double input[], int N)
    {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++)
        {
            if (i < N)
            {
                output[i] =  input[i];
            }
            else
            {
                double m = ((input[i-1] - input[i-N]) / ((i-1) - (i-N)));
                double x = i;
                double b = (input[i-N] - (m * (i-N)));
                output[i] = (m * x) + b;
            }
        }
        return output;
    }
    
    //
    static double[] Difference(double input1[], double input2[])
    {
        double[] output = new double[input1.length];
        for (int i = 0; i < input1.length; i++)
        {
            output[i] = input1[i] - input2[i];
        }
        return output;
    }
    
    //
    static void Print(double input1[])
    {
        for (int i = 0; i < input1.length; i++)
        {
            System.out.print(input1[i] + ",");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner (System.in);
        System.out.print("Enter the value of N:");
        int N = scnr.nextInt();
        
        double data[] = GenerateData(100);
        System.out.println("Data: ");
        Print(data);
        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        
    System.out.println("Select from fucntions to call from bellow:");
    System.out.println("A for Average");
    System.out.println("M for Median");
    System.out.println("P for Predict");
    System.out.println("D for Difference");
    System.out.print("User selection: ");
    char pick = scnr.next ().charAt (0);
    while (pick != 'A' && pick != 'M' && pick != 'P' && pick != 'D')
    {
	   System.out.print ("Invalid selection, ensure capitalization: ");
	        pick = scnr.next ().charAt (0);
    }
    if (pick == 'A')
    {
        System.out.println("Average: ");
        Print(Average(data, N));
    }
    if (pick == 'M')
    {
        System.out.println("Median: ");
        Print(Median(data, N));
    }
    if (pick == 'P')
    {
        System.out.println("Predictions: ");
        Print(Predict(Average(data, N), N));
    }
    if (pick == 'D')
    {
        System.out.println("Differences: ");
        Print(Difference(data, Predict(Average(data, N),N)));
    }
    
    }
}

