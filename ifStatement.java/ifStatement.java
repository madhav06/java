

public class ifStatement
{
    public static void ifStatement(int n) {
        if (n % 2 == 0) {
            System.out.println("The input is even");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Printing: " + i);
            }
        }
    }
}
