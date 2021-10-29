import java.util.*;

public class rows  
{              
	public static void main(String[] args)   
	{  
		int i, j, k = 1,n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the limit"); 
		n=in.nextInt();
		for (i = 1; i <= n; i++)   
		{  
	 
			for (j = 1; j< i + 1; j++)   
			{  
  
				System.out.print(k++ + " ");  
			}  
  
		System.out.println();  
		}  
	}  
}