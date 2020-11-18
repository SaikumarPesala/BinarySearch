import java.util.*;
public class stringcheck {
	public boolean solve(String s) {
		int len=s.length();
		if(len==0)
		{
			return true;
		}
		else {
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					return false;
				}
			}
		}
		}
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter desired String: ");
		str=sc.next();
		stringcheck sck = new stringcheck();
		System.out.println(sck.solve(str));

	}

}
