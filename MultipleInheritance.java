import java.util.Scanner;
class Student
{
	int id,sem,m1,m2,m3;
	String deciplain;

	void setStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID,Semester,M1,M2,M3 and deciplain(Branch)");
		id=sc.nextInt();
		sem=sc.nextInt();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		deciplain=sc.next();
	}
	void getStudent()
	{
		System.out.println("Id: "+id);
		System.out.println("Semester: "+sem);
		System.out.println("Marks 1:"+m1+" Marks 2: "+m2+" Marks 3: "+m3);
		System.out.println("deciplain(Branch): "+deciplain);

	}

}
interface Sports{
	int getSPoints();
}

class Result extends Student implements Sports{
	int total;

	public int getSPoints()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Have you participate in sports?");
		char ch=sc.next().charAt(0);
		if(ch=='y' || ch=='Y')
		{
			return 10;
		}
		else
		{
			return 0;
		}
		

	}

	void calTotal()
	{
		total=m1+m2+m3+getSPoints();
		//return total;
	}

	void setResult()
	{
		setStudent();
		//getSPoints();
	}
	void getResult()
	{
		getStudent();
		//System.out.println("Sporta points: "+getSPoints());
		System.out.println("Total points: "+total);
	}
}



class MultipleInheritance{
	public static void main(String[] args) {
		Result r=new Result();
		r.setResult();
		r.calTotal();
		r.getResult();
	}
}