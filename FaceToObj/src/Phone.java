public class Phone {
    // 成员变量
    String brand;
    double price;
    String color;

    // 成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }

    public void fadaunxin(String whos){
        System.out.println("发送短信给"+whos);
    }
}
