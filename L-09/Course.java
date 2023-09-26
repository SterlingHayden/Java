public class Course
{
    private Student[] student = new Student[100];
    private int count = 0;
     
    public Course(){ }
    public Course(Course param)
    {
        student = new Student[100];
        count = param.count;
        for (int i = 0; i < count; i++)
        {
            student[i] = param.student[i];
        }
    }
    public void store(Student param)
    {
        Student tempStudent = new Student();
        tempStudent.setID(param.getID());
        tempStudent.setGPA(param.getGPA());
        tempStudent.setName(param.getName());
        tempStudent.setAddress(param.getAddress());
        student[count] = tempStudent;
        count += 1;
    }
    public void print()
    { 
        for (int i = 0; i <= count-1; i++)
        {
            student[i].print();
        }
    }
    public Student topStudent()
    {
        int top = 0;
        for(int i=0; i < count; i++)
        {
            if (student[i].getGPA() > student[top].getGPA())
            top = i;
        }
        return student[top];
    }
}