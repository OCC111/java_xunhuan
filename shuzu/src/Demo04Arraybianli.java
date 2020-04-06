public class Demo04Arraybianli {
    /*
    遍历数组 说的就是把数组中的元素依次打印出来
     */
    public static void main(String[] args) {
        int[] array = {15,25,35,45,55,65,75,85,95};

        // 原始方法
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);

        System.out.println("================");

        // 使用循环，，次数确定，，就是数组的长度
        for (int i = 0;i<7;i++){
            System.out.println(array[i]);
        }
        System.out.println("================");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
