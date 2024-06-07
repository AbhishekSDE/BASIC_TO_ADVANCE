package ArrayPractice2;

public class Sum_OF_ALL_Element {

	public static void main (String args [])
	{
		int arr[]= {12,34,55,45};
		
		System.out.println("element of array is equal :: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.print("sum of array element is :: "+sum);
	}
}
