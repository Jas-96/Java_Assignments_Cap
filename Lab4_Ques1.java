import java.util.Scanner;

class Labques {
	public int sumOfCubes(int n)
	{
		int sum=0;
		while(n>0)
		{
			int c=n%10;
			sum=sum+(c * c * c);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Labques l = new Labques();
		System.out.println("sum of the cubes of the digits of number is : "+l.sumOfCubes(num));
	}

}
