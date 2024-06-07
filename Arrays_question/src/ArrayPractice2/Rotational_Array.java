package ArrayPractice2;

import java.util.Scanner;

public class Rotational_Array {

	public static void main(String[] args ) {
	
		int []arr= new int[]{1,2,3,4,5,6,7,8};
		System.out.println("The original array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("The no. of rotation is :: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
        	int first=arr[0];
        	 for(int j=0;j<arr.length-1;j++)
        	 {
        		 arr[j]=arr[j+1];
        	 }
        	 arr[arr.length-1]=first;
        }
        
        System.out.println();
        System.out.println("after rotation ::");
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}
