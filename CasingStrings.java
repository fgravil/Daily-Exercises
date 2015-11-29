
public class CasingStrings {
	
	public static String toJadenCase(String phrase) {
		// TODO put your code below this comment
		if(phrase == null || phrase.length() == 0)
		{
			return null;
		}
		
			phrase = "" + Character.toUpperCase(phrase.charAt(0)) + phrase.substring(1);
			for(int i = 1; i < phrase.length(); i++)
			{
				if(phrase.charAt(i-1) == ' ')
				{
					phrase = "" + phrase.substring(0, i) + 
							Character.toUpperCase(phrase.charAt(i)) + phrase.substring(i+1, phrase.length());
				}
			}
			
			return phrase;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toJadenCase(null));
	}

}
