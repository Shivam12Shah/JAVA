package ALPHA_BATCH;

public class lecture_9_3 {
    public static int get_largest(int number[]){
        int largest = Integer.MIN_VALUE; // - infinity sabse pahle toh usko sabse bada bana denga
        int smallest = Integer.MAX_VALUE; // + infinity sbase pahle usko sabse bada bana denga
        for(int i=0; i< number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest >number[i]){
                smallest = number[i];
            }
        }
        System.out.println("the smallest value is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        // lagest number in array
        int [] number ={2,3,34,47,9};
        System.out.println("the largest value is "+ get_largest(number));
    }
}
