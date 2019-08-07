package sorting_algo;

import java.util.Scanner;

public class selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n-1;i++)
		{
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[index]>a[j])
					index=j;
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}

}
