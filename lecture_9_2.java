package ALPHA_BATCH;


import java.util.Scanner;

public class lecture_9_2 {
    // linear search
    public static int linear_search(int number[], int key){
        for(int i=0; i<number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number = {2,3,4,12,345,56,78,42,43,23,46,677};
        int key = 21;
        int index = linear_search(number, key);

        if(index == -1){
            System.out.println("ki hame luda kuch nahi mila");

        }else{
            System.out.println("ki maderchod is index pe hai  " + index
                    +" is mederchod ki ki value ye hai "+ number[index]);
        }
    }

}
