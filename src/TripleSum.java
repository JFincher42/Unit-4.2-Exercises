
public class TripleSum {

	public static void main(String[] args) {
		int[] test = {1,-2,0,5,-1,-4};
		
		tripleSum(test,2);
		System.out.println();
		tripleSum(test,6);
		System.out.println();
		tripleSum(test,3);
		System.out.println();
		tripleSum(test,13);
	}

	public static void tripleSum(int[] list, int target) {
		if (list.length<3) return;
		if (3==list.length)
			if (target == sum(list[0], list[1], list[2]))
				triplePrint(list[0], list[1], list[2]);
		int len = list.length;
		for (int i=0; i<len-2; i++) {
			for (int j=i+1; j<len-1; j++) {
				for (int k= j+1; k<len; k++) {
					if (target == sum(list[i], list[j], list[k]))
						triplePrint(list[i], list[j], list[k]);
				}
			}
		}
	}
	
	public static void triplePrint(int x, int y, int z) {
		System.out.println("[" + x + ", " + y + ", " + z + "]");
	}
	
	public static int sum(int x, int y, int z) {
		return x+y+z;
	}
}
