package if_else;
import java.util.*;

public class two {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if (num%2==0) {
            System.out.println("even no");
        } else {
            System.out.println("odd");
        }
        s.close();
    }
}
