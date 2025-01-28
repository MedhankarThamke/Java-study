package sixth;
import java.util.*;
public class average {
    public static float averageThree(int a, int b, int c){
        return (a+b+c)/3f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three  numbers=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("average is = "+averageThree(a, b, c));
        sc.close();
    }
}
