/**
 * nested inner class
 */
class Outer {

	// Class 2
	// Simple nested inner class
	class Inner {

		// show() method of inner class
		public void show()
		{

			// Print statement
			System.out.println("In a nested class method");
		}
	}
}

// Class 2
// Main class
class Main {

	// Main driver method
	public static void main(String[] args)
	{

		// Note how inner class object is created inside
		// main()
		Outer.Inner in = new Outer().new Inner();

		// Calling show() method over above object created
		in.show();
	}
}
