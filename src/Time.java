//The imports needed to run the code
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Time {

	public static void main(String[] args) {

		// Input Scanner
		Scanner input = new Scanner(System.in);

		// User inputs their first year
		System.out.println("Enter 4 numbers for Year:");
		int year1 = input.nextInt();
		
		//User inputs their first month
		System.out.println("Enter 2 numbers for Month:");
		int month1 = input.nextInt();
		
		//User inputs their first day
		System.out.println("Enter 2 numbers for Day:");
		int day1 = input.nextInt();
		
		//Made the user's input for the first date into an integer
		LocalDate date1 = LocalDate.of(year1, month1, day1);
		
		//User inputs their second year
		System.out.println("Enter 4 numbers for Year:");
		int year2 = input.nextInt();
		
		//User inputs their second month
		System.out.println("Enter 2 numbers for Month:");
		int month2 = input.nextInt();
		
		//User inputs their second day
		System.out.println("Enter 2 numbers for Day:");
		int day2 = input.nextInt();
 		
		//Made the user's input for the second day into an integer
		LocalDate date2 = LocalDate.of(year2, month2, day2);
		
		//The code that finds the difference between the two date
		Period diff = Period.between(date1, date2);
		
		//Making the difference and integer in Years/Months/Days
		int Difference1 = diff.getYears();
		int Difference2 = diff.getMonths();
		int Difference3 = diff.getDays();
		
		//The Difference between the 2 Dates in YYYY/MM/DD
		System.out.println(Difference1 + "-Years");
		System.out.println(Difference2 + "-Months");
		System.out.println(Difference3 + "-Days");
	}
}
