class GrossSal
{
	public static void main(String[] args) {
		double gsal,hra,da,ta;
		int empC,bsal=10000;
		hra=0.38*bsal;
		da=0.75*bsal;
		ta=0.13*bsal;
		gsal=bsal+hra+ta+da;
		System.out.println("Gross Salary="+gsal);
	}
}