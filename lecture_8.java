package ALPHA_BATCH;

public class lecture_8 {

    public static void main(String[] args) {
        hello_rectangle(6,9);
    }

    private static void hello_rectangle(int tot_row, int tot_col) {
        //outer loop
        for(int i=1; i<=tot_row; i++){
            // inner loop
            for(int j=1; j<=tot_col; j++){
                if(i==1||i==tot_row||j==1||j==tot_col){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
