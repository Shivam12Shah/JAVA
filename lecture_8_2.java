package ALPHA_BATCH;

public class lecture_8_2 {
    public static void main(String[] args) {
        decressing_order(6);
    }

    public static void decressing_order(int row) {
        for(int i=1;i<=row; i++){
            for(int j=1; j<row-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
