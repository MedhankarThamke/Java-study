package basic;
import java.util.*;
public class area {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius of the circle=");
        float r= s.nextFloat();
        float a= 3.14f*r*r;
        System.out.println(a);
        s.close();
    }
}
