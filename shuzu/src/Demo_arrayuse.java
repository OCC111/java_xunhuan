public class Demo_arrayuse {
    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = {10,20,30};

        // 可以直接打印数组元素，，也可以把数组值赋值给变量
        System.out.println(array); // [I@2d98a335 内存地址值
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30

        System.out.println("=====================");

        // 访问数组元素的格式
        // 索引值从0开始，一直到数组的长度-1为止


        int number = array[1];
        System.out.println(number);

    }
}
