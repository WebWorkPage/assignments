package Task5_Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUpperCase {

	public static void main(String[] args) {
		Stream names = Stream.of("aBc", "d", "ef");

		List<String> name = (List<String>) names.map(n -> ((String) n).toUpperCase()).collect(Collectors.toList());
		
//		 List < String > uppercaseStrings = name.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(name);
	}

}
