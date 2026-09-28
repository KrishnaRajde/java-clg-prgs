import java.util.Scanner;
class employee
{
	String name;
	int id,basicSal;

	void setEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,Employee id and basic salary:");
		name=sc.next();
		id=sc.nextInt();
		basicSal=sc.nextInt();
	}
	void getEmp()
	{
		System.out.println("Name:"+name);
		System.out.println("Employee ID:"+id);
		System.out.println("Basic Salary:"+basicSal);

	}
	void gSal()
	{
		double da,hra,ta,gs;
		da=0.75*basicSal;
		hra=0.35*basicSal;
		ta=0.15*basicSal;
		gs=da+hra+ta+basicSal;
		System.out.println("gross salary:"+gs);

	}
}

class demoEmployee
{
	public static void main(String[] args) {
		employee e=new employee();
		e.setEmp();
		e.getEmp();
		e.gSal();
	}
}