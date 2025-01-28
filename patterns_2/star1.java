package patterns_2;
//              *
//             **
//            ***
//           ****
//          *****

public class star1 {
    public static void star(int line){
        for(int i=1;i<=line;i++){

            //for "space"
            for(int j=1;j<=line-i;j++){
                //line-1 for space limit in each line
                System.out.print(" ");
            }

            //for "*"
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        star(10);
    }
}
