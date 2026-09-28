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
		this.weight=m;
	}
	void getBoxWeight()
	{
		getBox();
		System.out.println("Weight:"+weight);
	}
}
class Shipment extends BoxWeight
{
	double cost;

	Shipment(double width,double height,double depth,double weight,double cost)
	{
		super(width,height,depth,weight);
		this.cost=cost;
	}
	void getShipment()
	{
		getBoxWeight();
		System.out.println("Cost:"+cost);
	}
}

class Multilevel
{
	public static void main(String[] args) {
		//BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
		Shipment s1=new Shipment(10,20,15,34.2,200);
		//mybox1.getBox();
		double v=s1.volume();
		s1.getShipment();
		System.out.println("Volume:"+v);
		

	}
}