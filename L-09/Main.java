public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nTesting the Student class");
        Student student1 = new Student(321, 3.21, "Clark Kent",
        "101 Metro Road");
        Student student2 = new Student(345, 3.45, "Mary Richards",
        "42 State Street");
        Student student3 = new Student(246, 2.46, "Charlie Brown",
        "50 Peanut Lane");
        student1.print();
        student2.print();
        student3.print();
        System.out.println("\nTesting the Course class");
        Course course = new Course();
        course.store(student1);
        course.store(student2);
        course.store(student3);
        course.print();
        System.out.println("\nCopy of course");
        Course copy = new Course(course);
        copy.print();
        System.out.println("\nTop Student:");
        Student top = copy.topStudent();
        top.print();
        top.setGPA(4.0);
        copy.print();
    }
}