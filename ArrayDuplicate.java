
public class ArrayDuplicate {

	public static void main(String[] args) {
		int []a = {1,2,2,4,6,1,3,5,3};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag = true;
					System.out.println("The duplicate values are "+a[i]);
					break;
					
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("There is no duplicate values in the array");
		}
	}

}
