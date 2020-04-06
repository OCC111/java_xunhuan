public class xunhuan_do_while {
    public static void main(String[] args) {
        /*
        do while 循环的标准格式
        do {
            循环体;
        }while(条件判断);

        do while 循环的扩展格式
        初始化语句
        do {
        循环体;
        步进语句;
        }
         */

        int i = 1;
        do {
            System.out.println("原谅你啦！"+i);
            i++;
        }while(i <= 10);
    }
}
