
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {8, 7, 19, 82, 8, 7, 8};
		System.out.println("Count(list,8) = " + count(list, 8));
		//System.out.println("CountForEach(list,8) = " + countForEach(list, 8));
	}

	public static int count(int[] list, int target) {
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				count++;
			}
		}
		return count;
	}
	
	public static int countForEach(int[] list, int target) {
		int count = 0;
		for (int n : list)
			if (n==target) count++;
		return count;
	}

}
