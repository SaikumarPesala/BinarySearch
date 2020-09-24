import java.util.*;
public class repeatAdd {
	
	public int solve(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		if(sum>=10)
			return solve(sum);
		else
			return sum;
	}
	public static void main(String[] args) {
		repeatAdd ra = new repeatAdd();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		System.out.println(ra.solve(n));

	} 
}
