package operations;

// WEEK 1 - 'OPERATIONS' VIDEO NOTES
// EDITTED BY: JOSEPH FALZINI

public class operations {

	public static void main(String[] args) {
		// Operators perform actions on operands.
		// EX: + , -, / , *
		
		int age = 23 * 2;
		System.out.println(age);
		boolean isAge30 = age  == 30;
		System.out.println(isAge30);
		
		System.out.println(age == 46);
		
		age = age + 1;
		System.out.println(age);
		
		String firstName = "Joseph";
		String lastName = "Falzini";
		String fullName  = firstName + " " + lastName; // Concatenation! 
		System.out.println(fullName);
	}

}
