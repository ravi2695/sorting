package sorting_algo;

import java.util.Scanner;

public class insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
//		my code school logic
		
			for(int i=1;i<n;i++)
			{
				int value=a[i];
				int hole=i;
				while(hole>0&&a[hole-1]>value)
				{
					a[hole]=a[hole-1];
					hole-=1;
				}
				a[hole]=value;
			}
		
		
//		my logic 
		
//		for(int i=1;i<n;i++)
//		{
//			int value=a[i];
//			for(j=i-1;j>=0;j--)
//			{
//				if(value<a[j])
//					a[j+1]=a[j];
//				else
//					break;
//			}
//			a[j+1]=value;
//			
//		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}

}
