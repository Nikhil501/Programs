package InterviwePrograms;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
int num;
int sum;
int temp;
int n;

Scanner s = new Scanner(System.in);
System.out.println("Enter No :");
num=s.nextInt();
sum=0;
temp=num;
while (num>0) {
	n=num%10;
	num=num/10;
	sum=sum+n*n*n;
}
if (temp==sum) {
	System.out.println("No is Armstrong :" +temp);
	
} else {
	System.out.println("No is Not Armstrong :" +temp);

}
}
}
