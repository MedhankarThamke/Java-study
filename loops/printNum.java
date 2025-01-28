package loops;
import java.util.*;
public class printNum{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        int counter=1;

        while (counter<=n) {
            System.out.println(counter);
            counter++;
        }
        s.close();
    }
}

