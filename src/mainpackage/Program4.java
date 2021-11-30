//Write a Java program to find out whether the given String is Palindrome or not.

package mainpackage;
import java.util.*;
public class Program4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str,reverse="";
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string you want to check");
		str=sc.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("Your string is Palindrome");
			
		}
		else
		{
			System.out.println("Your string is not palindrome");
		}
	}

}
