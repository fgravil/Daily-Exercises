
public class Printer {

	/**
	 * Finds the letters which are not suppose
	 * to be in the string, namely n-z.
	 * This function is not the most optimal, but it works.
	 * @param s
	 * @return
	 */
	public static String printerError(String s){
		
		int numErrors = 0;
		
		for(int i=0; i< s.length();i++)
		{
			if(errors(s.charAt(i)))
			{
				numErrors++;
			}
		}
		
		return numErrors + "/" + s.length();
		
	}
	
	public static boolean errors(char c){
		
		for(char i='n'; i < 'z'; i++)
		{
			if (c == i)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}

}
