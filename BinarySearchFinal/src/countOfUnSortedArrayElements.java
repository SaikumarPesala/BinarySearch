import java.util.Scanner;

public class countOfUnSortedArrayElements {
	public int arraySort(int[] nums) {
		int len = nums.length,temp=0,count=0;
		int arr2[] = new int[len];
		for(int i=0;i<len;i++)
		{
			arr2[i]=nums[i];
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(nums[i]>nums[j])
				{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			if(nums[i]!=arr2[i])
			{
				count++;
			}
		}
		return len-count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0, n = 0, temp = 0, j = 0, sum=0;
		System.out.println("Enter no.of elements in array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements: ");
		for (i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		countOfUnSortedArrayElements cs = new countOfUnSortedArrayElements();
		System.out.println(cs.arraySort(a));		
	}
}
//[462, 594, 396, 132, 330, 528, 66, 198, 264, 0]