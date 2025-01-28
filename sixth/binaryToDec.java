package sixth;
public class binaryToDec {
    public static void binToDec(int bin){
        int myNum=bin;
        int pow=0;
        int dec=0;
        while(bin>0){
            int lastdigit=bin%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            //Math.pow return the double value so typecast this
            pow++;
            bin/=10;
        }
        System.out.println("decimal of the "+myNum+" is "+dec);
    }
    public static void main(String args[]){
        binToDec(101);
    }
    
}