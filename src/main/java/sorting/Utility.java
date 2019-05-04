package sorting;

public class Utility {

	public static int[] processStringArrayLine(String array) {
		String[] stringNums = array.split(",");
		int[] intNums = new int[stringNums.length];

		for (int index = 0; index < stringNums.length; index++) {
			intNums[index] = Integer.parseInt(stringNums[index]);
		}
		return intNums;
	}

}
