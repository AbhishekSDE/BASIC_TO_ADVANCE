package ArrayPractice2;

public class Find_Smallest_Element_Array {
	
	private static int thirdsmallest(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();    
		
		System.out.println("Elements of array sorted in ascending order: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");    
		}    
		System.out.println();
		
		return arr[2];
	}

	public static void main(String[] args) {
		
      int arr[]=new int[] {23,43,12,19,10,18,50};
		
		System.out.println("original array :: ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        
         System.out.println("third largest no is ::: "+thirdsmallest(arr));    

	}


}
