import java.net.SocketOption;

public class Demo01Arrayindex {
    public static void main(String[] args) {
        int[] array = {15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        // 错误写法，并不存在3号元素，如果访问数组，而其索引并不存在，
        // 原因：索引编号写错了。    数组索引越界异常
        System.out.println(array[3]);

    }
}
