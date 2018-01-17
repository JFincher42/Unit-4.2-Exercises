
public class TwoDForEach {

	public static void main(String[] args) {
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for (int n[]:nums)
			for (int n1: n)
				sum+=n1;
		System.out.println(sum);
	}

}
