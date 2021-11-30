//Write a Java program to perform basic Calculator operations.

package mainpackage;
import java.util.Scanner;
public class Program1
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice,m;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Addition 2.Subtraction 3.Multiplication 4.Division ");
		
		do
		{
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:Addition();
				break;
			case 2:Subtraction();
				break;
			case 3: Multiplication();
				break;
			case 4:Division();
				break;
			default:System.out.println("Select the valid operation");
			}
			System.out.println("Do you want to proceed further if yes press 1:");
			m=sc.nextInt();
			
		}while(m==1);
	}
	public static void Addition()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for addition");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1+num2;
		System.out.println("Addition is:"+ans);
	}
	public static void Subtraction()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for subtraction");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1-num2;
		System.out.println("Subtraction is:"+ans);
	}
	public static void Multiplication()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for multiplication");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1*num2;
		System.out.println("Multiplication is:"+ans);
	}
	public static void Division()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for Division");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1/num2;
		System.out.println("Division is:"+ans);
	}
}
