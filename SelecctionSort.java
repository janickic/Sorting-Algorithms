public class SelectionSort{

	public static void main (String[] args)
	{
		
	}
	public static int[] sort(int[] A){
		for(int i=0; i<A.length-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<A.length; j++)
			{
				if(A[j]<A[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=A[minIndex];
			A[minIndex]=A[i];
			A[i]=temp;
		}
		return A;
	}
