

public class nestedForLoop
{
    public static void nestedForLoop(int n) {
        for(int i = 0; i< n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(String.format("Product of %s and %s is %s", i, j, i * j));
            }
        }
    }
}
