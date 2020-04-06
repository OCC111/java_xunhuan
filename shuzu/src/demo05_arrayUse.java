public class demo05_arrayUse {

    /*

    使用动态初始化数组的时候，其中的元素将自动拥有一个默认值，

    如果是整数类型，默认是0，
    浮点类型，默认是0.0
    字符类型，默认是\u0000
    布尔类型，默认是false
    引用类型，默认是null

    注意事项：
    静态初始化也有默认值的过程，，
    只不过系统自动马上将默认值替换为了大括号当中的具体数值

     */

    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];

        // 将数据123赋值给数组array当中的索引为1的位置
        array[1] = 123;
        System.out.println(array[0]); // 0
        System.out.println(array[1]);
        System.out.println(array[2]);


    }
}
