import java.util.Scanner;
import java.util.Arrays;

class dijkstra
{
	static void updating(double[] paths, double[][] given, int selected, int n)                   //given is the list of path lengths from the source node to all other nodes.
	{
		for(int i=0;i<n;i++)
		{	
			double temp=paths[selected]+given[selected][i];                               // exploring the paths with the selected vertex as intermediary           
			if(temp<paths[i])                                                            // path through selected vertex is shorter, so update the paths list.                                                 
			{	 
				paths[i]=temp;
			}
		}
		System.out.println(Arrays.toString(paths));
	}


	static void dijkstras(double[] paths, double[][] given, int n,int[] visited)                  // call this function to select the nearest unvisited node from the source vertex
	{	
		double inf=Double.POSITIVE_INFINITY;
		int selected=0;
		double min=inf;
 
		for(int i=1;i<n;i++)                                                                 
		{
			if(paths[i]<=min && visited[i]==0)                                     
			{
				min=paths[i];                          
				selected=i;
			}
		}
		visited[selected]=1;
		System.out.print("selected vertex - ");
		System.out.print(selected+" ");
		updating(paths, given, selected, n);                                                   // call the funciton to update the paths with selected vertex as the intermediary
	}

	
	static void calling(double[] paths, double[][] given,int[] goal, int n,int[] visited)        // call the function until all the vertices have been explored 
	{
		while(Arrays.equals(visited,goal)==false)
		{
			dijkstras(paths, given, n, visited);
		}
	}

	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("P. Sriram Bhardwaj");
		System.out.println("Regd.no - 122010308005");
		System.out.println(" ");
		System.out.println("Dijkstra's algorithm");
		System.out.println(" ");
		System.out.println("enter the number of elements");
		int n=x.nextInt();
		double inf=Double.POSITIVE_INFINITY;
		double[][] given=new double[n][n];                                                   // adjacency matrix with all the path lengths
		
		for(int i=0;i<n;i++)
		{
			double[] temp=new double[n];
			for(int j=0;j<n;j++)
			{
				System.out.println("enter element "+i+" "+j);
				double d=x.nextDouble();
				if(d==0)
				{
					if(i==j)
					{
						temp[j]=d;
					}
					else
					{
						temp[j]=inf;                                               // if no edge exists between node i and node j, take it to be infinity
					}
				}
				else
				{
					temp[j]=d;
				}
			
			}
			given[i]=temp;
		}

		System.out.println("select the source vertex");
		int source=x.nextInt();
		double[] paths=given[source];                                                              // list of paths from the source vertex
		int[] goal=new int[n];                                                                    // initialize the goal state.
		int[] visited=new int[n];                                                                // a boolean list of visited vertices
		for(int i=0;i<n;i++)
		{
			goal[i]=1;
			visited[i]=0;
		}
		visited[source]=1;
		System.out.println("before calling");                                                


		for(double[] i:given)
		{	
			System.out.println(Arrays.toString(i));                                         // print the adjacency list
		}
		System.out.println(Arrays.toString(paths));                                           // print the adjacency vector paths from source vertex
		
		System.out.println("after calling");
		calling(paths,given,goal,n,visited);
		System.out.println(Arrays.toString(paths));                                          
		
	}
}


		
		

		
		
		

			
		
		
		
				
					
				
				
				
				

	
			

		
		