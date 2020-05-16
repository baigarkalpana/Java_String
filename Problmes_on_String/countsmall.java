/* 
 * Author:Kalpana Baigar
 * 
 *Program to Accept string from user and count no of small characters
 * 
 * */

package str;                               
import java.util.Scanner;
import java.io.*; 


public class string 
{
	public static void main(String args[])
	{
		String str;
		int cnt=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter string");
		str=sobj.nextLine();
		
		System.out.println("you entered string is:"+str);
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				cnt++;
			}
		}
		
		System.out.println("Number of small characters are:"+cnt);
		
		
		
		
	}
	
}
