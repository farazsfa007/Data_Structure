package dataStructure;

public class SearchInRange {
	public static void main(String[] args) {

		int[] arr = { 34, 54, 65, -34, 5, -8, 90, 45 };
		int target = 5;

		System.out.println(linearSearch(arr,target,1,6));
		
	}

	// search in the array;return index if it item found
	// Other wise Item not found return -1
	static int linearSearch(int[] arr, int target,int start,int end) {
		if (arr.length == 0) {
			return -1;
		}
		// Run a for loop
		for (int index = start; index <=end; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		// This line will execute when none of the return statement above have executed
		// hence the target not found
		return -1;
	}

}
