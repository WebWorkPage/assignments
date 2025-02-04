package Task4_Exception;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hashMap {
	static HashMap<String, Integer> student= new HashMap<String, Integer>();
	
	public static HashMap<String, Integer> addStudent(String name, Integer mark){
		student.put(name, mark);
		return student;
	}
	
	public static HashMap<String, Integer> removeStudent(String name){
		Integer val = student.remove(name); //returns the removed value
		if(val != null) {
			return student;
		}
		return null; //if not present, val returns null
	}
	
	public static int displayGrade(String name) {
		return student.get(name);
	}

	public static void main(String[] args) {
		
		System.out.println(hashMap.addStudent("jllfxo", 97));
		System.out.println(hashMap.removeStudent("fffxx"));
		System.out.println(hashMap.displayGrade("jllfxo"));
		
	}

}
