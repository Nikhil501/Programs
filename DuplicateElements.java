package InterviwePrograms;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int[] ar= {1,2,3,3,7,7,4,9,1};
//		int count=0;
		for (int i = 0; i < ar.length; i++) {
			
			for (int j =i+1; j < ar.length; j++) {
				if (ar[i]==ar[j]) {
//					count++;
					System.out.println(ar[j]);
//					System.out.println(count);

				}
			}
			
		}
		
	}

}
