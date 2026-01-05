package Basics2;

public class if_else_elseif {
	public static void main(String[] args) {
		int n =10;
		if (n>0)
		{
			System.out.println("number is positive ");
		}
		
		int k =8;
		if(k % 2 == 0)
		{
			System.out.println("Even number ");
		}
		else 
		{
			System.out.println("odd number");
		}
		
		
		int marks = 00; 
		if (marks >=90)
		{
		   System.out.println("Grade A");
		}
		else if (marks >=75)
		{
			System.out.println("Grade b");
		}
		else if (marks >=50)
		{
			System.out.println("Grade c");
		}
		else
		{
			System.out.println("fail");
		}
			
	
	}

}
