package in.pattern;

import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the raage of the loop of given pattern");
		int n=sc.nextInt();
		int m=sc.nextInt();
				
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for( int j=1;j<=m;j++)
		{
			System.out.print("*");
		}
			
		System.out.println();
		}	
	}

}
