package ALPHA_BATCH;

public class lecture_10_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,6,4,5,6,7,7,8,9};
        selection_Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
}
