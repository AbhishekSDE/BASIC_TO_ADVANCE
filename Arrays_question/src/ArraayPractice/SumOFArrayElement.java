package ArraayPractice;

import java.util.Scanner;

public class SumOFArrayElement {

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
			System.out.print(arr[i]);
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
		   sum=sum+arr[i];	
		}
		System.out.println("sum of array ::"+sum);

	}

}
