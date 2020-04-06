// 定义一个方法求出1-100的和

public class DemoMethod_sum {
    public static void main(String[] args) {
        System.out.println("结果是:"+getSum());
    }
    /*
    三要素
    返回值 有返回值 计算结果是一个int
    方法名称 getSum
    参数列表 数据返回已经确定，是固定的，不需要任何条件，不需要参数
     */
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;

        }
        return sum;
    }

}
