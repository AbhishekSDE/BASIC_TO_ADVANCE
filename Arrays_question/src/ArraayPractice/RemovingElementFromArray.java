package ArraayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingElementFromArray {
	
	public static void main(String[] args) {

		int []orgarr= {1,2,3,4,5,6,7};
		System.out.println("orignal arry ::"+Arrays.toString(orgarr));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int element=sc.nextInt();
       int newarr[]= remove(orgarr,element);
       System.out.println("new array");
       for(int i=0;i<newarr.length;i++)
       {
    	   System.out.print(newarr[i]+" ");
       }
		
	}

	private static int[] remove(int[] orgarr, int element) {
		
		int[] newarr=new int[orgarr.length-1];
		int index=0;
		
		for(int i=0;i<orgarr.length;i++)
		{
			if(orgarr[i]!=element)
			{
				newarr[index]=orgarr[i];
				index++;
			}
		}
		return newarr;
	}

}
