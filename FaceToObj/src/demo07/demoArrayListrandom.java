package demo07;

import java.util.ArrayList;
import java.util.Random;

public class demoArrayListrandom {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            biglist.add(num);
        }
        ArrayList<Integer> smalllist = getSmallest(biglist);
        System.out.println("总共有"+smalllist.size()+"个");
        for (int i = 0; i < smalllist.size(); i++) {
            System.out.println(smalllist.size());
        }
        System.out.println(biglist);
    }

    public static ArrayList<Integer> getSmallest(ArrayList<Integer>biglist){
        // 创建一个小集合来装偶数结果
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2== 0){
                smalllist.add(num);
            }
        }
        return smalllist;
    }

}





