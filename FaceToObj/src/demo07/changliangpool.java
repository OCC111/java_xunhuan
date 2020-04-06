package demo07;

public class changliangpool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str3));

        String strA = "Java";
        String strB = "java";

        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));

    }

}
