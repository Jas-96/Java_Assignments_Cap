import java.util.*;
class Increase
{
	public static boolean check(int num)
	{
		boolean flag=false;
	   int curr=num % 10;
	   num = num/10;
	   while(num>0)
	   {
		   if(curr <= num % 10)
		   {
			   flag = true;
			   break;
		   }
		   curr=num % 10;
		   num = num/10;
	   }
		if(flag)
			return true;
		else
			return false;
	}
	public static void main(String arg[])
	{
		System.out.print("Enter Integer Value : ");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		boolean b=Increase.check(n);
		if(b==true)
			System.out.println(n+" is not an Increasing number");
		else
			System.out.println(n+" is an Increasing number");
	}
}