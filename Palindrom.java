package InterviwePrograms;
public class Palindrom {
	public static void main(String[] args) {
		int num = 141;
		int temp = num;
		int rev = 0;
		int rem=0;
		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println("No is Palindrom :" + num);
		} else {
			System.out.println("No is Not Palindrom :" + num);

		}
	}

}
