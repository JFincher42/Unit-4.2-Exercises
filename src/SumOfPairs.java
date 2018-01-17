
public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {3,  7,  12,  9,  -5,  0,  3};
		
		sumOfPairs(list);
		System.out.println();
		sumOfPairs2(list);
	}
	
	public static void sumOfPairs(int[] list) {
		for (int i=0; i<list.length-1; i++)
			System.out.print(list[i]+list[i+1] + " ");
	}
	
	public static void sumOfPairs2(int[] list) {
		boolean first = true;
		int sum=0;
		for (int n : list) {
			sum += n;
			if (!first) {
				System.out.print(sum + " ");
				sum = n;
			} else first = false;
		}
	}

}
