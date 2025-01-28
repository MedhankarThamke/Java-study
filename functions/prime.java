package functions;

public class prime {
    public static boolean isPrime(int n){
        boolean numberCon=true;
        for (int i=2;i<=n-1;i++){
            if (n%i==0) {//n is divisible by i
                numberCon=false;
                break;
            }
        }
        return numberCon;
    }
    public static void main(String args[]){
        System.out.println(isPrime(7));
    }
}
