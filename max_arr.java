import java.util.Scanner;
import java.util.Arrays;
class Max_arr{
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

		for(int i=0;i<n;i++)
		{
			System.out.println("enter element - "+i);
			arr[i]=x.nextInt();
		}

		System.out.println("the array is ");
		System.out.println(Arrays.toString(arr));


		int maximum=arr[0];

		for(int i=1;i<n;i++)
		{
			if(arr[i]>maximum){
			maximum=arr[i];
		}
	}

		System.out.println("the maximum element is "+maximum);
	}
}

