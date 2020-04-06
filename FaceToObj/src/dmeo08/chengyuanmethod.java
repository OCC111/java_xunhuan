package dmeo08;

public class chengyuanmethod {

    int num = 0;
    static int numStatic = 100;

    public static void main(String[] args) {
        myMethod();
        chengyuanmethod ch = new chengyuanmethod();
        ch.method();
    }

    // 成员方法  可以直接使用成员变量
    public void method(){
        System.out.println("我的成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }

    // 静态方法 不可以直接使用成员变量
    public static void myMethod(){
        System.out.println("我的第一个静态方法");
    }
}
