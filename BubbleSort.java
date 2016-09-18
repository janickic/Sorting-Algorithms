public class BubbleSort{

	public static void main (String[] args)
	{
		
	}
	
	public static int[] sort(int[] A)
	{
		for(int k=0; k<n-1; k++)
		{
			for(int j=0; j<n-1-k; j++)
			{
				if(A[j+1]<A[j])
				{
					int temp=A[j+1];
					A[j+1]=A[j];
					A[j]=temp;
				}
			}
		}
		return A;
	}
}
