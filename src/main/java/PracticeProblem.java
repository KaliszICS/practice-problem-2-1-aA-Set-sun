/* 
	Title: Methods
	Name: Angie
	Date created: Mar 10, 2026
	Date updated: Mar 10, 2026

	*/

	public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(sum(3, 2));
		System.out.println(difference(0, 1));

	}

	//Create your functions here
	/*Create a Method called sum, which takes two integers as parameters. 
	Return the sum of the two parameters as an integer. */

	public static int sum(int num1, int num2) {

		int result = num1 + num2;
		return result;

	}

	public static int difference (int num1, int num2) {

		int difference = num1 - num2;
		return difference;

	}

	public static double product (double num1, double num2) {

		double result = num1 * num2;
		return result;

	}

	public static String removeFirst (String word) {

		String words = word.substring(1);
		return words; 

	}

}
