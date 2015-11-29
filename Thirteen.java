
public class Thirteen {

	public static long thirt(long n) {
		
		long value = n;
		int final_rem = (int) n, digit, i=0 , rem =0;
		int [] remainders = new int[]{1,10,9,12,3,4};
		
		while(value > 0)
		{
			digit = (int) (value % 10);
			value /= 10;
			
			if(remainders.length == i)
			{
				i = 0;
			}
			
			rem += digit * remainders[i];
			i++;
			
			if(value == 0 && final_rem == rem)
			{
				break;
			}
			else if(value == 0)
			{
				final_rem = rem;
				value = rem;
				rem = 0;
				i = 0;
			}
		}
		
		return rem;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(thirt(1234567));

	}

}
