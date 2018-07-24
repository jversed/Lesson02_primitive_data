
public class Integer21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int m = 60;// 1 min = 60 sec.
		int n = 35684;//sec we have
		
		int res = n-((n/m)*m);
		int ares = n%60;
		System.out.println("Seconds from the last minute = "+ares);
	}

}
