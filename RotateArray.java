import java.util.Scanner;
class RotateArray

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the count that array should be rotate:");
		int n=sc.nextInt();
		for(int x=1;x<=n;x++)
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		System.out.println("After"+n+ "rotations the array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		