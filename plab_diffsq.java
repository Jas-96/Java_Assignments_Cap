import java.util.*;
import java.lang.Math;
class Difference
{
	public static int calDiff(int num)
	{
		int sumofsq=0, sqofsum=0;
		for(int i=1;i<=num;i++)
			sumofsq+=i*i;
		for(int i=1;i<=num;i++)
			sqofsum+=i;
		return(sumofsq-(sqofsum*sqofsum));
	}
	public static void main (String arg[])
	{
		System.out.print("Enter Integer Value : ");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		System.out.println("Difference between the sum of the squares of the first n natural numbers and the square of their sum is : "+Math.abs(Difference.calDiff(n)));
	}
}