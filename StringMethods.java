import java.util.Scanner;
class StringMethods
{
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		char chars[]={'a','b','c'};
		String s=new String(chars);
		System.out.println(s);
		String str="hello friends";
		System.out.println(str.length());

		String s1="hello";
		String s2="sir";
		String s3=s1.concat(s2);
		System.out.println(s3);


		String str4="sbmp it";
		System.out.println(str4.charAt(3));


		char grade;
		System.out.println("enter the grade");

		grade=sc.next().charAt(0);

		System.out.println("Entered Grade:"+grade);

		String  str5="hello";

		System.out.println(str5.lastIndexOf("l")); 



		String str6="Hello Sir";

		char ch[]=str6.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}

		String s10="hello";
		String s11="Hello";

		boolean b=s10.equals(s11);
		System.out.println(b);
		System.out.println(s10.equalsIgnoreCase(s11));
		System.out.println(s10.equals(s11));

		String s12="therf";
		String s13="there";

		 int a=s12.compareTo(s13);

		// System.out.println(a); //s12-s13  67-68

		 System.out.println(s12.compareTo(s13));

		 if(s12.compareTo(s13)>0)
		 {
		 	System.out.println("String 1 greater than String 2");
		 }
		 else if(s12.compareTo(s13)==0)
		 {
		 	System.out.println("Both the strings are same");
		 }
		 else
		 {
		 	System.out.println("String 2 greater then string 1");
		 }





	}
}