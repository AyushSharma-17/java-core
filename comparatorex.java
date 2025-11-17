import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorex {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ayush",22));
        students.add(new Student(2,"pyush",22));
        students.add(new Student(4,"nikhil",24));
        students.add(new Student(3,"Akhil",26));
        students.add(new Student(5,"abhi",28));
       
       
       
        System.out.println("Before Sorting");

        for(Student s: students){
            System.out.println(s);
        }
           //sorting by id using compartor
           Collections.sort(students, new IdComparator());
           System.out.println("after sorting by id");
           for(Student s: students){
            System.out.println(s);
           }
          
    }
}
class Student{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
    
}
class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.id -o2.id;
    }
    
}
