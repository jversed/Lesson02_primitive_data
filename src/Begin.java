import java.util.Scanner;

public class Begin {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Vvedite storony kvadrata: ");
		double a = reader.nextDouble(); // Scans the next token of the input as an double.
		reader.close(); // Finished with the scanner to avoid resource leaks.
		double p = a*4;
		double s = Math.pow(a,2);
		System.out.println("Perimtr="+p);
		System.out.println("Ploshad="+s);
	// Tasks begin1-2.
	}

}
