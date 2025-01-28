// package second;
package basic;

import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("*,+,-,/ choose operation");

        char operator=s.next().charAt(0);//here it is used to take char ip from user
        switch(operator){
            case '+':System.out.println(a+b);break;//""if used  we are gonna get error
            case '-':System.out.println(a-b);break;//""if used  we are gonna get error
            case '/':System.out.println(a/b);break;//""if used  we are gonna get error
            case '*':System.out.println(a*b);break;//""if used  we are gonna get error
            case '%':System.out.println(a%b);break;//""if used  we are gonna get error
            default:System.out.println("choose appropriate operation");
        }
        s.close();

    }
}
