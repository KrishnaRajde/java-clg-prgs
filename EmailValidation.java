import java.util.Scanner;
class EmailValidation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String email;
		email=sc.next();

		

		if(email.indexOf('@')==-1)
		{
			System.out.println("@ is missing");
		}
		else if(email.indexOf('.')==-1)
		{
			System.out.println(". is missing");
		}
		else
		{
			System.out.println("Valid email");
		}
	}
} 