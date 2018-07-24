import java.util.Scanner;

public class Begin2021 {

	public static void main(String[] args) {
		
		Scanner coordinates = new Scanner(System.in);
		double[] vars = new double[4];
			
			System.out.println("Enter coordinates of points x1 y1 x2 y2: ");
				for(int i = 0; i < 4; i++) 
				vars[i] = coordinates.nextDouble();
				coordinates.close();
			double x1 = vars[0];
			double y1 = vars[1];
			double x2 = vars[2];
			double y2 = vars[3];
			double res = Math.sqrt((Math.pow((x2-x1),2.0)) + (Math.pow((y2-y1),2.0)));
			System.out.println("Distance between them ="+res);
		
		
	}

}
