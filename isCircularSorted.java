public class isCircularSorted {
	
	public static boolean isCircleSorted(int[] a)
	{
		
		for(int i = 0; i < a.length-1; i++)
		{
			if(a[i] > a[i+1])
			{
				for(int j= i+1; j < a.length-1; j++)
				{
					if(a[j] >  a[j+1] || a[0] < a[j+1])
						return false;
				}
				if(i == a.length-2)
				{
					if(a[0] < a[i+1])
						return false;
				}
				
			}
							
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isCircleSorted(new int[]{}));
		System.out.println(isCircleSorted(new int[]{4,1,2,5}));
		System.out.println(isCircleSorted(new int[]{8,7,6,5,4,3}));
		System.out.println(isCircleSorted(new int[]{6,7,4,8}));
		System.out.println(isCircleSorted(new int[]{9,10,14,12}));
		System.out.println(isCircleSorted(new int[]{2,3,4,5,0,1}));
		System.out.println(isCircleSorted(new int[]{4,5,6,9,1}));
		System.out.println(isCircleSorted(new int[]{10,11,6,7,9}));
		System.out.println(isCircleSorted(new int[]{5,7,43,987,-9,0}));
	}

}
