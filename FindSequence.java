
public class FindSequence {
	
	public static String getQuote(String[] quotes, String hero){
	    
		int number = 0;
		String character = "";
		
		for(int i = 0; i < hero.length(); i++)
		{
			if( Character.isDigit(hero.charAt(i)) )
			{
				
				number = Character.getNumericValue(hero.charAt(i));
			}
		}
		
		if(hero.contains("Bat"))
		{
			character = "Batman";
		}
		else if(hero.contains("Rob"))
		{
			character = "Robin";
		}
		else
		{
			character = "Joker";
		}
		
		String quote = character + ": "  + quotes[number];
	    return quote;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getQuote(new String[]{"I am vengeance. I am the night. I am Batman!", "Holy haberdashery, Batman!", "Let's put a smile on that faaaceee!"},"Rob1n"));
	}

}
