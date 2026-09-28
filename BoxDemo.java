import java.util.Scanner;
class Box
{
	double width,height,depth;

	void setBox()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter width,height and depth");
		width=sc.nextDouble();
		height=sc.nextDouble();
		depth=sc.nextDouble();
	}
	void getBox()
	{
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("depth:"+depth);
	}

	double volume()
	{
		double vol=width*height*depth;
		return vol;
	}
}

class BoxDemo
{
	public static void main(String[] args) {
		Box mybox=new Box();
		mybox.setBox();
		mybox.getBox();
		double v=mybox.volume();
		System.out.println("volume:"+v);
		
	}
}                                                                                                