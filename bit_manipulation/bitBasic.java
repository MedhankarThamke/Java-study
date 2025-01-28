// package bit_manipulation;

// we are checking if no is odd or even 
// through the bit manipulation
public class bitBasic {
    public static boolean isOdd(int num) {
        if ((num & 1) == 1) {
            return true;
        }
        return false;
    }

    public static void getIthBit(int num, int i) {
        int bitMask = 1 << i;
        if ((num & bitMask) > 0) {
            System.out.println("the " + i + "th bit of the num is 1");
        } else {
            System.out.println("the " + i + "th bit of the num is 0");
        }
    }

    public static void setIthBit(int num, int i) {
        int bitMask = 1 << i;
        int newNum = num | bitMask;
        System.out.println(newNum);
    }

    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        return num | bitMask;
    }

    public static int clearUptoIBit(int num, int i) {
        int bitMask = (~0) << i;
        return num & bitMask;
    }

    public static int clearIinRange(int num, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return num & bitMask;

    }

    public static void main(String args[]) {

        System.out.println(clearIinRange(10, 2, 7));
    }
}
