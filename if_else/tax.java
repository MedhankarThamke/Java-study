package if_else;
import java.util.*;

public class tax {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        float income= s.nextFloat();
        float tax;
        if (income<500000){
            tax=0;
        }
        else if(income>500000 && income<700000){ tax=(float) 0.2*income;}
        else{
            tax=(float) 0.3*income;
        }
        System.out.println("your tax"+tax);
        s.close();
    }
}
