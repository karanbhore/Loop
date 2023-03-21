package practise;
class Demo {
		public static void main(String[] args) {
			int n = 5;
			for (int i = 1; i <= n; i++) {
				for (int j = i; j >=1 ; j--) {
					System.out.print(1+" ");

				}
				System.out.println();
			}
			
		}
	}

class Demo1{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
class Demo2{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


