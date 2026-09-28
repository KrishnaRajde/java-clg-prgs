class Box
{
	double width,height,depth;

	Box(){}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	void getBox()
	{
		System.out.println("Wdith:"+width);
		System.out.println("height:"+height);
		System.out.println("Depth:"+depth);
	}
	double volume()
	{
		return width*height*depth;
	}
}

class BoxWeight extends Box
{
	double weight;
	BoxWeight(double w,double h,double d,double m)
	{
		
		super(w,h,d);
		weight=m;
	}
}

class BoxWeightMain
{
	public static void main(String[] args) {
		BoxWeight mybox1=new BoxWeight(10,20,15,34.3);

		mybox1.getBox();
		double v=mybox1.volume();
		System.out.println("Volume:"+v);
		System.out.println("weight:"+mybox1.weight);

	}
}