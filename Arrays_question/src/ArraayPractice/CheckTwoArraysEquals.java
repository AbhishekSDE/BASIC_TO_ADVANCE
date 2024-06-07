package ArraayPractice;

import java.util.Arrays;

public class CheckTwoArraysEquals {

	public static void main(String[] args) {
		
		int []a= {1,2,4,5,6,7,8};
		int []b= {1,2,4,8,6,7,8};
		
//		boolean equals = Arrays.equals(a, b);
//		
//		if(equals==true)
//		{
//			System.out.println("array are equal");
//		}
//		else {
//			System.out.println("array are not equal");
//		}
		boolean status=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
                  status=false;				
				}
				
			}
			
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Arrays are eqaul");
		}
		else {
			System.out.println("Arrays are not eqaul");
		}
	}

}
