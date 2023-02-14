package ALPHA_BATCH;

public class lecture_9_1 {
    public static void main(String[] args) {
        // modifiaction in arrayss
        int[] arr = {1,2,3,4};
        System.out.println("original array");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("modified array");
        for(int i=0; i<arr.length; i++){
            arr[i]+=1;
            System.out.println(arr[i] + " ");
        }
    }
}
