public class execptionj {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
        try {
            int c =b/a;
            
            System.out.println("the value of c is "+c);
        } catch (Exception e) {
            System.out.println("the error is "+e);
        }
    }
    
}
