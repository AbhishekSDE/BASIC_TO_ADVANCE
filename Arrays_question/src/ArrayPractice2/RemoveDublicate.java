package ArrayPractice2;

public class RemoveDublicate {


	public static void main(String[] args) {
		
		int a[]=new int[] {12,13,24,23,24,24,12,33,12};
		
		System.out.println("Element of array ::");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	     int n=a.length;
		 int[] temp = new int[n];
	        int j = 0;
	 
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	 
	        temp[j++] = a[n - 1];
	        
	        for(int k=0;k<j;k++)
	        {
	        	System.out.print(temp[k]+" ");
	 
	}

	}
}
