package InterviwePrograms;

import java.util.Scanner;
public class PrimeNo {
public static void main(String[] args) {	
Scanner s = new Scanner(System.in);
System.out.println("Enter No");
int no=s.nextInt();
int temp=0;
for (int i = 2; i <= no-1; i++) {
	if (no%i==0) {
		temp++;		
		break;
	}
}
if (temp==0) {
	System.out.println("No is Prime:" +no);
} 
else {
	System.out.println("No is Not Prime:" +no);
}
	}

}
