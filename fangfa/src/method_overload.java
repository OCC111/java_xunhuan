public class method_overload {
    /*
    比较两个数据是否相等


     */

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

        System.out.println(isSame(a,b));
        System.out.println(isSame((short)20,(short)20));
    }


    public static boolean isSame(byte a, byte b){
        boolean same;
        if (a==b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        boolean same = a == b ? true : false;
        return same;
    }

//    public static boolean isSame(int a,int b){
//        return a== b;
//    }

    public static boolean ISSAME(int a,int b){
        return a== b;
    }



}
