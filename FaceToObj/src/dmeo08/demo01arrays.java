package dmeo08;

import java.util.Arrays;

public class demo01arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intstr = Arrays.toString(intArray);
        System.out.println(intstr);

        int[] array1 = {2,1,3,5,4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); // 默认排序的效果

        char[] array2 = {'a','c','b','e','d'};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // 默认排序的效果

    }
}
