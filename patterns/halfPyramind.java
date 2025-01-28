package patterns;

public class halfPyramind {
    public static void main(String args[]){
        int n=7;
        for(int line=1;line<=n;line++){
            for(int nums=1;nums<=line;nums++){
                System.out.print(nums);
            }
            System.out.println();
        }
    }
}
