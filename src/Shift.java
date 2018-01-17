
public class Shift {

	public static void main(String[] args) {
		int[] list = {10, 22, 3, 16, 3, 21, 47};
		printArray(list);
		shift(list, true);
		printArray(list);
		shift(list, false);
		shift(list, false);
		printArray(list);
	}

	public static void shift(int[] inArray, boolean right) {
		int length = inArray.length;
		if (right)
		{
			int temp = inArray[length-1];
			for (int i=length-1; i>0; i--)
				inArray[i] = inArray[i-1];
			inArray[0]=temp;
		} else {
			int temp = inArray[0];
			for (int i=0; i<length-1; i++)
				inArray[i] = inArray[i+1];
			inArray[length-1]=temp;
		}
	}

	public static void printArray(int[] inArray) {
		System.out.print("[");
		for (int i=0; i<inArray.length-1; i++) {
			System.out.print(inArray[i] + ", ");
		}
		System.out.println(inArray[inArray.length-1]+"]");
	}
}
