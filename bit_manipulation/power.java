// check if the num is power of two or not
// 4,8 is power of two but not 5,7

public class power {
    public static boolean isPowerOfTwo(int num) {
        return (num & num - 1) == 0 ? true : false;
    }

    // count set bit
    public static int countSetBit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;

            }
            num = num >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = a * ans;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(countSetBit(16));
        System.out.println(fastExpo(3, 5));
    }
}
