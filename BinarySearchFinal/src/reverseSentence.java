import java.util.*;
public class reverseSentence {
	public String solve(String sentence)
	{
		String[] a=null;
		String output="";
		a=sentence.split(" ");
		for(int i=a.length-1; i>=0; i--)
		{
			output=output+a[i];
			if(i!=0)
			{
				output=output+" ";
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		reverseSentence rs = new reverseSentence();
		System.out.println(rs.solve(inputString));
		
		
	}

}
