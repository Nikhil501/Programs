package InterviwePrograms;
import java.util.Iterator;
public class StringCount {
	
	public static void main(String[] args)
	{
		 String s ="Hello welcome java java";
		 String[] word=s.split(" ");
		 int count =0;
		 
	for(int i=0; i<word.length; i++)
	{
count =1;		
for (int j = 0; j < word.length; j++) {
	
	if (word[i].equals(word[j])) {
		count++;		
	}	
}


	}	
		System.out.println("total no=:" +count);	
	}

	}

