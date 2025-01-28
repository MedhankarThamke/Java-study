package functions;
public class primeRange {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void numRange(int num){
        for(int i=2;i<=num;i++){
            if (isPrime(i)==true){
                System.out.print(i+" ");
                //check if i is prime using the helper function and if its prime then we print the num
            }
        }
    }
    public static void main(String args[]){
        numRange(30);
    }
    
}
