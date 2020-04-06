package demo06;

import java.util.Scanner;

public class sums_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = sc.next();

        System.out.println("请输入您的年龄:");
        String age = sc.next();

        System.out.println("请输入您的学号:");
        String number = sc.next();

        System.out.println("您的信息："+name+","+age+","+number);
    }

}
