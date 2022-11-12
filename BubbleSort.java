import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {50,25,35,10,40,60,15};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					
				}
			}
		}
		System.out.println("After sorting the array: ");
		for(int el:a)
		{
			System.out.print(el+" ");
		}

	}

}
