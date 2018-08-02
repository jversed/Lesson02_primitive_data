import java.util.Scanner;

public class Begin {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter side of the square: ");
		double a = reader.nextDouble(); // Scans the next token of the input as an double.
		reader.close(); // Finished with the scanner to avoid resource leaks.
		double p = a*4;
		double s = Math.pow(a,2);
		
		System.out.println("Perimeter="+p);
		System.out.println("Area="+s);
		// Tasks begin1-2.
	}

}
