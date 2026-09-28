class FinallyDemo{
	static void procA(){
		try{
			System.out.println("inside procA");
			throw new RuntimeException("demo");
		}
		finally{
			System.out.println("procAs Finally");
		}
	}
	static void procB(){
		try{
			System.out.println("inside procB");
			return;
		}
		finally{
			System.out.println("proacBs finally");
		}
	}

	static void procC(){
		try{
			System.out.println("inside procC");
		}
		finally{
			System.out.println("procCs finally");
		}
	}

	public static void main(String[] args) {
		try{
			procA();
		}
		catch(Exception e){
			System.out.println("Execution caught");
		}
		procB();
		procC();
	}



}