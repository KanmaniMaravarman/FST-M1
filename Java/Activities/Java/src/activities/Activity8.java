package activities;

public class Activity8 {
	
	static void  exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String value is null");
		}else {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		try {
		
		exceptionTest("Will print to console");
		exceptionTest(null);
		exceptionTest("Won't execute");
	}
	catch(CustomException ce) {
		System.out.println("Inside catch block: " + ce.getMessage());
		
	}
}
}