
public class Rectangles {
	
	public static int numberOfRectangles(int m, int n)
	{
		int total=0;
		   for(int i = m;i > 0;i--) 
		   {
			   for(int j=n; j > 0; j--)
				   total+= m *n;
		   }
		   
		  return total;
	}
		  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfRectangles(3, 2));

	}

}
