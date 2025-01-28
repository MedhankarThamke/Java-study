package sixth;
import java.util.*;;
public class decToBin {
    public static void decToBinary(int a){
        int num=a;
        int pow=0;
        int bin=0;
        while (a>0) {
            int rem=0;
            rem=a%2;
            //remainder is stored if num is divided by 2
            bin=bin+rem*(int)Math.pow(10, pow);
            //here binary num is formed
            pow++;
            a/=2;
        }
        System.out.println("binary of "+num+" is "+bin);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal no=");
        int num=sc.nextInt();
        decToBinary(num);
        sc.close();
    }
}
