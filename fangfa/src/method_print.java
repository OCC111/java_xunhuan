// 定义一个方法打印指定次数的HelloWorld

public class method_print {
    public static void main(String[] args) {
        printCount(3);
        System.out.println(getDouble());

        System.out.println(getMax(1,2));
    }

    /*
    返回值类型 只是进行一大堆打印操作，没有计算，也没有结果告诉调用出
    方法名称  printCount
    参数列表 到底要打印多少次？ 必须告诉我， 次数int
     */

    // 如果有返回值的方法必须要进行return
    public static int printCount(int num){
        for (int i =0;i<num;i++){
            System.out.println("HelloWorld");
        }
        return num;
    }

    public static double getDouble(){
        return 10.0;
    }

    public static void method3(){
        System.out.println("aaa");
        System.out.println("bbb");
        // 最后一行的return可以不写
    }

    public static int getMax(int a,int b){
//        int max;
//        if (a>b){
//            max = a;
//        }else{
//            max = b;
//        }
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}
