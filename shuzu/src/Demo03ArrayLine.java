public class Demo03ArrayLine {
    /*
    如何获取数组的长度，格式
    数组名称.length
    这将会得到一个int数字，代表数组的长度

    数组在程序运行时长度不可以改变
     */
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,20,30,2,4,6,8,9,20,30,2,4,6,8,9,20,30,2,4,6,8,9,20,30,2,4,6,8,9,20,30,2,4,6,8,9,20,30,2,4,6,8,9,20,30,2,4,6,8,9};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是"+len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = arrayB;
        System.out.println(arrayC.length);
    }
}
