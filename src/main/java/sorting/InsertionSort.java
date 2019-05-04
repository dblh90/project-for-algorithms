package sorting;

/**
 * @author Hamza
 */
public class InsertionSort {

	public static void main(String[] args) {
		//@formatter:off
        /**
         * Steps:
         *
         * 1- Loop over the array,
         * 2- Hold the current index's value
         * 3- Loop backwards and check if the current value is less than the inner loop current index's value
         * 4- if yes, swap the inner loop current index's value with the next index's value
         *
         */
        //@formatter:on

		int[] array = Utility.processStringArrayLine(args[0]);

		System.out.println("Array before insertion sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) {
			int currentValue = array[outerIndex];

			for (int jndex = outerIndex; jndex >= 0; jndex--) {
				if (currentValue < array[jndex]) {
					int temp = array[jndex];
					array[jndex] = array[jndex + 1];
					array[jndex + 1] = temp;
				}
			}

		}
		System.out.println();
		System.out.println("Array after insertion sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
