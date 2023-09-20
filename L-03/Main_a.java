/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main_a
{
 public static void main(String[] args)
 {
 // Get number from user
 Scanner scnr = new Scanner(System.in);
 int input = 0;
 System.out.println("Enter a number:");
 input = scnr.nextInt();;

 // Print numbers from [1..input]
 for (int num = 1; num <= input; num++)
 System.out.print(num + " ");
 System.out.println();
 
 // Print EVEN numbers from [0..input-1] (TBA)
 for (int num = 0; num <= input - 1; num++){
     if ((num % 2) == 0){
         System.out.print(num + " ");
     }
 }
 //System.out.print(num + " ");
 System.out.println();
 
 // Print ODD numbers from [input..1] (TBA)
 for ( int num = input; num >= 1; num-- ){
     if ((num % 2) == 1){
        System.out.print(num + " ");
     }
 }
 }
}


