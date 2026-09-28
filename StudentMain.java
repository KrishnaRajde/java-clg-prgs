import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	Person(){}

	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void getPerson()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class Employee extends Person
{
	private int code;
	private double bsal;
	Employee (){}

	Employee(String name,int code,int  bs,int age)
	{
		super(name,age);
		this.code=code;
		this.bsal=bs;

	}
	double Gsal()
	{
		double gsal,da,hra,ta;
		da=0.65*bsal;
		hra=0.35*bsal;
		ta=0.12*bsal;
		gsal=bsal+da+hra+ta;
		return gsal;

	}
	void getEmp()
	{
		getPerson();
		System.out.println("Code:"+code);
		System.out.println("Basic Salary:"+bsal);

	}
}

class  Student extends Person{
	private int roll,m1,m2,m3;

	void getStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name Roll NO and marks of 3 subjects");
		roll=sc.nextInt();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}

	double total()
	{
		return m1+m2+m3;
	}

	double avg()
	{
		double a;
		a=(m1+m2+m3)/3;
		return a;
	}
	double Percantage()
	{
		Scanner sc=new Scanner(System.in);
		int tm;
		double p;
		System.out.println("pls enter the total marks of all 3 subjects");
		tm=nextInt();
	}
}



class EmployeeMain
{
	public static void main(String[] args) {

		Employee e1=new Employee("john",123,1000,18);
		e1.getEmp();
		System.out.println("Gross Salary:"+e1.Gsal());
	}
}