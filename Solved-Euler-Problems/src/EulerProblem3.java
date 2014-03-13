import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

//Miguel Dickson
//3-13-2014

//Finds the largest prime factor of a given number (through the first 10,000 primes). 
//Locally uses a slightly modified version of http://primes.utm.edu/lists/small/10000.txt
	


public class EulerProblem3
{

	public static void main(String[] args) 
	{
        long target =0;
        long largestprime =0;
        largestprime = 600851475143L; //As per Euler problem 3
		ArrayList<Long> primeArray = new ArrayList<Long>();
		scanPrimes(primeArray);
		target = largestPrimeFactor(primeArray, largestprime);
		System.out.println("Result = " + target);		
		
	}
	
	//Calculates the largest PrimeFactor of (number) iteratively by checking the first 10,000 primes. Not a good approach except that this is a relatively small prime and the list makes the
	//memory-speed tradeoff trivial.
	
	public static long largestPrimeFactor (ArrayList<Long> primes, long number)
	{
			long result = 0;
			for (int i=0; i<=9999; i++)
			{
			//	System.out.print(number + " divided by " + primes.get(i));
				if (number % primes.get(i)==0)
				result = primes.get(i);				
			}
			return result;
	}
	
	//Pulls primes from "primes.txt" within subdirectory "primes". Modify accordingly.
	public static void scanPrimes(ArrayList<Long> primes)
	{
		
	try {
			Path p1 = FileSystems.getDefault().getPath("c:/eulermisc/primes.txt");
			System.out.println(p1.toString());			
			Scanner scanit = new Scanner(p1);
			while (scanit.hasNext())
			{
			String x = scanit.next();
			System.out.println(x);
			Long prime = Long.parseLong(x);
			primes.add(prime);
			}
			scanit.close();
		}
			
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
