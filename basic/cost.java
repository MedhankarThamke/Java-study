package basic;

import java.util.*;
public class cost {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float pencil=s.nextFloat();
        float pen=s.nextFloat();
        float eraser=s.nextFloat();
        float sum=pencil+pen+eraser;
        float gst=0.18f*sum;
        System.err.println("With gst the total price=");
        System.out.println(sum+gst);
        s.close();

    }
}
