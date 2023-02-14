package ALPHA_BATCH;

import java.util.Arrays;

public class lecture_10_inbuilt_Sorting {
    public static void main(String[] args) {
        int arr[]= {21,23,3,4,45,56,4};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
        //}
        System.out.println();
        Arrays.sort(arr,0,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
