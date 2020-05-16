/* 
 * Author:Kalpana Baigar
 * 
 *Program to Accept string from user and reverse a string
 * 
 * */

package str;                               
import java.util.Scanner;
import java.io.*; 

 class math
{
	void display(String arr)
	{
		
		  
		  StringBuffer a = new StringBuffer(arr);
		  System.out.println("\nReverse of string is:"+a.reverse());
			
			
		
	   
	}

	
}


 class string 
{
	public static void main(String args[])
	{
		String str;
		
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter string");
		str=sobj.nextLine();
		
		System.out.println("\nyou entered string is:"+str);
		
	  
		
		math obj=new math();
		obj.display(str);
		
		
	}
	
}
