package variablesAndDataTypes;

// WEEK 1 - 'VARIABLE AND DATA TYPES' VIDEO
// EDITTED BY JOSEPH FALZINI

public class Application {
	// Java is statically typed!!

	public static void main(String[] args) {
		//COMMENTS!
		/*
		 * Primitive Data Types :
		 * int - an integer
		 * double - decimal places 
		 * float - precision decimal data type
		 * long - like int, nums can go higher
		 * short - like int, less num range
		 * byte - 8 bits of data
		 * char - a single character (A,B,C, etc.)
		 * boolean - true or false
		 * 
		 * Objects: 
		 * String - textual data, a string of characters
		 */
		
		//Variable declaration - type, identifier, assignment operator, value, ';'
		int numOfFriends;
		int josephAge = 22;
		double accountBalance = 34.67;
		char middleInitial = 'A';
		boolean isHotOutside = true;
		String firstName = "Joseph";
		
		System.out.println(josephAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);	
	}

}
