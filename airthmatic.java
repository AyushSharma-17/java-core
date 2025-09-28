import java.util.Scanner;

public class airthmatic {
    
    public static void main(String[] args){
        int a=19;
        int b=5;
        int c;
        c= a+b;
        int d= a-b;
        int j=a*b;
        int k=a/b;
        int l=a%b;
        // System.out.println("the difference is "+d);
        // System.out.println("the product is "+j);
        // System.out.println("the division is "+k);
        // System.out.println("the modulus is "+l);
        // System.out.println("the sum is "+c);


        //testing relational operators
        System.out.println(a==b);
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the value of p");
        int p= scn.nextInt();
        System.out.println("enter the value of q");
        int q= scn.nextInt();
        // testing for the logiacal operators
        int r= 12;
        int w= 14;

        System.out.println(p>q && r>w);
        System.out.println(p>q || r>w);
    }
}
