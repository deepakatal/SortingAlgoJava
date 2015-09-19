import java.util.Random;

public class SortMainClass {
	private int numberArray[];
	private Random rand;

	public SortMainClass() {
		numberArray = new int[100];
		rand = new Random();
		randomizeNumberArray();
	}

	public static void main(String args[]) {

		SortMainClass sortMainObject = new SortMainClass();

		InsertionSort ir = new InsertionSort();
		ir.sort(sortMainObject.numberArray);

		displayArray(sortMainObject.numberArray);
	}

	// randomize number array
	private void randomizeNumberArray() {
		for (int i = 0; i < numberArray.length; i++) {
			this.numberArray[i] = rand.nextInt(1000);
		}
		displayArray(numberArray);
	}

	// display array
	private static void displayArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
