package Task5_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nonEmptyStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		List<String> result = names.stream().filter(n -> n!="").collect(Collectors.toList());
		System.out.println(result);
	}

}
