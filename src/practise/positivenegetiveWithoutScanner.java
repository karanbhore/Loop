package practise;

public class positivenegetiveWithoutScanner {
	public static void main(String[] args) {

		int[] num = { 10, -60, 30, 50, 60, 70, -30 };

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("+ve numbers");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.println(num[i]);
			}
		}

		System.out.println("-ve num");

		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				System.out.println(num[i]);

			}

		}

	}
}
