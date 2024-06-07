package ArrayPractice2;

import java.util.Scanner;

public class A_Array_Copy_To_Another {

	private static void forcopy(int[] ar1) {
		
	  int ar2[]=new int[ar1.length];
	  
	  for(int i=0;i<ar2.length;i++)
	  {
		  ar2[i]=ar1[i];
	  }
	   
	  System.out.println("orinal arrays is :: ");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.println("copied array is :: ");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.print(ar2[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array :: ");
		int size=sc.nextInt();
		System.out.println("enter the element of array");
		int []ar1=new int[size]; 
          for(int i=0;i<ar1.length;i++)
          {
        	  ar1[i]=sc.nextInt();
          }
          
          forcopy(ar1);
	}


}
