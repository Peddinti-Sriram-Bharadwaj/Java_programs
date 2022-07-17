import java.util.Scanner;
import java.util.Arrays;
class MS{

static void MergeSort(int[] arr,int a,int b)
{
	int low=a;
	int high=b;
	if(low<high)
	{
		int mid=(low+high)/2;
		MergeSort(arr,low,mid);
		MergeSort(arr,mid+1,high);
		Merge(arr,low,high,mid);               //  low==high means that the subarray has a single element, so we don't write the case seperately and return the element as it is
	}
}

static void Merge(int[] arr,int a,int b,int c){
	int low=a;
	int high=b;
	int mid=c;
	int i=low;                            // i is used for indexing the left subarray.
	int h=0;                             // h literal is used for indexing the temporary array.
	int j=mid+1;                        // j is used for indexing the right subarray.
	int temp[]=new int[high-low+1];    

	while((i<=mid) && (j<=high))            //merge the sorted subarrays
	{
		if (arr[i]<=arr[j])	
		{
			temp[h++]=arr[i++];
		}
		else
		{
			temp[h++]=arr[j++];
		}
	}

	for(int k=j;k<=high;k++)	//copy the remaining elements of left subarray
	{
		temp[h++]=arr[k];
	}

	for(int k=i;k<=mid;k++)	       // copy the remaining elements of right subarray
	{
		temp[h++]=arr[k];
	}
}

	
  //update the original array with the values of the temp array

	int k=low;                     
	for(int l=0;l<high-low+1;l++)
	{
		arr[k++]=temp[l];}

	}


public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	System.out.println("P. Sriram Bhardwaj");
	System.out.println("Regd.no - 122010308005");
	System.out.println(" ");
	System.out.println("Merge Sort ");
	System.out.println(" ");
	System.out.println("enter the number of elements");
	int n=x.nextInt();
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		System.out.println("enter element "+i);
		arr[i]=x.nextInt();
	}

	System.out.println("before Sorting");
	System.out.println(Arrays.toString(arr));

	MergeSort(arr,0,n-1);
	System.out.println("after Sorting");
	System.out.println(Arrays.toString(arr));

	}
}



