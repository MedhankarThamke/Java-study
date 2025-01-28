package patterns;

public class starTwo {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int star=1;star<=n-i+1;star++){
                //n-i+1 is required for printing if line is 1: 5-1+1
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n;i++){
            for(int star=1;star<=i;star++){
                for(int space=1;space<n-i+1;space++){
                    System.out.print(" ");
    
                }
                System.out.print("*");
            }
            System.out.println();
            

        }
    }   
}
