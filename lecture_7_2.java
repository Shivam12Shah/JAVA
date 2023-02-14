package ALPHA_BATCH;
//binomial cofficient
//In mathematics, the binomial coefficients are the positive integers
// that occur as coefficients in the binomial theorem
public class lecture_7_2 {
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int value = bino_cofficient(n,r);
        System.out.println(value);
    }
    public  static int bino_cofficient(int n, int r){
        // factorial of first number which is n!
        int n_factorial = 1;
        for(int i=1; i<=n; i++){
            n_factorial*=i;
        }
        // factorial of second number which is r!
        int r_factorial =1;
        for(int i=1; i<=r; i++){
            r_factorial*=i;
        }
        // created new variable for dividing value
        int n_r_factorial = 1;
        int n_r = n-r;
        for(int i=1; i<=n_r; i++){
            n_r_factorial*=i; // storing values in them
        }
        // and return them
        return n_factorial/(r_factorial*n_r_factorial);
    }
}
