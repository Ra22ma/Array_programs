import java.util.Scanner;
class MoveIndexElementsInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int[]b=new int[a.length+1];
		for(int i=0;i<a.length;i++)
		{
			b[i+1]=a[i];
		}
			b[0]=n;
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		

	
	}
}
