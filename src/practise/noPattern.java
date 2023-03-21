package practise;

public class noPattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}

class noPattern2 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}

class noPattern3 {
	public static void main(String[] args) {
		int n = 5;
		int counter = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();

		}
	}
}

class noPattern4 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");

			}

			System.out.println();
		}
	}}

	