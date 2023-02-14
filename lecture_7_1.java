package ALPHA_BATCH;

// factorial


public class lecture_7_1 {
    public static void main(String[] args) {
        int num = 7;
        int value = factorial(num);
        System.out.println(value);
    }

    // function that give factorial
    public static int factorial(int num) {
        int f =1;
        for(int i=1; i<=num; i++) {
            f *= i;  // 1*1, 1*2, 2*3 and so on
            System.out.println(f);
        }
        return 2;
    }
}
