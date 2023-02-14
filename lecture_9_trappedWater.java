package ALPHA_BATCH;

public class lecture_9_trappedWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        trappedWater(arr);

    }

    private static void trappedWater(int[] arr) {
        //calculate left max boundary in array
        int[] leftMax = new int[arr.length];
        leftMax[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        // calculate right max boundary in array
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            rightMax[i]=Math.max(arr[i], rightMax[i+1]);
        }
        // tappwater cout
        int trappedWater = 0;
        //loop
        for(int i=0; i< arr.length; i++){
            int walterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += walterLevel - arr[i];
        }
        System.out.println("the total water is trapped "+ trappedWater);
    }
}
