import java.util.*;
import java.lang.*;
import java.io.*;
class Power
{
	public static boolean checkNum(int num)
	{
		if (num == 0) 
            return false; 
          
        while (num > 1) 
        { 
            if (num % 2 != 0) 
                return false; 
            num = num / 2; 
        } 
        return true;
	}
	public static void main(String arg[])
	{
		System.out.print("Enter Integer Value : ");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		boolean b=Power.checkNum(n);
		if(b==true)
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}
}