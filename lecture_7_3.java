package ALPHA_BATCH;

// convert from binary to decimal

public class lecture_7_3 {
    public static void main(String[] args) {
        bintoDec(1111);

    }
    public static void bintoDec(int binNum){
        // create new variable because we dont want to chane previous number
        int myNumber = binNum;
        int pow = 0; // intialize power with zero
        int decNum =0;  // decimal number intialize with zero
        while(binNum>0){  // checking that if binary number is greater then or not
            int lastDigit = binNum%10; // geting the remender and store in last digit

            decNum = decNum+(lastDigit*(int)(Math.pow(2,pow)));
            //decNum  now eqaual to  sum of decNUm  and lastdigit and power of 2
            pow++; // power ++
            binNum/=10; // remove the last digit from binary number
        }
        System.out.println("decimal of "+myNumber + " = "+decNum );
    }
}
