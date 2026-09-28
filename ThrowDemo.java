class ThrowDemo{
	static void demoproc(){
		try{
			throw new NullPointerException();
		}
		catch(NullPointerException e){
			System.out.println("caught inside demoproc");
		}
	}
	public static void main(String[] args) {
		demoproc();
	}
}
		
			
		
	
