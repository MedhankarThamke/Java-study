package patterns_2;

public class hollowRect {
    public static void hollowRectangle(int totRows, int totCol){
        //outer loop for row
        for(int i=1;i<=totRows;i++){
            //loop for column
            for(int j=1;j<=totCol;j++){
                //cell(i,j)

                //checking boundary
                if (i==1 || i==totRows || j==1 || j==totCol) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //to go on next line
            System.out.println();
        }
    }
    public static void main(String args[]){
         hollowRectangle(4, 6);
    }
}
