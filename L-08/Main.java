public class Main
{
    // Testing the Student class
    public static void main(String[] args)
    {
        System.out.println("\nTesting the Student class");
        
        Student student1 = new Student(123, 3.14,
        "John Smith", "101 Main Street");
        System.out.println("\nStudent information: ");
        student1.print();
        
        Student student2 = new Student(-123, 5.14,
        "Tom Jones", "42 State Street");
        System.out.println("\nStudent information: ");
        student2.print();
        
        Student student3 = new Student();
        student3.read();
        System.out.println("\nStudent information: ");
        student3.print();
    }
}
