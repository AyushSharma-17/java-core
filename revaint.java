class revaint{
    public static void main(String[] args) {
        int x = 121;
        revaint obj = new revaint();
        boolean result = obj.isPalindrome(x);
        System.out.println("Is the number a palindrome? " + result);
    }
    public boolean isPalindrome(int x) {
        long num = 0;
        int y=x;
        while (x != 0) {
            int dig = x % 10;
            num = num * 10 + dig;
            x = x / 10;
        }
       return y == (int)num;

    }
}