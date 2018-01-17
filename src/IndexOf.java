
public class IndexOf {

	public static void main(String[] args) {
		int[] list = {10, 22, 3, 16, 4, 3};
		System.out.println(indexOf(list, 3));
		System.out.println(indexOf(list, 1));
	}
	
	public static int indexOf(int[] inArray, int value) {
		for (int i=0; i<inArray.length; i++) {
			if (inArray[i]==value) {
				return i;
			}
		}
		return -1;
	}

}
