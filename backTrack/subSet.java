package backTrack;

//i/p -- "abc"
//o/p--abc, a,b,c, ab,ac,bc, ''
public class subSet {
    public static void findSubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);

            }
            return;
        }
        // recursion
        // yes choice
        findSubset(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubset(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = new String("abc");
        findSubset(str, "", 0);
    }
}
