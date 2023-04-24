package Vid2;

import java.util.Arrays;

import org.junit.Test;

public class AddSpecific_index {

	public static void main(String[] args) {
		int a[] = { -1, -2, 3, 4, 5};
		int noToInsert = 6;
		int indextoInsertNo = 5;
		int[] storeVal=addNoToInsert(a, noToInsert, indextoInsertNo);
		
		//print the array value as string
		System.out.println(Arrays.toString(storeVal));
		
		/*
		 * //Check noToInsert contains arr1 Arrays.asList(arr1) .contains(noToInsert);
		 */
		

	}

	//add to the specific index
	private static int[] addNoToInsert(int a[], int noToInsert, int indextoInsertNo) {
		// create new array with a.length+1
		int i = 0;
		int arr1[] = new int[a.length + 1];
		for (; i < indextoInsertNo; i++) {
			arr1[i] = a[i];
		}

		arr1[indextoInsertNo] = noToInsert;

		for (i = indextoInsertNo + 1; i <= a.length; i++) {
			arr1[i] = a[i - 1];
		}
		return arr1;
	} 
	

}
