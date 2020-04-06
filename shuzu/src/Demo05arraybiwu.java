public class Demo05arraybiwu {
    public static void main(String[] args) {
        // 比武
        int[] array = {5,15,30,20,10000};

        int max = array[0];
        for (int i=1;i<array.length;i++){
            // 如果当前元素，比max更大，则换人
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值："+max);
    }
}
