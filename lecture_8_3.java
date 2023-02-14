package ALPHA_BATCH;

public class lecture_8_3 {
    public static void main(String[] args) {
        increasing_order_triangle(15);
    }

    public static void increasing_order_triangle(int row) {
        int count =1;
        for(int i=1; i<=row; i++){
            for(int j=i; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
