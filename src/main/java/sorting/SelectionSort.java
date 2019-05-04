package sorting;

/**
 * @author Hamza
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//@formatter:off
        /**
         * 1.Take an array of numbers .. unordered!
         * 2.Loop over the array, find the next index.
         * 3.Look for the smallest value in the following indexes
         * 4.Swap it with the current index
         * 5.Repeat from 2-4.
         */
        //@formatter:on

		int[] array = Utility.processStringArrayLine(args[0]);

		System.out.println("Array before selection sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int minimumIndex = 0;
		for (int index = 0; index < array.length - 2; index++) {

			// The index that might need to be swapped
			minimumIndex = index;

			// This loop makes the search for the smallest number in the array
			for (int jindex = minimumIndex + 1; jindex < array.length; jindex++) {
				if (array[minimumIndex] > array[jindex]) {
					minimumIndex = jindex;
				}
			}

			int valueToSwap = array[minimumIndex];
			array[minimumIndex] = array[index];
			array[index] = valueToSwap;

		}
		System.out.println();
		System.out.println("Array after selection sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
