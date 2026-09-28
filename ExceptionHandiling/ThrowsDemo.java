import java.io.*;
class ThrowsDemo{
	static void throwException()// throws IOException
	{
		throw new IOException();
	}
	public static void main(String args[]) throws IOException
	{
		//try{
		//	throwException();
		//}
		//catch(IOException i){
		//System.out.println("caught"+i);
		//}
	}
}