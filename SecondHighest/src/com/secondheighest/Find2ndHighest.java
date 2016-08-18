package com.secondheighest;

import java.util.Arrays;
//import java.util.TreeMap;

public class Find2ndHighest {

//}


////public class Find2ndHighest {
    public static void main(String[] args) {
        //int b[] = {2,3,1,0,5};

       // TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>();
        //for(int i = 0; i<b.length;i++){
           // tree.put(b[i], 0);
        //}
       // System.out.println(tree.floorKey(tree.lastKey()-1));
    //}
//}



int b[] = {2,3,1,0,5};
Arrays.sort(b);
System.out.println("Second Highest no. is: "+b[b.length-2]);
//System.out.println(b[b.length-5]);
    }
}





