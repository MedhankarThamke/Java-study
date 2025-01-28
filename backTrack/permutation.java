package backTrack;

public class permutation {
    public static void permutationList(String str1, String str2) {
        // base case
        if (str1.length() == 0) {
            System.out.println(str2);
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // recursion
            // abcde="ab"+"de"
            String newStr = str1.substring(0, i) + str1.substring(i + 1);
            permutationList(newStr, str2 + ch);
        }
    }

    public static void main(String args[]) {
        permutationList("abc", "");
    }
}
