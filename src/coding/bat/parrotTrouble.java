package coding.bat;

public class parrotTrouble {

	public static void main(String[] args) {
		/*
		 * parrotTroube(true, 6) -> true parrotTrouble(true, 7) -> false
		 * parrotTrouble(false, 6) -> false
		 */

		new parrotTrouble().run();

	}

	private void run() {
		test(true, 6, true);
		test(true, 7, false);
		test(false, 6, false);
	}

	private void test(boolean talking, int hour, boolean expected) {
		System.out.println("Parrot talking = " + talking + ". Hour = " + hour + ". Response = " + expected);

		if (ParrotTrouble(talking, hour) == expected) {
			// System.out.println("Parrot talking = " + talking + ". Hour = " + hour + ".
			// Response = " + expected);
			System.out.println("It worked!");
		} else {
			System.out.println("Parrot talking = " + talking + ". Hour = " + hour + ". Response = " + expected);
			System.out.println("It didn't worked!");
		}
	}

	/**
	 * We have a loud talking parrot. The "hour" parameter is the current hour time
	 * in the range 0..23. We are in trouble if the parrot is talking and the hour
	 * is before 7 or after 20. Return true if we are in trouble.
	 * 
	 * @param talking
	 * @param hour
	 * @return
	 */
	private boolean ParrotTrouble(boolean talking, int hour) {
		if (talking && (hour < 7 || hour > 20)) {
			return true;
		} 
		
		return false;

		//return talking && (hour < 7 || hour > 20);
	}
	

}
