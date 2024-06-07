package ArrayPractice2;

import java.util.Scanner;

public class Array_Duplicate {

	public static void main(String[] args) {
		
		System.out.print("enter the size of array :: ");
		Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        
        int arr[]=new int [size];
        System.out.println("enter the element of array");
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        
        System.out.println("Arrat element is ::: ");
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
            	if(arr[i]==arr[j])
            	{
            		System.out.println("Duplicate is :: "+arr[j]+" with index :: "+i);
            	}
        	}
        }

	}

}
