import java.util.Scanner;
import java.util.Arrays;

class Linear_Search
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);

		System.out.println(" Name - P.Sriram Bhardwaj ");
		System.out.println(" Regd.no - 122010308005 ");
		System.out.println("");
		System.out.println("program execution begins here");
		System.out.println("");


		System.out.println("enter the number of elements :");
		int n=x.nextInt();
		int[] arr=new int[n];
		int m=n-1;

		for(int i=0;i<n;i++)
		{
			System.out.println("enter element - "+i);
			arr[i]=x.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("enter the target element");
		int target=x.nextInt();
		int index=0;
		String result="";

		for(int i=0;i<n;i++)
		{
			if (arr[i]==target)
			{
				index=i;
				result="found";
				break;
			}
		}

		if (result=="found")
		{
			System.out.println("the target is found at position "+index);
		}	

		else
		{
			System.out.println("the target is not found");
		}
	}
}
