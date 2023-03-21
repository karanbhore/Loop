package practise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of y: ");
        double y = sc.nextDouble();
        double result = Math.pow(x, y);
        System.out.println("Result: " + result);
    }
}
