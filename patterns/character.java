package patterns;

public class character {
    public static void main(String args[]){
        int n=7;
        char c='A';
        for(int line=1;line<=n;line++){
            for(int ch=1;ch<=line;ch++){
                System.out.print(c);
                c++;
            }System.out.println();
        }
    }
}
