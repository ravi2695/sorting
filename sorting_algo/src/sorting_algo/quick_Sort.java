package sorting_algo;

import java.util.Scanner;

public class quick_Sort {
	
	static void quicksort(int a[],int start,int end)
	{
		if(start<end)
		{
			int index=partition(a,start,end);
			quicksort(a,start,index-1);
			quicksort(a,index+1,end);
			
		}
	}
	static int partition(int[] a, int start, int end) 
	{
		int pivot=a[end];
		int index=start;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			index++;
			}
		}
		int temp=a[index];
		a[index]=a[end];
		a[end]=temp;
		return index;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		quicksort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}

}
