package Task4_Exception;
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

public class Voter {
	int voterId;
	String name;
	int age;
	Voter(int voterId, String name, int age){
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		try {
			if(this.age < 18) {
				throw new InvalidAgeException("invalid age for voter");
			}
		}
		catch(InvalidAgeException E) {
			System.out.println(E.getMessage());
		}
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Voter obj=new Voter(1060,"jojk",16);

	}

}
