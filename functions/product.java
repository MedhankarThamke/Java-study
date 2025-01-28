package functions;
import java.util.*;

public class product {
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int productOfTwo=mul(a,b);
        System.out.println("a * b="+productOfTwo);
        sc.close();
    }
}
