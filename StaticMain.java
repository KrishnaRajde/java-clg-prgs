class StaticDemo
{
	static int a=42;
	static int b=99;
	int c;
	static void callme()
	{
		System.out.println("a="+a);
		sayHello();
	

	}
	static void sayHello()
	{
		System.out.println("helloooo");
		
	}
}

class StaticMain{
	public static void main(String[] args) {
		StaticDemo.callme();
		System.out.println("b="+StaticDemo.b);

	}
}