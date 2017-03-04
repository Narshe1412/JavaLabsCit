package test;
import static org.junit.Assert.*;
import org.junit.Test;
import controller.CarController;
import model.Car;

public class CarTest {

	@Test
	public void testAddCar() {
		CarController Test1 = new CarController();
		assertEquals(Test1.addCar("ford", "mondeo", 1900, true), true) ;
	}

	@Test
	public void testMaxNumberOfCars(){
		CarController Test2 = new CarController();
		for (int i=0; i<Test2.MAX_INVENTORY; i++) {
			assertEquals(Test2.addCar("Ford", "mondeo", 1900, true), true);
		}
	}
	
	@Test
	public void testOverMaxNumberOfCars(){
		CarController Test3 = new CarController();
		for (int i=0; i<Test3.MAX_INVENTORY; i++) {
			assertEquals(Test3.addCar("Ford", "mondeo", 1900, true), true);
		}
		assertEquals(Test3.addCar("Ford", "mondeo", 1900, true), false);
	}
	
	@Test
	public void noMakeIncluded(){
		CarController Test4 = new CarController();
		assertEquals(Test4.addCar("", "mondeo", 1900, true), false);
	}
	
	@Test
	public void noModelIncluded(){
		CarController Test5 = new CarController();
		assertEquals(Test5.addCar("Ford", "", 1900, true), false);
	}
	
	@Test
	public void verifyDataHasBeenAdded(){
		CarController Test6 = new CarController();
		Test6.addCar("Ford", "Mondeo", 1990, true);
		
		Car[] carTest = Test6.getCollection();
		
		assertEquals(carTest[0].getMake(), "Ford");
		assertEquals(carTest[0].getModel(), "Mondeo");
		assertEquals(carTest[0].getYear(), 1990);
		assertEquals(carTest[0].isSold(), true);
		
	}
	 
	
}
