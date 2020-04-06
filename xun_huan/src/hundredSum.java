// 求出1-100偶数和

public class hundredSum {
    public static void main(String[] args) {
        int sum = 0;  // 用来累加的存钱罐
        for (int i = 0;i<=10000;i++){
            if (i%2==0){
                sum += i;
            }
        }
        System.out.println("本次金额："+sum);
    }
}
