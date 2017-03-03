package test;
import static org.junit.Assert.*;
import org.junit.Test;
import controller.CarController;

public class CarTest {

	@Test
	public void testAddCar() {
		CarController Test1 = new CarController();
		assertEquals(Test1.addCar("ford", "mondeo", 1900, true), true) ;
		fail("Not yet implemented");
	}

}
