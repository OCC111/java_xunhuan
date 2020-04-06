package demo07;

public class StringGet {

    public static void main(String[] args) {
        // String当中与获取相关的常用方法

        int length1 = "sdfsdfsdfdsfsdfdaghshgfjgfgreteaf".length();
        System.out.println("字符串的长度是:"+length1);

        String str1 = "Hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        System.out.println("===================");

        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是:"+ch);


    }
}
