abstract class Figure{
	double dim1,dim2;
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
	
}
class rectangle extends Figure
{
	rectangle(double a,double b)
	{
		super(a,b);
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	double area()
	{
		return dim1*dim2;
	}
}
class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return 0.5*dim1*dim2;
	}
}

class AbstractDemo
{
	public static void main(String[] args) {
		//Figure f=new Figure(10,10);
		rectangle r=new rectangle(9,5);
		Triangle t=new Triangle(10,8);

		Figure fr;
		fr=r;
		System.out.println("Area is:"+fr.area());
		fr=t;
		System.out.println("Area is:"+fr.area());
		//fr=f;
		//System.out.println("Area is:"+fr.area());

	}
}