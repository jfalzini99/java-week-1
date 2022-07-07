package Lab1;

// WEEK 1 LAB
// WORK BY: JOSEPH FALZINI

public class week1Labs {

	public static void main(String[] args) {
		// PART 1
		int availablePlaneSeats = 12;
		double groceriesCost = 24.65;
		char middleInitial = 'A';
		boolean isHotOutside = true;
		String customerFName = "John";
		String streetAddress = "1 Jackson Road";
		
		System.out.println("Number of seats available on flight: " + availablePlaneSeats);
		System.out.println("Cost of Groceries: $" + groceriesCost);
		System.out.println("Person Middle Initial: " + middleInitial);
		System.out.println("Is it hot outside?? - " + isHotOutside);
		System.out.println(streetAddress + " is where this person lives!");
		
		System.out.println(""); // FOR SPACING IN CONSOLE! 
		
		// PART 2
		//availablePlaneSeats = availablePlaneSeats -2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		groceriesCost += 2.15;
		System.out.println(groceriesCost);
		
		middleInitial = 'F';
		System.out.println(middleInitial);
		
		//isHotOutside = false;
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		String customerLName = "Smith";
		String fullName = customerFName + " " + middleInitial + ". " + customerLName;
		System.out.println(fullName);
		
		System.out.println("Hello! My name is " + fullName + ", and I live at " + streetAddress + "!");

	}

}
