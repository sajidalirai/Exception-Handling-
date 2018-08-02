class InvalidAge extends Exception{
	InvalidAge(String s){
		super(s);
	}
}

public class CustomException {
	
	static void validate(int age) throws InvalidAge {
		if(age < 18) {
			throw new InvalidAge("Sorry can't vote, Your age is less than 18 years");
		}else {
			System.out.println("welcome to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(12);
		}catch(Exception e) {
			System.out.println("Exception Occured : " + e);
		}
	}
	

}
