//Write a Java program to remove elements from an ArrayList

package mainpackage;
import java.util.*;

public class Program9 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println("Array before deletion:");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("Removing 1st element from ArrayList");
		a.remove(1);
        System.out.println("Array After deletion:");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	
	}
	
	

}
