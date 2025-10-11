public class javaString {
    public static void main(String[] args) {
        String name = "Ayush";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("h"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("y"));
        System.out.println(name.indexOf("z")); // if not found then return -1
        System.out.println(name.substring(1, 4));
        System.out.println(name.replace('y', 'i'));
        System.out.println(name.replace("Ay", "Hi"));
        System.out.println(name.contains("yus"));
        System.out.println(name.equals("ayush"));
        System.out.println(name.equalsIgnoreCase("ayush"));
        String name2 = "   Ayush   ";
        System.out.println(name2);
        System.out.println(name2.trim());
    }
}
