package ArraayPractice;

import java.util.Scanner;

public class LinearSearchDeclerationOfArray {

	public static void main(String[] args) {
	
//		int []av=new int[4];
//		av[0]=10;
//		av[1]=15;
//		av[2]=16;
//		av[3]=18;
//		
//		System.out.println(av[0]);
//		System.out.println(av[1]);
//		System.out.println(av[2]);
//		System.out.println(av[3]);
		
//		for(int i=0;i<av.length;i++)
//		{
//			System.out.print(av[i]+" ");
//		}
		
		//int abd[]= {12,32,43,54,54};
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array ::");
		int size=sc.nextInt();
		int []abc=new int[size];
		
		
		System.out.print("enter the element array \n");
		for(int i=0;i<size;i++)
		{
			abc[i]=sc.nextInt();
		}
		System.out.print("enter the searching element ::");
		int x=sc.nextInt();
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]==x)
			System.out.print(abc[i]+" "+"index ::"+i);
		}
		
	}

}
