package ALPHA_BATCH;

public class lecture_9_7 {
    public static void main(String[] args) {
        int [] number = {2,3,4,5};
        sub_Array(number);
    }

    private static void sub_Array(int[] number) {
        int tp =0;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j< number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                }
                tp+=1;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of sub arrays "+ tp);
    }
}
