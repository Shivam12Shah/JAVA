package ALPHA_BATCH;

public class lecture_9_8 {
    public static void main(String[] args) {
        int [] number = {2,4,6,8,10};
        sub_array_sum(number);
    }

    private static void sub_array_sum(int[] number) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for(int i=0 ;i< number.length; i++){
            int start = i;
            for(int j=i; j< number.length; j++){
                int end =j;
                currSum =0;
                for( int k=start; k<=end; k++){
                    currSum+=number[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                if(minsum>currSum){
                    minsum=currSum;
                }
            }
        }
        System.out.println("so the maximum sum of sub array "+ maxSum);
        System.out.println("so the minimum sum of sub array "+ minsum);
    }
}
