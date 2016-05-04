

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
    int a=sc.nextInt();
    int b=sc.nextInt();
    int n=sc.nextInt();
    int ans=a;
    for(int i=0;i<n;i++)
    {
     ans+=(int)Math.pow(2,i)*b;   
     if(i==n-1)
        System.out.println(ans+" "); 
     else
        System.out.print(ans+" ");
    }
    t--;       
    
    }  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}