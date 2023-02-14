package ALPHA_BATCH;

public class lecture_9_6 {
    public static void main(String[] args) {
        int [] number = {2,3,4,5};
        all_Pairs(number);
    }

    private static void all_Pairs(int[] number) {
        int tp=0;
        //outer loop
        for(int i=0;i< number.length; i++){
            int curr = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" + curr + ","+ number[j]+ ")" );
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs " +  tp);
    }
}
