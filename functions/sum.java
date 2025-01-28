package functions;
import java.util.*;
public class sum {
    public static int sum1(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result= sum1(a, b);
        System.out.println(result);
        sc.close();
    }
    
}
