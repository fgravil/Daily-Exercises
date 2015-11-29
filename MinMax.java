import java.util.Arrays;
public class MinMax {

	
	public static int[] minMax(int[] arr) {
        // Your awesome code here
		Arrays.sort(arr);
		
		int [] newArr = new int[]{arr[0],arr[arr.length-1]};
		return newArr;
    }

	
	public static void main(String[] args) {
		System.out.println(minMax(new int[]{2334454,5})[1]);
		
	}
}
