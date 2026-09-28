import java.util.Scanner;
class array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("enter the array size:");
		size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		int b[]={1,2,3,4,5,6,7,8,9}

	}
}