import java.util.Scanner;
class Bmi
{
	String name;
	double weight,height;

	void setBmi()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,height and weight");
		name=sc.next();
		weight=sc.nextDouble();
		height=sc.nextDouble();
	}
	void getBmi()
	{
		System.out.println("weight:"+weight);
		System.out.println("height:"+height);
	}
	void calBmi()
	{
		double bmi=weight/(height*height);
		System.out.println("bmi:"+bmi);

		if(bmi<18.5)
		{
			System.out.println("underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("Healthy wieght");

		}
		else if(bmi>=25 && bmi<=29.9)
		{
			System.out.println("overweight");
		}
		else
		{
			System.out.println("obese");
		}

	}


}

class mBmi
{
	public static void main(String[] args) {
		Bmi myBmi=new Bmi();
		myBmi.setBmi();
		myBmi.getBmi();
		myBmi.calBmi();
	}
}