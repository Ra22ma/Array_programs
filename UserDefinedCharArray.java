import java.util.Scanner;
class UserDefinedCharArray

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		char[]a=new char[size];
		System.out.println("Enter array elements one by one:");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		System.out.println("The array elements are:");
		for(int i=0;i<=a.length-1;i++)
		
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
}
