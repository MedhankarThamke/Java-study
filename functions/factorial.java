package functions;
import java.util.*;
public class factorial {
    public static int fact(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the num=");
        int num1=sc.nextInt();
        int answer=fact(num1);
        System.out.println("factorial of "+num1+" is "+answer);
        sc.close();
    }
}
