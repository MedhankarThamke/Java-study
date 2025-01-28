package patterns_2;

public class rhombus {
    public static void rhom(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhom(4);
    }
}
