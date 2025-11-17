
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class comparatorsort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ayush",22));
        students.add(new Student(2,"pyush",23));
        students.add(new Student(3,"nikhil",24));
        students.add(new Student(5,"Akhil",26));
        students.add(new Student(4,"abhi",28));
       
       
       
        System.out.println("Before Sorting");

        for(Student s: students){
            System.out.println(s);
        }

           Collections.sort(students);
           System.out.println("After sorting");
           for(Student s : students){
            System.out.println(s);
           }



    }
}
class Student implements Comparable<Student> {
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
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        //return this.id - o.id;        //sorting by id
       // return this.name.compareTo(o.name); //sorting by name
        return this.age - o.age;
    }
    
}