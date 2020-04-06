public class Demo07arrayReverse {
    /*
    数组翻转
    本来 {1,2,3}
    之后 {3,2,1}

    遍历数组用的是一个索引值

    翻转数组需要使用两个索引值，，即对称位置

    如何交换两个变量值，，

     */
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");

        /*
        初始化语句 int min = 0,max = array.leng-1
        条件判断 min < max
        步进表达式 min++ max--
        循环体
         */
        for (int min = 0,max = array.length-1;min < max;min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 再次打印遍历输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
