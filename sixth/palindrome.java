package sixth;
import java.util.*;
public class palindrome {
    public static void checkPalindromity(int n){
        int myNum=n;
        int reverse=0;
        
        while (n>0) {
            //using this we have reversed the number
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n/=10;
        }
        System.out.println("Reverse of the "+myNum+" is "+reverse);
        if (myNum==reverse) {
            //here we are checking if the reversed num is equal to initial num or not
            System.out.println("Given num is palindrome");
        }else{
            System.out.println("given no is not a palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num=");
        int number=sc.nextInt();
        checkPalindromity(number);
        sc.close();
    }
}
