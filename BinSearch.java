import java.util.Scanner;
import java.util.Arrays;
class BinSrch{
	static int Bin(int[] a,int i,int l,int target)              //  i,l are indices of the first and last elements of the subarray respectively
	{

		if(l==i)                                              // reached the end of search operations.
		{
			if (target==a[i])
			{
				return a[i];
			}
			else	
			{
				return -1;	                              // element not found
			}
		}

		else
		{
			int mid=(i+l)/2;                                 
			if (target==a[mid])                                 //target element found
			{
				return mid;
			}

			else if(target<a[mid])	                           // target element smaller than the mid element, so search the left subarray
			{
				return Bin(a,i,mid-1,target);
			}

			else
				return Bin(a,mid+1,l,target);                // target element larger than the mid element, so search the right subarray
		}


	}

public static void main(String[] args)
{
	Scanner x=new Scanner(System.in);
	System.out.println(" Name - P.Sriram Bhardwaj ");
	System.out.println(" Regd.no - 122010308005 ");
	System.out.println("");
	System.out.println("program execution begins here");
	System.out.println("");

	System.out.println("enter the number of elements in the array");
	int n=x.nextInt();	
	int[] arr=new int[n];

	for(int i=0;i<n;i++)
	{
		System.out.println("enter element "+i);
		arr[i]=x.nextInt();
	}
	System.out.println("the original array is :");
	System.out.println(Arrays.toString(arr));

	System.out.println(" enter the target element : ");
	int target=x.nextInt();

	int i=0;
	int l=arr.length-1;

	int result=Bin(arr,i,l,target);
	if(result!=-1)
	{
		System.out.println("the target is found at position "+result);
	}
	else
	{
		System.out.println("the target is not found ");
	}


	}
}








