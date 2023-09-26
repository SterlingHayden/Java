public class Student
{
    private int ID;
    private double GPA;
    private String Name;
    private String Address;
    
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
    
    public void setID(int id)
    {
        ID = id;
        if (ID < 0)
        ID = 0;
        if (ID > 99999)
        ID = 99999;
    }
    
    public void setGPA(double gpa)
    {
        GPA = gpa;
        if (GPA < 0)
        GPA = 0;
        if (GPA > 4)
        GPA = 4;
    }
    
    public void setName(String name)
    {
        Name = name;
    }
    
    public void setAddress(String address)
    {
        Address = address;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public double getGPA()
    {
        return GPA;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getAddress()
    {
        return Address;
    }
    
    
    public void print()
    {
        System.out.println("ID: " + ID);
        System.out.printf("GPA: %4.2f\n", GPA); 
        System.out.println("Name: '" + Name + "'");
        System.out.println("Address: '" + Address + "'");
    }
}