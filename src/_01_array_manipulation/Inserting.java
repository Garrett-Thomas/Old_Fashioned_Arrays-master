package _01_array_manipulation;



public class Inserting {
	public static int[] insertAt(int[] testArray, int i, int jtestArray) {
		/*int[] temp = testArray.clone();
		for (int j = 0; j < testArray.length; j++) {
			if(j == i) {
				int temp6 = testArray[j];
				System.out.println(temp[j]);
				temp[j] = jtestArray;
				System.out.println(temp[j]);
				temp[j + 1] = temp6;
			}
			else {
			temp[j] = testArray[j];
			}
		}
		return temp;
		*/
	testArray[i]=jtestArray;
	return testArray;
}
}
