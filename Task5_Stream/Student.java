package Task5_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("hxdy","Aghhj","ghgh","arrt","bnbg");
		List<String> result = names.stream().filter(n -> n.toLowerCase().startsWith("a")).collect(Collectors.toList());
		System.out.println(result);
	}

}
