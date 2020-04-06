public class Demo_overload_println {

    public static void main(String[] args) {
        myPrint(111);
        myPrint("sdfdsf");

    }

    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(boolean is){
        System.out.println(is);
    }


    public static void myPrint(String str){
        System.out.println(str);
    }
}
