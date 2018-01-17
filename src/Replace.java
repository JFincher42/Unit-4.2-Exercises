
public class Replace {

	public static void main(String[] args) {
		int[] list = {10, 22, 3, 16, 3, 21, 47};
		printArray(list);
		replaceAll(list, 3, 99);
		printArray(list);
	}
	
	public static void replaceAll(int[] inArray, int value, int replacement) {
		for (int i=0; i<inArray.length; i++)
			if (inArray[i]==value)
				inArray[i]=replacement;
	}

	public static void printArray(int[] inArray) {
		System.out.print("[");
		for (int i=0; i<inArray.length-1; i++) {
			System.out.print(inArray[i] + ", ");
		}
		System.out.println(inArray[inArray.length-1]+"]");
	}
}
