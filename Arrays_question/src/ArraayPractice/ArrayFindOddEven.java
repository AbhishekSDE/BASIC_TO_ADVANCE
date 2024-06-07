package ArraayPractice;

import java.util.Scanner;

public class ArrayFindOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size of array ::");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter the array element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		System.out.println("even array element");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("odd array element");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
