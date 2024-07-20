import java.util.Scanner;
class ReverseOfArray
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the sizeof array:");
			int size=sc.nextInt();
			int[]a=new int[size];
			System.out.println("Enter the array elements:");
			for(int i=0;i<a.length;i++)
		{
				a[i]=sc.nextInt();
		}
		int swappingcount=(a.length)/2;
		int x=0;
		int y=a.length-1;
		for(int i=1;i<=swappingcount;i++)
		{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
		System.out.println("Array after reverse:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}