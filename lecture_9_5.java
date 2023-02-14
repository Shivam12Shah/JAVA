package ALPHA_BATCH;

public class lecture_9_5 {
    public static void main(String[] args) {
        int arr[]= {1,2,4,5,6,7,8};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
