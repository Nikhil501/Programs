package InterviwePrograms;

public class FibSeires {

	public static void main(String[] args) {
		int n=5;
		int n1=0;
		int n2=1;
		
		for (int i = 0; i < n; i++) {			
			System.out.println(n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
	}

}
