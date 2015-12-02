
public class LucasNumbers {
	
	public static int lucasnum(int n)
	{
		if(n < 0)
			return lucasnum(n+2) - lucasnum(n+1);
		if(n == 0)
			return 2;
		if(n == 1)
			return 1;
		
		return lucasnum(n-1) + lucasnum(n-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lucasnum(-5));
	}

}
