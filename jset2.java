import java.util.HashSet;
import java.util.Set;

public class jset2 {
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<>();
        set1.add(new Student(2, "Ayush"));
        set1.add(new Student(3, "Ayush"));
        set1.add(new Student(4, "Ayush"));
        set1.add(new Student(1, "AYush"));

        System.out.println(set1);

    }

    static class Student {
        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student [rollNo=" + rollNo + ", name=" + name + "]";
        }
    }
}
