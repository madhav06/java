
 
public class simpleFunction
{
    public static void simpleFunction(int n) {
        int a = 9;
        int b = 3;
        
        int sum = a + b + n;
        int product = a * b *n;
        int quotient = a * n/b;
        
        System.out.println(String.format(
                "The sum is: %s, product is: %s and quotient is: %s", sum, product, quotient));
    }
}
