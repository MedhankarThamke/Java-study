package functions;
public class funcOverloading {
    //1st function
    public static int sum(int a, int b, int c ){
        return a+b+c;
    }
    //2nd function
    public static int sum(int a, int b){
        return a+b;
    }
    //3rd function
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(2.4f,2.5f));
    }
    
}
