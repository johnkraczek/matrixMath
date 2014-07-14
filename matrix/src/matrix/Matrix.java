package matrix;

import java.util.Scanner;

public class Matrix {
	int m2x2[][] = { { 2, 3 }, { 4, 5 } };
	int m2x3[][] = { { 2, 3, 4 }, { 4, 5, 6 } };
	int m3x2[][] = { { 2, 3 }, { 4, 5 }, { 4, 5 } };
	int m3x3[][] = { { 2, 3, 4 }, { 4, 5, 6 }, { 7, 8, 6 } };
	
	int[][] matrix[] = {m2x2,m2x3,m3x2,m3x3};

	public Matrix() {

		int first = getMatrix("First");
		int second = getMatrix("Second");
		boolean operation = getOperation();

		if (operation) {
			
		} else {
			multiply(matrix[first],matrix[second]);
		}

	}
	
	public int[][] add(int[][] first, int[][] second){
		
		
		return int[][];
	}

	public int[][] multiply(int[][] first, int[][] second) {
		
		int fRow = first.length;
		int sRow = second. length;
		int fCol = first[0].length;
		int sCol = second[0].length;
		
		if (fCol != sRow){
			throw new IllegalArgumentException("Your Rows for Matrix 1 did not match Cols for Matrix 2");
		}
		
		int[][] result = new int[fRow][sCol];
		
		return result;
	}

	public boolean getOperation() {

		Scanner in = new Scanner(System.in);
		String answer;
		boolean operation = true;
		boolean notFound = true;
		while (notFound) {
			System.out
					.println("Do you want to Add or Multiply (input '+' or 'x')");
			answer = in.nextLine();

			if (answer.equalsIgnoreCase("+") || answer.equalsIgnoreCase("x")) {
				notFound = false;
			} else {
				notFound = true;
			}

			if (notFound) {
				System.out.println("Input not valid please enter '+' or 'x'");
			} else {
				if (answer.equalsIgnoreCase("+")) {
					operation = true;
				} else {
					operation = false;
				}
			}

		}
		in.close();

		return operation;
	}

	public int parseInput(String input) {

		if (input.equalsIgnoreCase("2x2")) {
			return 0;
		}
		if (input.equalsIgnoreCase("2x3")) {
			return 1;
		}
		if (input.equalsIgnoreCase("3x2")) {
			return 2;
		}
		if (input.equalsIgnoreCase("3x3")) {
			return 3;
		}
		return -1;

	}

	public boolean checkInput(String input) {
		if (input.equalsIgnoreCase("2x2") || input.equalsIgnoreCase("2x3")
				|| input.equalsIgnoreCase("3x2")
				|| input.equalsIgnoreCase("3x3")) {
			return false;
		} else {
			return true;
		}
	}

	public int getMatrix(String Num) {
		Scanner in = new Scanner(System.in);
		String answer;
		boolean notFound = true;
		while (notFound) {
			System.out.println("What is " + Num
					+ " Matrix (input 2x2,2x3,3x2,3x3):");
			answer = in.nextLine();
			notFound = checkInput(answer);

			if (notFound) {
				System.out
						.println("Input not valid please enter '2x2','2x3','3x2','3x3'");
			} else {
				in.close();
				return parseInput(answer);
			}

		}
		in.close();
		return 0;
	}

	public static void main(String[] args) {
		Matrix m = new Matrix();
	}

}
