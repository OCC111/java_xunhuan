public class Demo08ArrayReverse {
    /*
    数组可以作为方法的参数，
    当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值

     */
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        printarray(array);
        System.out.println("======BBB=====");
        printarray(array);
        System.out.println("======AAA=====");
    }

    /*
    三要素
    返回值类型
    方法名称
    参数列表
    任何数据类型都可以作为方法的参数
     */

    public static void printarray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
