package valtech.junit5.valtech_junit5;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.valtech.training.valtech.junit5.Arithmetic;
import com.valtech.training.valtech.junit5.ArithmeticImpl;

public class ArithmeticImplTest {
	
	private Arithmetic arithmetic;
	
	
	@BeforeEach
	public void runBefore() {
		arithmetic =new ArithmeticImpl();
		System.out.println("Run Before....");
	}
	
	@Test
	public void testafterTest() {
		arithmetic = new ArithmeticImpl();
		System.out.println("Run After...");
	}
	
	@Test
	public void testHello() {
		System.out.println("Hello");
	}
	
	@Test
	public void testHi() {
		System.out.println("Hi");
	}

}
