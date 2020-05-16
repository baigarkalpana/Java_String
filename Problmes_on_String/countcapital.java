/* 
 * Author:Kalpana Baigar
 * 
 *Program to count no of capital characters
 * 
 * */

package str;                               
import java.util.*;

public class string 
{
	public static void main(String args[])
	{
		String str ="Marvellous Multi Os";
	  	
        System.out.println("your entered string is:"+str);
	    
        int cnt=0;
        
        for(int i=0;i<str.length();i++)
        {
          if(Character.isUpperCase(str.charAt(i))) 

        	{
        		cnt++;
        	}
        }
	
        
       System.out.println("Number of capital characters are:"+cnt);	
	
	
	
	
	
	}
	
	
}
