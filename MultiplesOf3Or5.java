
public class MultiplesOf3Or5 {

	 public static int solution(int number) {
		 	
		 int currentNumber = 0, total  = 0;
		 
		 while(number > currentNumber)
		 {
			 if(currentNumber % 3 == 0 || currentNumber % 5 == 0)
			 {
				 total += currentNumber;
			 }
			 
			 currentNumber++;
		 }
		 return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
		System.out.println(solution(20));
		System.out.println(solution(30));
		System.out.println(solution(40));
	}

}
