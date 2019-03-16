package classpack;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		System.out.println("Enter Integer : ");
		int num = new Scanner(System.in).nextInt();
		int i,ip,isprime;
		double p;
		for(p=2;p<=num;p++)
		{
			isprime =1;
			ip = (int) Math.sqrt(p);
			
			
			for(i=2;i<=ip;i++)
			{
				if(p % i == 0)
				{
					isprime=0;
					break;
				}
			}
			if(isprime==1)
			{
				System.out.println((int)p);
			}
		}

	}

}
