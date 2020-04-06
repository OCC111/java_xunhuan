/*
通常一个类不能直接使用，需要根据类创建一个对象，才能使用
1.导包 需要使用的类在什么位置
import 包名称.类名称;
2.创建 格式：
类名称 对象名 = new 类名称();
Student stu = new Student();

3.使用
使用成员变量 对象名.成员变量名
使用成员方法 对象名.成员方法名(参数)
想用谁就用对象名点儿谁


注意事项
成员变量没有赋值，会有一个默认值，规则和数组一样
 */
public class Demo02student {
    public static void main(String[] args) {
        // 1.导包
        // 2.创建
        Student stu = new Student();

        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("===========");
        stu.name = "赵丽颖"; // 右侧的字符串赋值给stu对象中的name
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();
        stu.study();
    }
}
