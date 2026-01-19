// How to reverse a String in Java without using reverse () function?

import java.util.*;
public class Reverse
  {
    public static void main(String args[])
    {
      
    String name="AJIT";
    for(int i=name.length()-1;i>=0;i--)
  {
    char reverse=name.charAt(i);
    System.out.println("reverse string is :"+reverse);
  }
    }
  }
    
  
    
