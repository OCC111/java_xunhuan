public class Demo01PhoneSame {
    public static void main(String[] args) {
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

        // 根据Phone类创建一个名为phone的对象
//        Phone two = new Phone();
//        System.out.println(two.brand);
//        System.out.println(two.price);
//        System.out.println(two.color);
//
//        System.out.println("==============");
//
//        two.brand = "三星";
//        two.price = 5999.0;
//        two.color = "星耀蓝";
//        System.out.println(two.brand);
//        System.out.println(two.price);
//        System.out.println(two.color);
//
//        System.out.println("==============");
//        two.call("欧巴");
//        two.fadaunxin("TheShy");

        Phone two =  one;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("==============");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "星耀蓝";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("==============");
        two.call("欧巴");
        two.fadaunxin("TheShy");
    }
}
