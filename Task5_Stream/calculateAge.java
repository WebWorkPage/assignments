package Task5_Stream;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class calculateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the birthdate in (y-m-d) format");
		String input = sc.nextLine();
		String[] a = input.split("-");
		LocalDate birthdate = LocalDate.of(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
		LocalDate currentDate = LocalDate.now(); //current date
		Period p = Period.between(birthdate, currentDate); //startDate, EndDate
		System.out.println(p.getYears());
	}

}
