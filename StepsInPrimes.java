
public class StepsInPrimes {
	
	public static long[] StepInPrimes(long g, long m, long n)
	{
		for(long i = m; i <= n; i++)
		{
			if(isPrime(i))
			{
				if(isPrime(i+g))
					return new long[]{ i, i+g};
			}
		}
		
		return null;
	}

	public static boolean isPrime(long num)
	{
		if(num == 2)
			return true;
		else if(num % 2 == 0)
			return false;
		else
			for(int i = 3; i * i <= num; i++)
			{
				if(num % i == 0)
					return false;
			}
					
		return true;
	}
	
	public static void main(String[] args) {
		
	}

}
