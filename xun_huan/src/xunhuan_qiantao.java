// 输出 0-23点的秒分时

public class xunhuan_qiantao {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                for (int seconds=0;seconds<60;seconds++){
                    System.out.println(hour + "点" + minute + "分"+seconds+"秒");
                }

            }

        }
    }
}
