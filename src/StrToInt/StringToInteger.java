package StrToInt;
import java.io.*;
 class Solution {
    public int myAtoi(String str) {
    	  int k=0;
    	  try{
            if(str=="")
            return 0;
       else{
    	 
           String numOnly = str.replaceAll("\\p{Alpha}","");
           String s=String.valueOf(numOnly);
             k=Integer.parseInt(s.trim());
           }
        }
        catch(NumberFormatException nfe)
        {
            //System.out.println("Number Format Exception:"+nfe.getMessage());
        }
        return k;
    }
    

    }



public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s=new Solution();
		int number=s.myAtoi("  -0012a3");
		System.out.println(number);
	}

}
