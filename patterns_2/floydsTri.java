package patterns_2;

public class floydsTri {
    public static void triangle(int line){
        int num=1;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        triangle(5);
    }
}
