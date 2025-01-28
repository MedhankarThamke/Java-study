package basic;

import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("enter a=");
        int a=s.nextInt();
        System.out.println("enter b=");
        int b= s.nextInt();
        int sum= a+b;
        System.out.println(sum);
        s.close();
    }
    
}
