class Complex
{
	int real,img;

	Complex(){}

	Complex(int i,int r)
	{
		real=r;
		img=i;
	}

	Complex addComp(Complex c2)
	{
		Complex temp=new Complex();
		temp.real=this.real+c2.real;
		temp.img=this.img+c2.img;
		return temp;

	}
	void getComplex()
	{
		System.out.println(real+"+"+img);
	}
}

class ComplexMain {

	public static void main(String[] args) {
		Complex c1=new Complex(5,6);
		c1.getComplex();
		Complex c2=new Complex(5,6);
		c2.getComplex();
		Complex c3=c1.addComp(c2);
		c3.getComplex();
		
	}
}