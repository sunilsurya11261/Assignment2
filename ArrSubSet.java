
public class ArrSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {1,2,3,4,5,6,7,8};
		int ar2[] = {6,8,4,1};
		int count = 0;
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{	
					count++;
					
				}	
			}
		}
		if(count==ar2.length)
		{
		
		System.out.println("ar2 is Sub set of ar1");
		}
		else
		{
			System.out.println("There is no sub set");
		}
		
		
	}

}
