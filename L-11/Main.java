public class Main
{
    // Testing the Student class
    public static void main(String[] args)
    {
        System.out.println("\nTesting the Student class");
        //Student student = new Student(-123, 4.56,
        //"Peter Parker", "101 Main Street");
        Student student = new Student();
        try
        {
            //new Student(123, 4.56, "Peter Parker", "101 Main Street");
            //student = new Student();
            student.read();
        }
        catch (Exception e)
        {
            String message = "Error: " + e.getMessage();
            System.out.println(message);
        }
        System.out.println("\nStudent information: ");
        student.print();
    }
}