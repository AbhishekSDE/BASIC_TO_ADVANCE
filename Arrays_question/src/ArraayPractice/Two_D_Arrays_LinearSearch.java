package ArraayPractice;

import java.util.Scanner;

public class Two_D_Arrays_LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of 2D-array ::");
		int rows=sc.nextInt();
		int col=sc.nextInt();
		
		int abc[][]=new int[rows][col];
		System.out.println("enter the element of array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				abc[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("print the 2d array");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(abc[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enter the no for sreach");
		int x=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(abc[i][j]==x)
				{
					System.out.println("rows::"+i+" "+"col::"+j);
				}
			}
			System.out.println();
		}
	     

	}

}
