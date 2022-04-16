package InterviwePrograms.StringPrograms;

import java.util.Arrays;
public class Annagram {
	
	public static void main(String[] args) {
		String s1="ABC";
		String s2="cbd";
			
		String s3=s1.toLowerCase();
		String s4= s2.toLowerCase();
		
		if(s3.length()!=s4.length())
		{
			System.out.println("This Is Not Annagram");
		}
		else
		{
			char[] s5=s3.toCharArray();
			char[] s6=s4.toCharArray();
			Arrays.sort(s5);
			Arrays.sort(s6);
		
			if (Arrays.equals(s5,s6))
			{
				System.out.println("This Is Annagram");
			}
			else
			{
				System.out.println("This is not Annagram");
			}	
		}		
		
	}

}
