// 方法中void类型不会告诉任何人，只会自己进行输出打印，，并且无返回值

public class method_sum {
    // 求和   有返回值
    public static void main(String[] args) {
        float num = sum_method(3,6);
        System.out.println("结果是"+num);
    }
    // 我是一个方法，我负责两个数字相加
    // 我有返回值int，谁调用我，我就把返回值给谁
    public static float sum_method(int a ,int b){
        int result = a*b;
        return result;
    }
}
