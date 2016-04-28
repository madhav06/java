

public class singleForLoop
{
    public static void singleForLoop(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(String.format("Square of %s is %s", i, Math.pow(i,2.0)));
        }
    }
}
