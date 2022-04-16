package InterviwePrograms;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {

		int[] ar= {3,5,7,1,9,2};		
//		Arrays.sort(ar);
//		System.out.println(Arrays.toString(ar));
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j =i+1; j < ar.length; j++) {
				if (ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]);
		}
	}

}



