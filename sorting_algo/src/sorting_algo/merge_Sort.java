package sorting_algo;

import java.util.Scanner;

public class merge_Sort {
	
	static void merge(int left[],int right[],int a[])
	{
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length&&j<right.length)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			a[k]=right[j];
			j++;
			k++;
		}
		
	}
	
	static void mergeSort(int a[])
	{
		int len=a.length;
		
		if(len<2)
			return;
		int mid=len/2;
		int left[]=new int[mid];
		int right[]=new int[len-mid];
		
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<len;i++)
			right[i-mid]=a[i];
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		mergeSort(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	}

}
