package basic;

import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a b c=");
        float a= s.nextFloat();
        float b= s.nextFloat();
        float c= s.nextFloat();
        float av=(a+b+c)/3;
        System.out.println(av);
        s.close();
    }
}
