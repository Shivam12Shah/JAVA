package ALPHA_BATCH;

public class lecture_12 {
    public static void main(String[] args) {
        String str = "babab";

        isPalindrome(str);

    }

    private static void isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("not a palindrome");
                break;
            }
        }
        System.out.println("is palindrome");
    }
}