/* 
 * Author:Kalpana Baigar
 * 
 *Program to Accept string from user and return the difference between frequency of small characters and frequency of capital characters
 * 
 * */

package str;                               
import java.util.Scanner;
import java.io.*; 

 class math
{
	int display(String arr)
	{
		int capital=0,small=0;
		for(int i=0;i<arr.length();i++)
		{
			
			
			if(Character.isUpperCase(arr.charAt(i)))
			{
				capital++;
			}
			else if(Character.isLowerCase(arr.charAt(i)))
			{
				small++;
			}
		}
		
		System.out.println("capital is:"+capital);
		System.out.println("small letter is:"+small);
		
		return(capital-small) ;
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
		int ret=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter string");
		str=sobj.nextLine();
		
		System.out.println("you entered string is:"+str);
		
	  
		
		math obj=new math();
		ret=obj.display(str);
		
		System.out.println("difference between frequency of small and capital character is:"+ret);
		
	}
	
}
