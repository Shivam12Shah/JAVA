package ALPHA_BATCH;

public class lecture_9_kadanes {
    public static void main(String[] args) {
        int[] number = {-2,-3,-1,-2,-3};
        kadanes(number);
    }

    private static void kadanes(int[] number) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs = cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("printing max sub array "+ ms);

    }
}
