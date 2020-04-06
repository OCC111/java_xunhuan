public class Demo01phone {
    public static void main(String[] args) {
        // 根据Phone类创建一个名为phone的对象
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("==============");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("==============");
        one.call("弗拉基米尔");
        one.fadaunxin("弗雷尔卓德");
    }
}