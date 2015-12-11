import java.util.ArrayList;
import java.util.Arrays;

class Stock{
	char name;
	int count;
	
	public int getCount() {
		return count;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
public class StockList {

	public static String stockSummary(String[] lstofArt, String[] lstof1stLetter)
	{
		if(lstofArt.length == 0 || lstof1stLetter.length == 0)
		{
			return "";
		}
		
		String firstLetter = "";
		StringBuilder number = new StringBuilder();
		Stock stock = new Stock();
		ArrayList<Stock> list = new ArrayList<Stock>();
		
		for(int i=0; i< lstofArt.length; i++)
		{
			for(int j =0; j < lstofArt[i].length();j++)
			{
				if(j == 0 && Arrays.asList(lstof1stLetter).contains(lstofArt[j]))
				{
					
					
				}
				if(Character.isDigit((lstofArt[i].charAt(j))))
				{
					number.append(lstofArt[i].charAt(j));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
