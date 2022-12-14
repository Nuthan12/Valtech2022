package valtech.junit5.valtech_junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.valtech.training.valtech.junit5.Arithmetic;
import com.valtech.training.valtech.junit5.ArithmeticImpl;



public class ArithmeticImplTest {
	
	private Arithmetic arithmetic;
	private static int ZERO;
	
	
	@Nested
	public class DivisionTest{
		
		private Arithmetic arithmetic;
		
		
		@Test
		public void  testDivideByZero(){
			arithmetic = new ArithmeticImpl();
			assertThrows(ArithmeticException.class,() -> {arithmetic.div(2, ZERO);});
			
		}
	}
	
	@Nested
	@DisplayName("This is for Testing a Sub Method of the Arithmetic")
	public class SubtractionTest {
		
		private Arithmetic arithmetic;
		
		
		@ParameterizedTest
		@CsvSource({
			"'Subtracting 2 Positive Nos',2,3,-1",
			"'Subtracting 2 Negative Nos',-2,-3,1",
			"'Subtracting 1 Positive 1 Negative No',-2,3,-5"
		})
		public void testSub(String name,int a,int b,int res){
			arithmetic =new ArithmeticImpl();
			assertEquals(res, arithmetic.sub(a, b));
		}
		
	}
	
	
	
	@DisplayName("{index} {0} {1} + {2} = {3}")
	@ParameterizedTest
	@CsvSource({
		"'Adding 2 Positive Nos',2,3,5",
		"'Adding 2 Negative Nos',-2,-3,-5",
		"'Adding 1 Positive 1 Negative No',-2,3,1",
	})
	public void testAdd(String name,int a,int b,int res){
		assertEquals(res, arithmetic.add(a, b));
	}
	
	
	public static Stream<Arguments> argumentsForAdd(){
		return Stream.of(Arguments.of(2,3,5),Arguments.of(1,3,4));
	}
	
	
	
	@DisplayName(value="{index}) Testing for add with {0} and {1} should be equals {2}")
	@ParameterizedTest
	@MethodSource("argumentsForAdd")
	public void testAdd(int a,int b,int c){
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,3,4,-1,-2})
	@DisplayName(value="{index}) Testing for add with{0} and 0")
	public void testAdd(int a){
		assertEquals(a,arithmetic.add(a, ZERO));
	}
	
	@Test
	@DisplayName(value="{Generic Test Cases for Add ....")
	public void testAdd(){
		assertEquals(5,arithmetic.add(2, 3));
		assertEquals(5,arithmetic.add(3,2));
	}
	
	@BeforeAll
	public static void executeMeFirst(){
		System.out.println("Before All - Executed First");
		ZERO=0;
	}
	
	@AfterAll
	public static void executeMeJustBeforeProgramExits(){
		System.out.println("Last Method to be Executed");
	}
	
	
	@BeforeEach
	public void runBefore() {
		arithmetic =new ArithmeticImpl();
		System.out.println("Run Before....");
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("Run After...");
//		arithmetic = new ArithmeticImpl();
		
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
