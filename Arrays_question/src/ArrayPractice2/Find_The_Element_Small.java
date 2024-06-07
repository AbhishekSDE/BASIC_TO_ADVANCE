package ArrayPractice2;

public class Find_The_Element_Small {

	public static void main(String[] args) {
		
		 int arr[]= {1,2,3,4,0,6,7,8};
			
			System.out.println(" element of array ::");
	        
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			int smallest=arr[0];
			for(int i=0;i<arr.length;i++)
			{ 	
					if(arr[i]<smallest)
					{
						smallest=arr[i];
						
					}
				
			}
	       System.out.println("laegest element of array is :: "+smallest);
	}

}
