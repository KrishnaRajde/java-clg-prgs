import java.util.Scanner;
class InvalidMarksException extends Exception{
	private int marks;

	InvalidMarksException(int m){
		marks=m;
	}

	public String toString(){
		return "invalid marks "+marks+" it should be between 0 to 100";
	}
}

class MarksExceptionTest{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String name;
		int id,marks;

		System.out.println("enter name: ");
		name=sc.next();
		System.out.println("enter student id: ");
		id=sc.nextInt();
		 try{
		 	System.out.println("enter marks (should be betweeen 0 to 100): ");
		 	marks=sc.nextInt();
		 	if(marks<0 || marks>100){
		 		throw new InvalidMarksException(marks);
		 		
		 	}
		 }
		 catch(InvalidMarksException e){
		 	System.out.println(e);

		 }

		
	}
}