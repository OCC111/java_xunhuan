package demo07;

public class StringConvert {
    public static void main(String[] args) {
        String str1 = "会不会玩呀！你大爷的，你大爷的";
        String replace1 = str1.replace("你大爷的", "****");
        System.out.println(replace1);
//        System.out.println(str1);

        System.out.println("======================");

        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

    }
}
