package grade;
import java.util.Scanner;

public class GradeInterpret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String continuechoice;
		//System.out.print("Enter a grade: ");
		do 
		{
			System.out.print("Enter an integer between 1 and 100: ");
			int score = scanner.nextInt();
			
			String grade;
			if (score < 60) 
			{
				grade = "F";
			}
			else if (score <= 67) 
			{
				grade = "D";
			}
			else if (score <= 79) 
			{
				grade = "C";
			}
			else if (score <= 87) 
			{
			grade = "B";	
			}
			else 
			{
			grade = "A"; //this might be a silly way to evaluate it, wanted to use a switch but apparently you can't do ranges in switch and the grade ranges are odd	
			}
			System.out.println("Your letter grade is: " + grade);
			System.out.print("Go again (y/n)? ");
			continuechoice = scanner.next();
		}while (continuechoice.equalsIgnoreCase("y"));
		scanner.close();
	}

}
