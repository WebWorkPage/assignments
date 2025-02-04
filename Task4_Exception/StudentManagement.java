package Task4_Exception;
import java.util.regex.*;

class Student{
	int rollNo;
	String name;
	int age;
	String course;
	Student(int rollNo, String name, int age, String course){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

class AgeNotWithinRangeException extends Exception{
	String msg;
	AgeNotWithinRangeException(String msg){
		super(msg);
	}
}

class NameNotValidException extends Exception{
	NameNotValidException(String msg){
		super(msg);
	}
}

public class StudentManagement {

	public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException{
		Student s = new Student(11,"jonj@",29,"Math");
		try {
			if(!(s.getAge()>=15 && s.getAge()<=21)) {
				throw new AgeNotWithinRangeException("Age not within Range");
			}
			Pattern p = Pattern.compile("[^A-Z0-9a-z]");
			Matcher m = p.matcher(s.getName());
			boolean result = m.find();
			if(!result) {
				throw new NameNotValidException("name not valid");
			}
		}
		//catch(AgeNotWithinRangeException | NameNotValidException E)
		catch(AgeNotWithinRangeException E) {
			System.out.println(E.getMessage());
		}
		catch(NameNotValidException E) {
			System.out.println(E.getMessage());
		}
		
	}

}
