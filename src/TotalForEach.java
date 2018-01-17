
public class TotalForEach {

	public static void main(String[] args) {
		int[] list = {10, 22, 3, 16, 3, 21, 47};
		System.out.println("Total = " + totalForEach(list));
		System.out.println("Total = " + totalForEach(list));
	}
	
	public static int totalForEach(int[] inArray) {
		int sum = 0;
		for (int value: inArray) {
			System.out.println(value);
			sum += value;
			value = value*2;
		}
		return sum;
	}

}
