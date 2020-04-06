package dmeo08;

import java.util.Scanner;

public class demoStringCount {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String inputs = sn.next();

        int countUpper = 0;
        int countlower = 0;
        int countnumber = 0;
        int countother = 0;
        char[] charArray = inputs.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'b') {
                countlower++;
            } else if ('0' <= ch && ch <= '9') {
                countnumber++;
            } else {
                countother++;
            }
        }
    }


}

