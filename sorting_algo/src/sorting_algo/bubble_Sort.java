package sorting_algo;

import java.util.Scanner;

public class bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int flag=0;
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					flag=1;
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	}

}
