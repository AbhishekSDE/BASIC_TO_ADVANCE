package ArraayPractice;

public class FindMissingInArrays {

	public static void main(String[] args) {
		
		int []a= {1,2,3,5,6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of array element::"+sum);
		
		int sum2=0;
		for(int i=0;i<=6;i++)
		{
			sum2+=i;
		}
		System.out.println("sum2 equal ::"+sum2);
		System.out.println("array missing no.. is ::"+(sum2-sum));
	}

}
