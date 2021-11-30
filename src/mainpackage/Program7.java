//Write a Java Program to reverse the letters present in the given String.
package mainpackage;
import java.util.*;
public class Program7 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str,reverse="";
		System.out.println("Enter the string you want to reverse:");
		str=sc.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed string is:"+reverse);
	}

}
