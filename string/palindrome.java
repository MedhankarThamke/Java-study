package string;

public class palindrome {
    public static boolean checkPalindrom(String str) {

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "medhankar";
        System.out.println(checkPalindrom(str));
        ;
    }
}
