package ArrayPractice2;

public class Sort_In_Decending_Order {

	public static void main(String[] args) {
    
		int arr[]=new int[] {23,43,12,19,10};
		
		System.out.println("original array :: ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        		    arr[j]=temp;
        		}
        	}
        }
        System.out.println();    
       
        System.out.println("Elements of array sorted in decending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    

	}

}
