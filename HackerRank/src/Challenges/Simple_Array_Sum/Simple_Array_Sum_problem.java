/**
 * 
 */
package Challenges.Simple_Array_Sum;
/**
 * @author Prathamesh
 *
 */

import java.util.Scanner;

public class Simple_Array_Sum_problem {

	/*
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {
		/*
		 * Write your code here.
		 */
		int Sum = 0;
		for (int i = 0; i < ar.length; i++) {
			Sum += ar[i];
		}
		return Sum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);
		System.out.println(result);
		scanner.close();
	}
}
