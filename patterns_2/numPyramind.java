package patterns_2;
//      12345
//      1234
//      123
//      12
//      1
public class numPyramind {
    public static void numPyr(int n){
        // outer loop for lines
        for(int i=1;i<=n;i++){

            //for printing number
            for(int j=1;j<=n-i+1;j++){
                //here j<=n-i+1 is important for printing num in proper sequence as given
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        numPyr(6);
    }
}
