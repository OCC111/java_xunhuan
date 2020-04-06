/*
    方法的重载 overload
    概念：多个方法的名称一样，但是参数列表不一样

    好处：只要记住唯一一个方法名称，就可以实现多个功能

    方法重载与下列因素相关
    1.参数个数不同
    2.参数类型不同
    3.参数的多类型顺序不同

    方法重载与下列因素无关
    1.与参数名称无关的
    2.与方法的返回值类型无关

     */

public class method_chongzai {
    public static void main(String[] args) {
//        System.out.println(sum(1,2));
//        System.out.println(sumThree(1,2,3,5));

        System.out.println(sum(1,2)); //
    }

    public static int sum(int a,int b){
        System.out.println("有两个参数的方法执行");
        return a + b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("有四个参数的方法执行");
        return a+b+c;
    }



}
