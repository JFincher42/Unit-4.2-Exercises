
public class Sorted {

	public static void main(String[] args) {
		int[] list = {3,  7,  12,  9,  -5,  0,  3};
		
		System.out.println(sorted(list));

		int[] list2 = {1, 3,  7,  12,  19,  25, 30,  43};
		System.out.println(sorted(list2));

		int[] list3 = {-1, -3,  -7,  -12,  -19,  -25, -30,  -43};
		System.out.println(sorted(list3));

	}

	public static boolean sorted(int[] list) {
		// Any list with length <= 2 is sorted.
		if (list.length <= 2)
			return true;
		
		// Setup some variables
		boolean isSorted = true;				// Assume we're sorted
		boolean ascending = list[0]<list[1];	// true means we're ascending, false means we're descending
		int index = 2;							// Where are we in the list
		int lastValue = list[1];				// What was the last value?
		
		// Now loop, while we're:
		// a. still sorted, and 
		// b. not done with the loop
		while (isSorted && index<list.length) {
			if (ascending)
				isSorted = isSorted && (lastValue <= list[index]);
			else
				isSorted = isSorted && (lastValue >= list[index]);
			lastValue = list[index++];
		}
		
		return isSorted;
	}
}
