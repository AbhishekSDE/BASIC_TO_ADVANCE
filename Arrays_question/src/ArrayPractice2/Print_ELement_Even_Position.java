package ArrayPractice2;

public class Print_ELement_Even_Position {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		
		System.out.println(" element of array ::");
        
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(" even the element :: ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
