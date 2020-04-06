package demo09;

import java.util.Arrays;

public class demo02arrayspractise {

    public static void main(String[] args) {
        String str1 = "jegfdlgkjfakflhdhjkafhuiaedfbabgjakhhdjfakdhfuhueafhdjg";

        char[] chars = str1.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
