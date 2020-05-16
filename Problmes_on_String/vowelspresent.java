/* 
 * Author:Kalpana Baigar
 * 
 *Program to Accept string from user and check wether vowel is present or not
 * 
 * */

package str;                               
import java.util.Scanner;
import java.io.*; 

 class math
{
	boolean display(String arr)
	{
		for(int i=0;i<arr.length();i++)
		{
			
		
			if( (arr.charAt(i)=='a') || (arr.charAt(i)=='e') || (arr.charAt(i)==('i')) ||( arr.charAt(i)==('o')) || (arr.charAt(i)=='u') )
			{
				return true;
			}
			
			
			
			
		}
	    return false;
	}

	private char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

 class string 
{
	public static void main(String args[])
	{
		String str;
		boolean ret;;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter string");
		str=sobj.nextLine();
		
		System.out.println("you entered string is:"+str);
		
	  
		
		math obj=new math();
		ret=obj.display(str);
		
		if(ret==true)
		{
		  System.out.println("vowelse are present");
		} 
		else
		{
			System.out.println("vowels are not present");	
		}
	}
	
}
