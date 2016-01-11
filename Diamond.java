
public class Diamond {

	public static String print(int n){
		
		if(n % 2 == 0 || n < 0)
			return null;
		
		StringBuilder str = new StringBuilder();
		String string = "*";
		
		int num;
		int cnt = (n / 2) + 1;
		
		for(int i=1; i<n; i+=2)
		{
			num = i;
			while(num != 0)
			{ 
				
				if(num == i){
					string = "*";
					string = String.format("%"+(cnt)+"s", string);
				}
				else
					string = "*";
				
				str.append(string);
				num--;
			}
			cnt--;
			str.append("\n");
		}
		cnt = 1;
		for(int i=n; i >= 1; i-=2)
		{
			num = i;
			while(num != 0)
			{ 
				if(num == n){
					string = "*";
				}
				else if(num == i){
					string = String.format("%"+(cnt)+"s", string);
				}
				else 
					string = "*";
				str.append(string);
				num--;
			}
			cnt++;
			str.append("\n");
		}
		
		return str.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print(9));
		
	}

}
