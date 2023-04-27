package Week1_Day1;

import java.util.Arrays;

import org.junit.Test;

public class AddSpecific_index {

	@Test
	public void example() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int noToInsert = 3;
		int indextoInsertNo = 2;
		int[] storeVal = addNoToInsert(arr, noToInsert, indextoInsertNo);
		System.out.println(Arrays.toString(storeVal));
	}

	@Test
	public void example1() {
		int arr[] = { 2, 3, 4 };
		int noToInsert = 5;
		int indextoInsertNo = -1;
		int[] storeVal = addNoToInsert(arr, noToInsert, indextoInsertNo);
		System.out.println(Arrays.toString(storeVal));
	}

	@Test
	public void example2() {
		int arr[] = {};
		int noToInsert = 0;
		int indextoInsertNo = 2;
		int[] storeVal = addNoToInsert(arr, noToInsert, indextoInsertNo);
		System.out.println(Arrays.toString(storeVal));
	}

	// add to the specific index
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
