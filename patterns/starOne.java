package patterns;
public class starOne {
    public static void main(String args[]){
        for (int i=1; i<=5;i++){
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println( );
        }

    }
    
}