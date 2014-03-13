import java.util.ArrayList;

//Miguel Dickson
//3-13-2014
//Find the sum of the even-valued Fibonnaci numbers of value less than highest_val (in this case 4,000,000)
//Adjust 


public class EulerProblem2 {

	public static void main(String args[]){
		
		long highest_val = 4000000;
		ArrayList<Long> Fibnumbers = new ArrayList<Long>();
		Fibnumbers = calcFibNumbers(highest_val);
		long result = 0;
		result = addEvenFibs(Fibnumbers);
		System.out.println(result);
		
	}
	
	
	
	//Calculates the sum of all the even-valued Fibonnaci numbers
	public static long addEvenFibs (ArrayList<Long> fibArray)
	{
		long result =0;
		for (int i =2; i<fibArray.size()-1; i+=3)
		{
			result+= fibArray.get(i);
		}
		return result;
	}
	
	
	//Calculates Fibonnaci numbers until it reaches highest_val, stores them in an ArrayList, and returns that ArrayList
	public static ArrayList<Long> calcFibNumbers (long highest_val)	{
		ArrayList<Long> fib = new ArrayList<Long>();
		long current_Fib = 0;
		int i=0;
		while(current_Fib < highest_val)
		{
			current_Fib = Fib(fib, i);
		    i++;
		}
	
		return fib;
		
	}
	
	//Calculates the given Fibonnaci number by either definition (n ==0 or n==1) or by the formula Fib(n) = Fib(n-1)+Fib(n-2).
	//NOTE: THIS FUNCTION WILL FAIL IF ASKED TO CALCULATE A FIBONNACI NUMBER WHERE (n-1) and (n-2) are not correctly calculated first
	//I.e. This is a convenience function for generating the array of fibonnaci numbers.
	public static long Fib(ArrayList<Long> fibArray, int n)
	{
		if (n==0 || n==1)
		{
			fibArray.add((long)1);
			return 1;
		}
		else
		{
			fibArray.add(fibArray.get(n-1)+fibArray.get(n-2));
			return (fibArray.get(n-1)+fibArray.get(n-2));
		}
			
	}

}
