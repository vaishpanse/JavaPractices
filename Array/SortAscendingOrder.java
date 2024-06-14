/*
 * Program to sort an array in ascending oder
 * author:@vaishnaviapnse
 * date:12/06/2024
 */
public class SortAscendingOrder {
	public static void main(String[] args) {
		int[] arr = { 94, 67, 89, 27, 58, 14, 23 };

		for (int i = 0; i < arr.length; i++) {
			// Inner loop to compare the current element with the rest of the elements
			for (int j = i; j < arr.length; j++) {
				// If the current element is greater than the compared element, swap them
				if (arr[j] < arr[i]) {
					int t = arr[i]; // Temporarily store the current element
					arr[i] = arr[j]; // Assign the smaller element to the current position
					arr[j] = t; // Assign the temporarily stored element to the compared position
				} // end of if
			} // end of j
		} // end of i

		System.out.println("ascending order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
