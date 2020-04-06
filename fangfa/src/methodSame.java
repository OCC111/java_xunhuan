// 定义一个方法 用来判断两个数字是否相同  布尔类型的值

public class methodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }

    /*
    三要素
    返回值类型 boolan
    方法名称 isSame
    参数列表 int a , int b
     */

    public  static boolean isSame(int a , int b){
//        if (a==b){
//            same = true;
//        }else{
//            same = false;
//        }

//        boolean same = a == b;
        return a==b;
    }

}
