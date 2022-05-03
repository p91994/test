package Java_Array;

import java.util.Arrays;

public class Single_array1 
{
	public static void main(String[] args) {
		
	
	int ar [] = new int [4];
	
	ar[0] = 30;
	ar[1] = 40;
	ar[2] = 10;
	ar[3] = 20;
	
	
	System.out.println(ar[1]);
	System.out.println(ar.length);
	
	System.out.println("----------------------------------");
	
	for (int i=0 ;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("----------------------------------");
	
	for (int i=ar.length-1; i>=0 ; i--)
	{
		System.out.println(ar[i]);
		
	}
	
	System.out.println("----------------------------------");
	Arrays.sort(ar);

	for (int i=0; i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	
	}
}
