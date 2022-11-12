
public class SelectionSort {

	public static void main(String[] args) {
		 int a[] = {8,4,6,7,5,1,2,3};
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp = a[j];
					 a[j] = a[i];
					 a[i]  = temp;
				 }
			 }	 
		 }
		 System.out.println("After sorting of the array: ");
		 for(int el:a)
		 {
			 System.out.print(el+" ");
		 }
	}

}
