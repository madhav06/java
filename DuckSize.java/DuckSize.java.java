/* package codechef; // don't place package name! */


public class Duck {
    int size;
    
    public Duck(int duckSize) {
        System.out.println("Quack");
        
        
        size = duckSize;
        
        System.out.println("size is " + size);
        
    }
    
}



public class UseADuck {
    public static void main(String[] args) {
        Duck d = new Duck(42);
    }
}