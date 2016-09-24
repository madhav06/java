/*program to print random numbers 
between integer 1 and 6
*
*/
import java.util.*;
public class JavaLearns {
  public static void main(String[] args)
  {
    calculateValues();//mrthod used to evaluate the random number
  }

  static void calculateValues(){

    int a;
    Random rn = new Random();//Constructor
    a = 1+Math.abs(rn.nextInt()%6);//math library used
    System.out.print("The reult: "+a);
  }
}
