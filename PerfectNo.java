package InterviwePrograms;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter No");
		int no=s.nextInt();
		
		int temp=no;
		int sum=0;
		
		for (int i = 1; i <no; i++) {
			if (no%i==0) {
				sum=sum+i;
			}	
			
		}
		System.out.println("sum" +sum);
		if (temp==sum) {
			System.out.println("No is Perfect:");
		} else {
             System.out.println("No is Not Perfect:");
		}
	}

}
