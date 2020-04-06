import java.util.Arrays;

public class Demo01PrintArray {
    /*
    面向过程 ： 当需要实现一个功能的时候，每个具体的步骤都要亲自去做，详细处理每个细节
    面向对象 ： 当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人帮我做事
     */
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // 使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }

        }
        System.out.println("=================");

        // 使用面向对象
        System.out.println(Arrays.toString(array));
    }
}
