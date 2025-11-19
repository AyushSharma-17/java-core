import java.util.Set;
import java.util.TreeSet;

public class treesortdef {
    public static void main(String[] args) {
        Set<Student> treeSet= new TreeSet<>();
        treeSet.add(new Student(1,"Ayush",22));
        treeSet.add(new Student(2,"pyush",22)); 
        treeSet.add(new Student(4,"nikhil",24));
        treeSet.add(new Student(3,"Akhil",26));
        treeSet.add(new Student(5,"abhi",28));

        System.out.println("before sorting");
        for(Student s: treeSet){
            System.out.println(s);
        }


        System.out.println("checking someting inserting of int tree ");
        Set<Integer> intarr = new TreeSet<>();
        intarr.add(5);
        intarr.add(2);
        intarr.add(8);  
        intarr.add(1);
        intarr.add(4);
                  System.out.println("tree set is by default sorted of int ");
        for( Integer i: intarr){
            System.out.println(i);
        }
    }
}
class Student{
    int id ;
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
