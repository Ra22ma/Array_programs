import java.util.Scanner;
class ProductOfAllElementsOfArray
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
		int pro=1;
		for(int i=0;i<a.length;i++)
		{
			pro=pro*a[i];
			
		}
		System.out.println(pro);
	}
}
