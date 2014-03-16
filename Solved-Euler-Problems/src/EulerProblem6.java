//Miguel Dickson
//3-16-2014
//Euler Problem 6
//Returns the difference between the square of the sums of 1 to x and the sum of the squares of 1 to x.

public class EulerProblem6 {

	public static void main(String[] args) {
		long result = 0;
		result = diffSSes(100);
		System.out.println("The difference for 100 is: " + result);

	}
	
	public static long diffSSes (long x){
		return (squareSum(x) - sumSquare(x));
	}
	
	
	
	public static long sumSquare(long x){
		long result =0;
		for (int i=1; i<=x; i++)
		{
			result+= (i*i);
		}
		System.out.println(result);
		return result;
	}
	
	
	public static long squareSum(long x){
		long result =0;
		for (int i=1; i<=x; i++)
		{
			result+=i;
		}
		result *=result;
		System.out.println(result);
		return result;
	}

}
