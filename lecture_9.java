package ALPHA_BATCH;

public class lecture_9 {
    public static void main(String[] args) {
        // define  array in different type

        // datatype array_name[] = new datatype[size];

        int marks[] = new int[20];
        for(int i=0;i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        int number[] = {1,2,3};
        for(int i=0;i<number.length; i++){
            System.out.println(number[i]+" ");
        }
        int[] new_number = {4,6,7};
        for (int j : new_number) {
            System.out.println(j + " ");
        }
        String name[] = {"shivam", "raju", "rastogi"};
        for(String i: name){
            System.out.println(i+ " ");
        }

    }
}
