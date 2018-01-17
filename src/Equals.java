
public class Equals {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {1, 2, 3, 4};
		System.out.println("arr1 = " + arr1);
		System.out.println("arr2 = " + arr2);
		System.out.println(arr1 == arr2);
		System.out.println(equals(arr1, arr2));
		PrintArray.printArray(arr1);
	}


	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length ) return false;

		for (int i = 0; i < list1.length; i++)
			if (list1[i] != list2[i]) return false;
		return true;
	}

}
