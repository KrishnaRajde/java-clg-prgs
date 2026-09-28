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
	double gSal()
	{
		double da,hra,ta,gs;
		da=0.75*basicSal;
		hra=0.35*basicSal;
		ta=0.15*basicSal;
		gs=da+hra+ta+basicSal;
		//System.out.println("gross salary:"+gs);
		return gs;

	}


}

class EmployeeArray
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n,i;
		double s,sum=0,avg=0;
		System.out.println("enter the how many employee details you want to enter?");
		n=sc.nextInt();
		employee e[]=new employee[n];

		for(i=0;i<n;i++)
		{
			e[i]=new employee();
			e[i].setEmp();
		}

		for(i=0;i<n;i++)
		{
			e[i].getEmp();
			System.out.println("gross salary:"+e[i].gSal());
			
			sum=sum+e[i].gSal();

		}
		avg=sum/n;

		System.out.println("Sum of all the gross salary:"+sum);
		System.out.println("Average salary of all the employees:"+avg);

		 double max = e[0].gSal();
        for (i = 0; i < n; i++) {
            if (e[i].gSal() > max) {
                max = e[i].gSal();
            }
        }

        double min=e[0].gSal();

        System.out.println("Maximum Salary is: " + max);

		

		



	}
}