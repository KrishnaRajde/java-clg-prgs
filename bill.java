import java.util.Scanner;
class electricityBil
{
	int Cno;
	String name;
	double units;

	void setBill()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,Consumer nuumber and units");
		name=sc.next();
		Cno=sc.nextInt();
		units=sc.nextDouble();
	}
	void getBill()
	{
		System.out.println("name:"+name);
		System.out.println("consumer number:"+Cno);
		System.out.println("Units consumed:"+units);
	}

	double calBill()
	{
		double bill;
		if(units<=200)
		{
			bill=units*50;
		}
		else if(units>=201 && units<=400)
		{
			bill=100+(units-200)*0.65;
		}
		else if(units>=401 && units<=600)
		{
			bill= 230+(units-400)*0.80;
		}
		else
		{
			bill=390+(units-600)*1;
		}

		double fBill,cgst,sgst;
		cgst=0.02*bill;
		sgst=0.03*bill;
		fbill=bill+cgst+sgst;

		return fbill;






	}
}