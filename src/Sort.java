public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {1,5,6,25,3,85,41,13};
		int[] arr={1,2};
		mergeSort(arr, 0, arr.length-1);
		

	}
	public static void mergeSort(int[] arr, int start, int end)
	{
		int middle = (end-start)/2;
//		System.out.println(start);
//		System.out.println(end);
//		System.out.println(middle);
		if(end>start)
		{
			mergeSort(arr, start, middle);
			mergeSort(arr, middle+1, end);
			merge(arr, start, end, middle);
		}
	}
	
	public static int[] merge(int[] arr, int start, int end, int middle)
	{
		int[] a1 = new int[middle-start+1];
		int[] a2 = new int[end-middle+1];
		for(int i=0; i<a1.length; i++)
		{
			a1[i]=arr[start+i];
		}
		for(int j=0; j<a2.length;j++)
		{
			a2[j]=arr[middle+j];
		}
		int k=start, x=0, y=0;
		while(x<a1.length && y<a2.length)
		{
		if(a1[x]<a2[y])
		{
			arr[k]=a1[x];
			x++;
		}
		else
		{
			arr[k]=a2[y];
			y++;
		}
		k++;
		}
		while(x<a1.length)
		{
			arr[k]=a1[x];
			k++;
			x++;
		}
		while(y<a2.length)
		{
			arr[k]=a2[y];
			k++;
			y++;
		}
		
		return arr;
		
	}
}


