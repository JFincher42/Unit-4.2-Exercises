
public class AsYouArrive {

	public static void main(String[] args) {
		int[] data = new int[5];
		
		data[0] = -7;
		data[1] = -1;
		data[2] = -13;
		data[3] = -24;
		data[4] = -6;

//		int[] data = {7, -1, 13, 24, 6};

		int max = data[0];
		for (int i=0; i<data.length; i++)
			if (data[i]>max)
				max = data[i];

		System.out.println(max);

	}

}
