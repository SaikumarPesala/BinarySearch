import java.util.*;
public class primeFactorization {
public int[] solve(int n) {
        int arr[]=null;
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int num=0;System.out.println("Enter a number: ");
		num=sc.nextInt();
		int sum=0,i=0;
		for(i=2;i<num;i++)
		{
			while((num%i)==0)
			{
				num=num/i;
				sum++;
				a.add(i);
			}
		}
		if(num>2)
		{
			sum++;
			a.add(num);
		}
		System.out.println("Factors count: "+sum);
		int arr[] = new int[a.size()];
		Iterator<Integer> iterator = a.iterator();
	    for (i = 0; i < arr.length; i++)
	    {
	    	arr[i] = iterator.next().intValue();
	    }
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
	  
}
