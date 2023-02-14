package ALPHA_BATCH;

public class lecture_8_1 {
    public static void main(String[] args) {
        miror_triangle(4 );
    }

    public static void miror_triangle(int row) {
        // outer loop
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
