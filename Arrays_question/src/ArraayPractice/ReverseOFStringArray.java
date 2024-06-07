package ArraayPractice;

import java.util.*;
public class ReverseOFStringArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("eneter the Stirng");
        String sen=sc.nextLine();
     
        char[] cs = sen.toCharArray();
        int len=cs.length;
        String revSen="";
        for(int i=len-1;i>=0;i--)
        {
          revSen+=cs[i];
        }
       System.out.println("reverse of ::"+revSen);
	}

}
