import java.util.Scanner;
class stringArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		System.out.println("how many string you want to enter?");
		n=sc.nextInt();

		String str[]=new String[n];

		for(i=0;i<n;i++)
		{
			str[i]=sc.next();
		}

		System.out.println("Entered strings are:");

		for(i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}

		System.out.println("Ascending order");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(str[i].compareTo(str[i])>0)
				{
					System.out.println(str[i]);
				}
			}

		}
	}
}