package patterns_2;
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
public class numTri {
    public static void zeroOneTriangle(int line){
        for(int i=1;i<=line;i++){
            
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    // checking if the i+j is even
                    // using matrix
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        zeroOneTriangle(5);
    }
}
