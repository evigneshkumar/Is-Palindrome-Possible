import java.io.*;
import  java.util.*;

class UserMainCode
{

	public static int isPalinNumPossible(int input1)
{
		int count = 0,c=0;
		ArrayList<Integer> x= new ArrayList<Integer>();
		String x1=new StringBuffer(""+input1).reverse().toString();
		if(x1.equals(""+input1))
		{
			return 2;
		}
		else
		{
	while(input1>0)
	{
		x.add(input1%10);
		input1=input1/10;
	}
    	for(Integer i:x)
		{
		c=Collections.frequency(x,i);
		if(c%2!=0)
			count++;
		}
	
		if(count>1)
			return 1;
		else 
			return 2;
		}
}
public static void main(String a[])
{
int pal;
Scanner sc= new Scanner(System.in);
int input1=sc.nextInt();
pal=isPalinNumPossible(input1);
if(pal==1)
System.out.println("Cannot form a palindrome");
else
System.out.println("Can form a palindrome");
}
}