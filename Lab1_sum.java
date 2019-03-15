import java.util.*;
class Sum	
{
	public int calculateSum(int n)
	{
		int total=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				total=total+i;
			}
		}
		return total;
	}
}
class Test
{
	public static void main(String arg[])
	{
		System.out.print("Enter Integer Value : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Sum s1 =new Sum();
		System.out.println("sum of first n natural numbers which are divisible by 3 or 5 is : "+s1.calculateSum(num));
	}
}