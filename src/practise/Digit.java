package practise;

public class Digit {
	public static void main(String[] args) {
		String intput = "1234567890";
		if ("input".matches("^[0-5|6-9]+$")) {
			System.out.println("valid no /digit");
		} else
			System.out.println("invalid no/digit");
	}

}
