
import java.util.*;
public class ScannerPractice
{
    static Scanner key = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println("Tell me your name please..");
        String a = key.nextLine();
        
        System.out.println("Tell me your age");
        int b = key.nextInt();
        
        System.out.println("Tell me your height");
        double c = key.nextDouble();
        
        
        System.out.println("Your name is " + a +  ", Your age is " + b + ", Your height is " + c) ;
    }
}
