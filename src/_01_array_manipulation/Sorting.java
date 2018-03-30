package _01_array_manipulation;

public class Sorting {
	
	public static String[] sort(String[] testArray) {
	for (int i = 0; i < testArray.length-1; i++) {
			for (int j = 0; j < testArray.length-1; j++) {
				if (testArray[j].compareTo(testArray[j + 1]) > 0) {
					String aidan = "";
					aidan = testArray[j];
					testArray[j] = testArray[j+1];
					testArray[j+1] = aidan;
					//System.out.println(testArray.length);
				}
			}
		}
		return testArray;

	}
}
