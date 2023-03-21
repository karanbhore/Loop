package practise;

public class ReverseMuliplication {
	public static void main(String[] args) {
		int i, n = 10, prod = 1;

		for (i = n; i >= 1; i--) {
			prod = prod * i;

		}
		System.out.println(prod);
	}

}
