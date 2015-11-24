package StrToInt;


class Solution3
{
   public int myAtoi(String str) 
   {
	   double result=0;
	   try{
		    if(str.length()==0 || str==null)
		    return 0;
		    
		    str=str.trim();
		    char flag='+';
		    int i=0;
		    
		    if(str.charAt(i)=='-')
		    {
		        flag='-';
		        i++;
		    }
		    else if(str.charAt(i)=='+')
		    {
		        flag='+';
		        i++;
		    }
		    
		    while(i<str.length() && str.charAt(i)>= '0' && str.charAt(i)<='9')
		    {
		        result=result*10+(str.charAt(i)-'0');
		        i++;
		    }
		    
		    if(flag=='-')
		    	result=-result;
		    
		    if( result > Integer.MAX_VALUE)
		    {
		    	return Integer.MAX_VALUE;
		    }
		    
		    else if (result< Integer.MIN_VALUE)
		    {
		    	return Integer.MIN_VALUE;
		    }
		    return (int)result;		    		    
	   }
	   catch(NumberFormatException nfe)
	   {
		   
	   }
		   return (int)result;
   
    }
}
   	    


public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 s=new Solution3();
		int number=s.myAtoi("2147483648");
		System.out.println(number);
	}

}


