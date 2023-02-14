package ALPHA_BATCH;

public class lecture_10_bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,6,4,5,6,7,7,8,9};
        bubble_Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static  void bubble_Sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
