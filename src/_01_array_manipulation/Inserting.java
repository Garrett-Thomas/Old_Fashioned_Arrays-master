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

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		String[] tempArray = new String[orderedArray.length + 1];
		int Liam = 0;
		boolean ran = true;
		for (int i = 0; i < orderedArray.length; i++) {
			if(orderedArray[i].toString().compareTo(string) > 0 && ran ) {
				tempArray[i] = string;
				ran = false;
			} 
			else {
				tempArray[i] = orderedArray[Liam];
				Liam++;
			}
			
		}
		tempArray[tempArray.length-1] = orderedArray[orderedArray.length-1];
		return tempArray;
	}
}
