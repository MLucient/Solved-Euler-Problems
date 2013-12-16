//Miguel Dickson
//12-16-2013
//~3:40 PM


import javax.*;

public class EulerProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, total=0;		
		x = sum_multiples(3, 5, 1000);
		y = sum_multiples(5, 3, 1000);
		z = both_multiples(3, 5, 1000);
		total = x + y + z;
		System.out.print(x);
		System.out.print("\n");
		System.out.print(y);
		System.out.print("\n");
		System.out.print(z);
		System.out.print("\n");
		System.out.print(total);
	}

	/*
	 * This method calculates the sum of the multiples of int x that are not also multiples of y, through range z.
	 */
	public static int sum_multiples (int x, int y, int z){
		
		int sum = 0;
		for (int i=0; i< z; i+=x)
		{
			if ((i % y) != 0)
			{
				sum+=i;
			}
		}
		
		return sum;
	}
	
	
	/*
	 * This method calculates the sum of the multiples of int x and int y, through range z.
	 */
	
	public static int both_multiples (int x, int y, int z)
	{
		int sum = 0;
		for (int i=0; i< z; i+=x)
		{
			if ((i % y) == 0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
}