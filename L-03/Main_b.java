/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main_b
{
 public static void main(String[] args)
 {
 Scanner scnr = new Scanner(System.in);
 int size = 12;
 for (int outer = 1; outer <= size; outer++)
 {
 //System.out.println("outer = " + outer);
 for (int inner = 1; inner <= size; inner++)
 {
 System.out.printf("%5d",(inner * outer));
 
           }
           System.out.println();
        }
    }
 }

