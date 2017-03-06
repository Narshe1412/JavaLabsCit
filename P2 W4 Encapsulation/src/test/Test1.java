package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import model.Calendar;

/*Write one large test which 
Creates the Calendar
Adds three tasks
Checks that there are three tasks in the system.
Remove one task 
Checks that there are two tasks in the system.
Check that toString() from the Calendar return the String you would expect containing all the toString() of all the Task objects contained within the Calendar 
                 (we’ll go through details of this in the lab).
   */
public class Test1 {

	@Test
	public void test() {
		Calendar calendar = new Calendar();
		calendar.addTask("task 1", 3);
		calendar.addTask("task2", 7);
		calendar.addTask("tassk3", 27);
		
		assertEquals(calendar.getTaskCount(), 3);
		
		calendar.removeTask();
		assertEquals(calendar.getTaskCount(), 2);
		
		assertEquals(calendar.toString(), "task 1 3\ntask2 7\n");
	}

}
