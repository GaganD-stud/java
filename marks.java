import java.util.*;


class marks
{
	
public static void main(String args[])
	
{
		
		float cie,see,total;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter CIE(out of 50) marks of student : ");

		cie = in.nextFloat();

		System.out.println("Enter SEE(out of 100) marks of student : ");

		see = in.nextFloat();

		total=cie+(see/2);

		if(total>=90)
		
		{
			
			System.out.print("Grade : S");

		
		}
		
		else if(total>=80 && total<90)

		
		{
			
			System.out.print("Grade : A");

		
		}
		
		else if(total>=70 && total<80)
		
		{
			
			System.out.print("Grade : B");

		}

		else if(total>=60 && total<70)
		
		{
			
			System.out.print("Grade : C");
		
		}
		
		else if(total>=50 && total<60)
		
		{
			
			System.out.print("Grade : D");

		}
		
		else if(total>=40 && total<50)

		{
			
			System.out.print("Grade : E");

		}
		
		else

		{
			
			System.out.print("Grade : FAIL");
		
		}
	
	}

}