package MyPackage;
class Balance{
	String name;
	double bal;

	Balance(String n,double b){
		name=n;
		bal=b;
	}

	void Show(){
		if(bal<0){
			System.out.println("-->");
		}
		System.out.println(name+":$"+bal);
	}
}

class AccountBalance{
	public static void main(String[] args) {
		Balance current[]=new Balance[2];
		current[0]=new Balance("k.j.fielding",123.23);
		current[1]=new Balance("will tell",157.02);
		for(int i=0;i<2;i++){
			current[i].Show();
		}

	}
}