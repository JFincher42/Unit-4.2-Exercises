
public class Reverse {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6};
		reverse(myArray);

		PrintArray.printArray(myArray);
	}

	public static void reverse(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low+=1;
			high-=1;
		}
	}

}
