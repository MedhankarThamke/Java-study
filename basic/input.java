package basic;

import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        //only store upto the first space
        // String input =s.next();

        // System.out.println(input);

        String name= s.nextLine();
        System.out.println(name);
        s.close(); 
    }
}
