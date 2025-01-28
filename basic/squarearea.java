package basic;

import java.util.*;
public class squarearea {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the side of square=");
        float side= s.nextFloat();
        float area=side*side;
        System.out.println(area);
        s.close();

    }
}
