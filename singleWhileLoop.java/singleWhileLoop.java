
public class singleWhileLoop
{
    public static void singleWhileLoop(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(String.format("Square of %s is %s", i, Math.pow(i,2.0)));
            i++;
        }
    }
}
