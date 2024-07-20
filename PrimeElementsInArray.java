import java.util.Scanner;
class PrimeElementsInArray
{
	public static void isPrime(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" ");
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter array elements:");3s
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Prime elements are:");
		for(int i=0;i<a.length;i++)
		{
			isPrime(a[i]);
		}
		System.out.println();
	}
}
