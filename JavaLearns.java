import java.util.*;
public class JavaLearns {
  public static void main(String[] args)
  {
    calculateValues();
  }

  static void calculateValues(){

    int a;
    Random rn = new Random();
    a = 1+Math.abs(rn.nextInt()%6);
    System.out.print("The reult: "+a);
  }
}
