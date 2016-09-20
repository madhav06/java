/* Write a program to declare 2 integer variables , a float variable , one String  variable. display their values on the screen.*/

import java.io.*;

public class JavaBasics
{

public static void main(String[] args){

printName();
}
static void printName(){

String pName = null;

try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter the name: ");
pName = br.readLine();
}
catch(  Exception e ){  }
System.out.print("Hello "+pName);
}
}
