import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Time {

	public static void main(String[] args) {

		// Input Scanner
		Scanner input = new Scanner(System.in);

		// User inputs in a date
		System.out.println("Enter 4 numbers for Year:");
		int year1 = input.nextInt();

		System.out.println("Enter 2 numbers for Month:");
		int month1 = input.nextInt();

		System.out.println("Enter 2 numbers for Day:");
		int day1 = input.nextInt();

		LocalDate date1 = LocalDate.of(year1, month1, day1);

		System.out.println("Enter 4 numbers for Year:");
		int year2 = input.nextInt();

		System.out.println("Enter 2 numbers for Month:");
		int month2 = input.nextInt();

		System.out.println("Enter 2 numbers for Day:");
		int day2 = input.nextInt();

		LocalDate date2 = LocalDate.of(year2, month2, day2);

		Period diff = Period.between(date1, date2);

		int Difference1 = diff.getYears();
		int Difference2 = diff.getMonths();
		int Difference3 = diff.getDays();

		System.out.println(Difference1);
		System.out.println(Difference2);
		System.out.println(Difference3);
	}
}
