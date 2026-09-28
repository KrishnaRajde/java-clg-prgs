import java.util.Scanner;
class add
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		int tot=a+b;
		System.out.println("addition of a and b="+tot);
	}
}