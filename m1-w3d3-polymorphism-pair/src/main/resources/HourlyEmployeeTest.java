import static org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.HourlyEmployee;

public class HourlyEmployeeTest {
	private HourlyEmployee testHourly;
	@Before
	public void setUp() {
		testHourly = new testHourly()
	}

	@Test
	public void initialization_values_are_stored_correctrly(){

	String  firstName= testHourly.getFirstName();
	String fullName = testHourly.getNAme();
//	int hoursWorked = HourlyEmployee.getHoursWorked();
	double Rate = testHourly.getRate();
//	double weekLypay = HourlyEmployee.getPay();


	Assert.assertEquals("Biil", firstName);
	Assert.assertEquals("Bill Smith", fullName);
	Assert.assertEquals(50, Rate);

	}
	@Test
	public void test_weekly_pay(){
		//boolean success = elevator.GoUp(6);
		testHourly.weeklyPay();
		

		
		Assert.assertEquals(6,  currentLevel);
	}
	@Test
	public void test_full_name(){
		String success = testHourly.getName();
		Assert.assertTrue("Did not get Full Name", success);
	}

}
