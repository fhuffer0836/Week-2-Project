public class Loops {

	public static void main(String[] args) {

		//---------------------------------
		int i = 0;
		System.out.print("Loop 1: ");
		while (i <= 100) {
				System.out.print(i);

				//Syntax and organization
				if (i == 100) {
					System.out.print("\n");
				}
				else {
					System.out.print(", ");
				}
			i = i + 2;
		}

		//---------------------------------

		i = 100; 
		System.out.print("Loop 2: ");
		while (i > 1) {
			i = i - 3;
			System.out.print(i);

			//Syntax and organization
			if (i == 1) {
				System.out.print("\n");
			}
			else {
				System.out.print(", ");
			}
		}

		//---------------------------------

		System.out.print("Loop 3: ");
		for (i = 1; i < 100; i += 2) {
			System.out.print(i);

			//Syntax and organization
			if (i == 99) {
				System.out.print("\n");
			}
			else {
				System.out.print(", "); 
			}
		}
		
		//---------------------------------
		
		System.out.print("Loop 4: ");
		for (i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print("Hello, ");
			}
			if (i % 5 == 0 && i % 3 != 0) {
				System.out.print("World, ");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("HelloWorld, ");
			}
			else {
				System.out.print(i);
				
				if (i == 99) {
					System.out.print("\n");
				}
				else {
					System.out.print(", "); 
				}
			}
			
			// Keeps the text organized; adds tab and line breaks to allow the user to view all numbers without scrolling
			if (i == 27) {
				System.out.print("\n" + "\t");
			}
			if (i == 56) {
				System.out.print("\n" + "\t");
			}
			if (i == 84) {
				System.out.print("\n" + "\t");
			}
			
		}
	}
}