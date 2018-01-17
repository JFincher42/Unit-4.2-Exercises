
public class Remove {
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int[] myNewArray = remove(myArray,3);
		int[] myOtherArray = remove(myArray,6);

		PrintArray.printArray(myNewArray);
		PrintArray.printArray(myOtherArray);
	}

	public static int[] remove(int[] arr, int item) {
		if (IndexOf.indexOf(arr, item)!=-1) {
			int[] newArray=new int[arr.length-1];
			int count=0;
			for (int n: arr) {
				if (n!=item)
					newArray[count++]=n;
			}
			return newArray;
		}
		return arr;
	}

}
