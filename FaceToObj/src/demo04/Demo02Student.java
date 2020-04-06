package demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student(); // 类名称就是构造方法
        System.out.println("==========");

        Student stu2 = new Student("赵丽颖",20);
        System.out.println("姓名:"+ stu1.getName()+"年龄:"+stu2.getAge());

    }
}
