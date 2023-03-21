package practise;

class nPattern {

	public static void main(String args[]) {
		int n = 5;

		// Printing Upper Half of n rows
		// Loop to iterate over each row
		for (int i = 1; i <= n; i++) {
			// i-1 spaces in each row
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Loop to iterate over each column
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Printing Lower Half of n-1 rows
		// Loop to iterate over each row in reverse order
		for (int i = n - 1; i >= 1; i--) {
			// i-1 spaces in each row
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Loop to iterate over each column
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

class npattern5 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

class nPattern6 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}
}

class nPattern7 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}

class nPattern8 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

class nPattern9 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

class nPattern10 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(k);

			}
			System.out.println("");

		}
	}
}

class nPattern11 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
      for(int j=1;j<=n-i;j++) {
    	  System.out.print(" ");
      }
      for(int k=1;k<=i;k++) {
    	  System.out.print("*");
      }
      System.out.println();
	}
}
}

















