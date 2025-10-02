public class methods {
    public static void main(String[] args ) {
        int ans = sum(5, 10);
        System.out.println(ans);

               //use of math class

        int a = Math.max(5, 10);
        System.out.println(a);
               int k= getRandom(1,10);
        System.out.println("value of random number from 1 to 10 is "+k);
    }
    static int sum(int a, int b) {
        return a + b;
    }

    static int getRandom(int x, int y){
        return (int) (Math.random() * (y -x +1) +x);
    }
}
