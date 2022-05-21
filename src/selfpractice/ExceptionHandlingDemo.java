package selfpractice;
import java.util.*;
import java.io.*;

public class ExceptionHandlingDemo {
	public static void main(String args[]) {
		int a,b,c;
		String d = "Abc";
		a = 0;
		b = 1;
		c = 0;
		try {
			System.out.println(Integer.parseInt(d));
		}
		catch(ArithmeticException e) {
			System.out.println("Zero division error");
		}
		catch(Exception e){
			System.out.println("Some other exception");
		}
		finally {
			System.out.println("Error has been handled");
		}
	}
}
