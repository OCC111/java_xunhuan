public class method_demo03 {
    /*
    有参数 小括号内有内容 有一个方法需要一些数据条件
    无参数 不需要任何数据条件自己就能完成任务
     */



    public static void main(String[] args) {
        method1(2,3);
        method2();
    }
    // 两个数字相乘   有参数
    public static void method1(int a,int b){
        int result = a*b;
        System.out.println("结果是"+result);
    }

    // 无参数  固定进行十次
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld"+i);
        }
    }

}
