
public class RemoveDupes {

	public static void main(String[] args) {
		int[] myArray = { 1,2,3,4,5 };
		int[] myNewArray = { 1,2,2,3,1,4,4,3 };
		int[] myCleanArray = removeDupes(myArray);
		int[] myCleanNewArray = removeDupes(myNewArray);

		PrintArray.printArray(myCleanArray);
		PrintArray.printArray(myCleanNewArray);
		
	}
	
	public static int[] removeDupes(int[] arr) {
		// If the array length is 1 or less, just return it
		if (1>=arr.length) return arr;
		
		// Create a temporary array to hold the unique elements
		int[] tempArray = new int[arr.length];
		// How many new items were added?
		int count = 1;
		// Move the first item over
		tempArray[0]=arr[0];
		// Loop over the rest
		for (int i=1; i<arr.length; i++) {
			// If this item isn't in the array already, add it 
			if (-1==IndexOf.indexOf(tempArray, arr[i]))
				tempArray[count++] = arr[i];
		}
		
		// If every item was unique, just return the new array
		if (count==arr.length) return tempArray;
		
		// Otherwise, make another new array of the right size and move it over
		int[] returnArray=new int[count];
		for (int i=0; i<count; i++) returnArray[i]=tempArray[i];
		return returnArray;
	}
}
