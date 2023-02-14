package ALPHA_BATCH;

import java.util.Scanner;

public class lecture_11_TWOD {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length;
        int m =matrix[0].length;

        Scanner sc = new Scanner(System.in);

        int ARRAY2d[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i = 0; i < ARRAY2d.length; i++) {
            for (int j = 0; j < ARRAY2d[0].length; j++) {
                System.out.print(ARRAY2d[i][j] + " ");
            }
            System.out.println();
        }
        printSprial(ARRAY2d);
    }

    private static void printSprial(int[][] ARRAY2d) {
        int starting_ROW =0;
        int starting_COL = 0;
        int ending_ROW = ARRAY2d.length-1;
        int ending_COL = ARRAY2d[0].length-1;

        while (starting_ROW <=ending_ROW && starting_COL <=ending_COL){
            // top
            for (int j = starting_COL; j <= ending_COL; j++) {
                System.out.print(ARRAY2d[starting_ROW][j]+" ");
            }
            //right

            for (int i = starting_ROW+1; i <= ending_ROW; i++) {
                System.out.print(ARRAY2d[i][ending_COL]+ " ");
            }
            //bottom
            for (int j = ending_COL-1; j >= starting_COL; j--) {
                if(starting_ROW == ending_ROW){
                    break;
                }
                System.out.print(ARRAY2d[ending_ROW][j]+ " ");
            }
            // left
            for (int i = ending_ROW; i<= starting_ROW+1 ; i--) {
                if (starting_COL == ending_COL){
                    break;
                }
                System.out.print(ARRAY2d[i][starting_COL]);
            }

            starting_COL++;
            starting_ROW++;
            ending_COL--;
            ending_ROW--;

        }
    }
}
