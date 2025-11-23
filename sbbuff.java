public class sbbuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ayush");
        System.out.println(sb);
        sb.append(" sharma");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.insert(2, " hello ");
        System.out.println(sb);
        sb.replace(2, 7, "hello");
        System.out.println(sb);
        sb.delete(2, 7);
        sb.reverse();
        System.out.println(sb);

    }
}
