import java.util.Scanner;

class Lab {

	private static Scanner s;
	public int fibo(int n)
	{
		if(n==0 )
			return 0;
		else if(n==1){
			return 1;
		}
		else
		{
			return (fibo(n-1)+fibo(n-2));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the nth number in fibonacci series : ");
		s = new Scanner(System.in);
		int num = s.nextInt();
		Lab l = new Lab();
		System.out.println("The nth number in fibonacci series is "+l.fibo(num));

	}

}