import java.util.Scanner;
class Box{
	double width,height,depth;

	Box()
	{
		width=1.0;
		height=2.0;
		depth=3.0;
	}
	//Box(){}
	Box(double dim)
	{
		width=height=depth=dim;
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}

	double volume(){
		return width*height*depth;
	}
}
class BoxDemoC{
	public static void main(String args[]){
		Box b1=new Box();
		System.out.println("volume of b1:"+b1.volume());
		Box b2=new Box(1.5,2.5,3.5);
		System.out.println("volume of b2:"+b2.volume());
		Box b3=new Box(5.0);
		System.out.println("volume of b3:"+b3.volume());

	}
}