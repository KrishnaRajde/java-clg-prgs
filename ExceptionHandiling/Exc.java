class Exc{
	public static void main(String[] args) {
		try{
			int d=0;
			int a=42/d;
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero");
			System.out.println(e);
		}
		System.out.println("End of program");
	}
}