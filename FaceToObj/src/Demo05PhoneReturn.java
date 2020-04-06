public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "iPhone 11";
        one.price = 7399.0;
        one.color = "星耀黑";
        return one;
    }
}
