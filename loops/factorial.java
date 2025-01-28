package loops;
import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        //1
        int num=sc.nextInt();
        int fact=1;
        if(num==0){
            System.out.println("your factorial is 1");
        }else{
            for(int i=1;i<=num;i++){
                fact*=i;
            }
        }
        System.out.println("your factorial is "+fact);
        System.out.println("/-------------------------/");

        //2
        int num2=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num2+"*"+i+"="+num2*i);
        }

        sc.close();
    }
    
}
