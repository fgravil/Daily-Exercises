
public class NumberofRectangles {

	public static int numberOfRectangles(int m, int n)
	{
		int total = 0;
		for(int i = 1; i <= m; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				total +=  i * j;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfRectangles(3,2));
	}

}
