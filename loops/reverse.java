//reverse a number
package loops;
// import java.util.*;
import java.util.Scanner;

public class reverse {
   public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        while (num>0) {
            int lastdigit=num%10;//last digit
            System.out.print(lastdigit);
            num=num/10;//removing the last digit

    }
    s.close();
   } 
}
