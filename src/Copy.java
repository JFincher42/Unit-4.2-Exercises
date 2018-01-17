
public class Copy {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int[] myNewArray = copy(myArray);

		PrintArray.printArray(myNewArray);
		System.out.println("myArray = " + myArray);
		System.out.println("myNewArray = " + myNewArray);
	}

	public static int[] copy(int[] arr) {
		int[] newArray=new int[arr.length];
		for (int i=0;i<arr.length;i++)
			newArray[i]=arr[i];
		return newArray;
	}
	
}
