import java.util.Scanner;
class OddIndexOfArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(a[i]+" ");
			}
		}

	}
}