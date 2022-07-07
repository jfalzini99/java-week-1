package classCode;

public class GitDemo {

	public static void main(String[] args) {
		boolean b = true;
		byte bite = -23;
		short sh = 234;
		char ch = 'a';
		int myAge = 22;
		float fl = (float)123.4;
		long lo = 45678987654L;
		double d = 0.0000333;
		
		//String sd = String.format("%.7f", d");
		
		System.out.println("d = " + d);
		System.out.println("lo = " + lo);
		
		System.out.println("max int = " + Integer.MAX_VALUE);
		System.out.println("min int = " + Integer.MIN_VALUE);
		
		System.out.println("max long = " + Long.MAX_VALUE);
		System.out.println("max long = " + Long.MIN_VALUE);
		
		System.out.println("max byte = " + Byte.MAX_VALUE);
		System.out.println("min byte = " + Byte.MIN_VALUE);
		
		byte by = (byte)3895059;
		System.out.println("by = " + by); //OVERFLOW EX


	}

}
