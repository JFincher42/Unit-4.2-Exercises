
public class PrintArray {

	public static void main(String[] args) {
		int[] myArray = {17, -3, 42, 8, 16, -4, 9};
		int[] myNewArray = myArray;
		
		printArray(myArray);
		System.out.println(myArray);
//		change(myArray);
//		printArray(myNewArray);

	}
	
	public static void printArray(int[] list) {
		int length = list.length;
		System.out.print("[");
		for (int i=0; i<length-1; i++)
			System.out.print(list[i] + ", ");
		System.out.println(list[length-1] + "]");
	}
	
	public static void change(int[] newList) {
		newList[4] = 1009;
	}

}
