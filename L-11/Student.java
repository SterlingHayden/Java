import java.util.Scanner;
public class Student
{
    // Private variables
    private int ID;
    private double GPA;
    private String Name;
    private String Address;
    
    // Constructors
    public Student()
    {
        setID(0);
        setGPA(0);
        Name = "none";
        Address = "none";
    }
    
    public Student(int id, double gpa, String name, String address)
    {
        setID(id);
        setGPA(gpa);
        Name = name;
        Address = address;
    }
    
    // Setter methods
    public void setID(int id)
    {
        if (id < 0 || id > 9999) throw new IllegalArgumentException("ID is not in bounds [0,99999].");
        ID = id;
    }
    
    public void setGPA(double gpa)
    {
        if (gpa < 0 || gpa > 4) throw new IllegalArgumentException("GPA is not in bounds [0,4].");
        GPA = gpa;
    }
    
    public void setName(String name) { Name = name; }
    public void setAddress(String address) { Address = address; }
    
    // Getter methods
    public int getID(){ return ID; }
    public double getGPA() { return GPA; }
    public String getName() { return Name; }
    public String getAddress() { return Address; }
    
    // Print method
    public void print()
    {
        System.out.println("ID: " + ID);
        System.out.println("GPA: " + GPA);
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
    }
    
    // Read method
    public void read()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter ID Number: ");
        int idTemp = scnr.nextInt ();
        setID(idTemp);
        System.out.print("Enter GPA: ");
        double gpaTemp = scnr.nextDouble ();
        setGPA(gpaTemp);
        System.out.print("Enter Name: ");
        String skip = scnr.nextLine ();
        String Name = scnr.nextLine ();
        System.out.print("Enter Address: ");
        String Address = scnr.nextLine ();
        scnr.close();
    }
}