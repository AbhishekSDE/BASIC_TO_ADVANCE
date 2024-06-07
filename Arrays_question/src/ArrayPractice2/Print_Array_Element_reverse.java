package ArrayPractice2;

import java.util.Scanner;

public class Print_Array_Element_reverse {

	public static void main(String[] args) {
		
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter element of an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("element of array is :: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("reverse element of array is :: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
