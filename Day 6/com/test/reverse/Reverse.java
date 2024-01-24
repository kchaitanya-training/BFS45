package com.test.reverse;

import java.util.ResourceBundle;

public class Reverse{
   void reverse(String s) {
       char[] chr = s.toCharArray();
       for (int i = chr.length - 1; i >= 0; i--) {
           System.out.print(chr[i]);
       }
   }
   public static void main(String[] args){
       String s = "Hello123";
       Reverse r = new Reverse();
       r.reverse(s);
   }
}

