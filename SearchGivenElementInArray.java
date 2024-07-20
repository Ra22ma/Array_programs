import java.util.Scanner;
class SearchGivenElementInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int n=sc.nextInt();
		boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
