/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
 Scanner scnr = new Scanner (System.in);
 // Read test score
 System.out.println("Enter test score: ");
 float Score = scnr.nextFloat();
 // Check test score
 if (Score >= 100)
    System.out.println("You grade is A+\n");
 else if (Score >= 90)
    System.out.println("Your grade is A\n");
 else if (Score >= 80)
    System.out.println("Your grade is B\n");
 else if (Score >= 70)
    System.out.println("Your grade is a C\n");
 else if (Score >= 60)
    System.out.println("Your grade is a D\n");
 else
    System.out.println("Your grade is a F\n");
}
}


