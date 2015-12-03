
public class DigitalRoot {

	public static int digital_root(int n)
	{
		int root = 0;
		
		while(true)
		{
			root += n % 10;
			n /= 10;
			
			if(root > 10 && n == 0)
			{
				n = root;
				root = 0;
			}
			if(root < 10 && n <= 0)
				return root;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digital_root(942));
	}

}
