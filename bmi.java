import java.util.Scanner;
public class bmi
{
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter weight:");
		double weight= sc.nextDouble();
		System.out.println("enter height");
		double height=sc.nextDouble();
		double bmi=weight/(height*height);
		System.out.println("bmi="+bmi);

		if(bmi<18.5)
		{
			System.out.println("underweight");
		}
		else if(bmi>18.5 && bmi<24.9)
		{
			System.out.println("Healthy wieght");

		}
		else if(bmi>25 && bmi<29.9)
		{
			System.out.println("overweight");
		}
		else
		{
			System.out.println("obese");
		}



	}
}