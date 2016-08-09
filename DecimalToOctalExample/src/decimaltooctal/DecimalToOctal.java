package decimaltooctal;

//public class DecimalToOctal {

	import java.util.Scanner;
	class DecimalToOctalExample
	{
	  public static void main(String args[])
	  {
	    Scanner input = new Scanner( System.in );
	    System.out.print("Enter a decimal number : ");
	    int num =input.nextInt();
	 
	    /* Method 1: 
	     * Using predefined method toOctalString(int)
	     * Pass the decimal number to this method and
	     * it would return the equivalent octal number
	     */
	    String octalString = Integer.toOctalString(num);
	    System.out.println(" Decimal to octal: " + octalString);
	 
}
	}
