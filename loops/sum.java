package loops;
import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int i=0;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("sum of first "+n+" number is "+sum);
        s.close();
    }
}
