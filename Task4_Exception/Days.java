package Task4_Exception;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int index = sc.nextInt();
		String days[] = {"sunday","mon","tues","wed","thurs","fri","sat"};
		try {
			System.out.println(days[index]);
		}
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.println(E.getMessage());
		}
		System.out.println("hello");
	}

}
