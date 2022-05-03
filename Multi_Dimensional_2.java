package Java_Array;

public class Multi_Dimensional_2 
{
public static void main(String[] args) 
{
	int ar [] [] = {{10,20},{20,20}};	
	
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

