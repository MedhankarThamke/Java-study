package patterns_2;

public class hollowRhombus {
    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-1);j++){
                System.out.print(" ");
            }

            //hollow rectangle pattern
            for(int j=1; j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

    }
}
