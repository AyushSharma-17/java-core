public class simplechange {
    void main(){
        System.out.println("hello from simple change file");
        int a=5;
        int b=6;
        System.out.println("value of a: "+a+ " value of b: "+b);

        int temp =a;
        a=b;
        b=temp;
        System.out.println("after swapping value of a: "+a+ " value of b: "+b);

        secondMethod();
        int sum= add(a,b);
        System.out.println("sum of a nad b is "+sum);
          
    }

    void secondMethod(){
        System.out.println("hello from second method");
        int x=10;
    }

    int add(int x, int y){
        return x+y;
    }
}
