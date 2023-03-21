package practise;

public class abhi

{
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, -6, 3, -4, -10, -20 };

		System.out.println("positive");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("negative:");

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println(a[i]);
			}
		}
	}
}