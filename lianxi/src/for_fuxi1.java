public class for_fuxi1 {


    public static void main(String[] args) {
        System.out.println(yibai_sum());
    }

    // 自定义方法中计算1-100的偶数和
    public static int yibai_sum(){
        int sum = 0;
        for (int i = 1;i<=100;i++){
            if (i%2==0){
                sum += i;
            }
        }
        return sum;
    }
}
