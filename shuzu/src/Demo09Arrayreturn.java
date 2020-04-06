public class Demo09Arrayreturn {
    /*
    一个方法可以有0/1，多个参数，但是只能有0或1个返回值，不能多个返回值
     */
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);
        System.out.println("总和：" + result[0]);
        System.out.println("平均值：" + result[1]);

    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        // 需要一个数组，他就是一个塑料兜，数组可以保存多个结果
        /*
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;
         */

        int[] array = {sum, avg};
        return array;

    }
}
