class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

} 
public class studentinstance{
    public static void main(String[] args){
        Student student1 = new Student("yuvan", 187);
        Student student2 = new Student("Thondu", 132);
        System.out.println(student1.name+" "+student1.rollno);
        System.out.println(student2.name+" "+student2.rollno);
    }
}