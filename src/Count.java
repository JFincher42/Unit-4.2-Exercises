
public class Count {

	public static void main(String[] args) {
		int[] list = {8, 7, 19, 82, 8, 7, 8};
		System.out.println(count(list, 8));
	}

	public static int count(int[] list, int target) {
		int targetCount = 0;
		for (int i = 0; i < list.length; i++)
			if (list[i] == target)
				targetCount++;
		return targetCount;
	}

}
