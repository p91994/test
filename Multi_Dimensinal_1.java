package Java_Array;

public class Multi_Dimensinal_1
{
public static void main(String[] args)
{
	int ar [] [] = new int [2] [2];
	
	ar [0][0]=20;
	ar [0][1]=10;
	ar [1][0]=30;
	ar [1][1]=40;
	
	System.out.println(ar[1][0]);
	System.out.println(ar.length);
	System.out.println("-------------------------------");
	for(int i=0; i<=1;i++)
	{
		for(int j=0 ;j<=1 ;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
}
}
