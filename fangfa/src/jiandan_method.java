public class jiandan_method {

    /*
    定义格式
    public static void 方法名称(){
       方法体
    }
    建立的方法一定要调用才会被执行
     */


    public static void main(String[] args) {
        HelloWorld();
    }

    public static void HelloWorld() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
