import java.util.Scanner;

public class Integer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner xxx = new Scanner(System.in); 
		System.out.println("Enter number with 3 characters: ");
			int h = xxx.nextInt();
			xxx.close(); 
			int res = (h%10)*100+h/10;	
		System.out.println("Change="+res);
	}

}
