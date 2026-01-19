// How to swap two numbers without using a third variable?

import java.util.*;
public class Swap
  {
   
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        
  System.out.println("after swapping");
  a=b+a;
   b=a-b;
   a=a-b;
  System.out.println(a);
   System.out.println(b);
  }
  }
