package ALPHA_BATCH;

public class lecture_10_Sorting {
    public static void main(String[] args) {
        int [] arr = {12,3,4,45,67,87,998,23};
        bubble_Sort(arr);
        System.out.println("sorted with bubble sort");
        System.out.print("                    ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        selection_Sort(arr);
        System.out.println("sorted with selection sort decending order");
        System.out.print("                   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        insertion_Sort(arr);
        System.out.println("sorted with insertion sort");
        System.out.print("                    ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    private static void insertion_Sort(int[] arr) {
        for (int i=1; i< arr.length; i++){
            int curr = arr[i]; // second element se start kar ke curr mai store kaunga
            int prev =i-1;  //uske pahle ka element
            while (prev>=0 && arr[prev]>curr){
                // koi bhi negative value nahi rahni cahiye
                // checking prev >  curr
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    private static void selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public  static void bubble_Sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
