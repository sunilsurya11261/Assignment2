class MergeSort
{
	void merge(int a[],int low,int mid,int high)
	{
		int i,j,k;
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int LeftArr[] = new int[n1];
		int RightArr[] = new int[n2];
		
		for(i=0;i<n1;i++)
		{
			LeftArr[i] = a[low+i];
		}
		for(j=0;j<n2;j++)
		{
			RightArr[j] = a[mid+1+j];
		}
		 i=0;
		 j=0;
		 k=low;
		 while(i<n1&&j<n2)
		 {
			 if(LeftArr[i]<=RightArr[j])
			 {
				 a[k] = LeftArr[i];
				 i++;
			 }
			 else
			 {
				 a[k] = RightArr[j];
				 j++;
			 }
			 k++;
		 }
		 while(i<n1)
		 {
			 a[k] = LeftArr[i];
			 i++;
			 k++;
		 }
		 while(j<n2)
		 {
			 a[k] = RightArr[j];
			 j++;
			 k++;
		 }
	}
	void mergeSort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
			
		}
	}
	void printArray(int a[],int n)
	{
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[]args)
	{
		int a[] = {57,25,46,99,66,34,15,80};
		int n = a.length;
		MergeSort m1 = new MergeSort();
		System.out.println("Before sorting the array");
		m1.printArray(a, n);
		m1.mergeSort(a, 0, n-1);
		System.out.println();
		System.out.println("\nAfter sorting the array");
		m1.mergeSort(a, 0, n-1);
		m1.printArray(a,n);
		System.out.println();
	
	}
}