//Miguel Dickson
//3/15/2014
//Finds the smallest positive number evenly divisible by the integers from 1 to x
//(Euler Problem asks for x=20)

public class EulerProblem5 {

	public static void main(String[] args) {
		long result = 0;
		result = calculateDivNumber(20);
		System.out.println("The smallest positive integer evenly divisible by the integers from 1 to 20 is: " + result);
		

	}
	
	public static long gcd (long a, long b)
	{
		if (b == 0)
			return a;
		else
			return gcd(b, a%b);
		
	}
	
	public static long lcm (long a, long b)
	{
		return ((a * b) / gcd(a,b));
	}
	
	//Calculates the smallest positive number evenly divisible by all the integers to x
	public static long calculateDivNumber(int x)
	{
		long result = 1;
		for (int i=1; i<x; i++)
		{
			result = lcm(result, i);
		}
		
		return result;
	}

}
